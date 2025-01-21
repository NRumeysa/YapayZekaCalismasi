package com.rumeysablog.hooks;

import com.rumeysablog.utils.DriverManager;
import com.rumeysablog.utils.TestUtils;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestHooks {
    private WebDriver driver;
    private static final Logger logger = LoggerFactory.getLogger(TestHooks.class);

    @Before
    public void setup(Scenario scenario) {
        driver = DriverManager.getDriver();
        logger.info("Senaryo başlıyor: {}", scenario.getName());
        
        // Test bilgilerini rapora ekle
        scenario.log("Test Başlangıç Zamanı: " + java.time.LocalDateTime.now());
        scenario.log("Browser: " + TestUtils.getConfigProperty("browser"));
    }

    @AfterStep
    public void addScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            logger.error("Test adımı başarısız oldu");
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed Step Screenshot");
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        try {
            if (scenario.isFailed()) {
                logger.error("Senaryo başarısız oldu: {}", scenario.getName());
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Failed Scenario Screenshot");
            } else {
                logger.info("Senaryo başarıyla tamamlandı: {}", scenario.getName());
            }
        } finally {
            if (driver != null) {
                DriverManager.quitDriver();
            }
        }
    }
} 