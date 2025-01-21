package com.rumeysablog.steps;

import com.rumeysablog.annotations.TestInfo;
import com.rumeysablog.pages.HomePage;
import com.rumeysablog.utils.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class HomePageSteps {
    private WebDriver driver = DriverManager.getDriver();
    private HomePage homePage = new HomePage(driver);
    private static final Logger logger = LoggerFactory.getLogger(HomePageSteps.class);

    @TestInfo(category = "UI", priority = "High", tags = {"smoke", "regression"})
    @Given("kullanıcı blog anasayfasında")
    public void kullaniciBlogAnasayfasinda() {
        logger.info("Blog anasayfası açılıyor");
        driver.get("file://" + System.getProperty("user.dir") + "/index.html");
    }

    @TestInfo(category = "Doğrulama", priority = "High")
    @Then("kullanıcı {string} ismini görmeli")
    public void kullaniciIsmiGormeli(String expectedName) {
        logger.info("İsim kontrolü yapılıyor: {}", expectedName);
        Assert.assertEquals(expectedName, homePage.getName());
    }

    @Then("kullanıcı {string} ünvanını görmeli")
    public void kullaniciUnvaniGormeli(String expectedTitle) {
        Assert.assertEquals(expectedTitle, homePage.getTitle());
    }

    @Then("kullanıcı aşağıdaki navigasyon linklerini görmeli")
    public void kullaniciNavigasyonLinlkeriniGormeli(List<String> expectedLinks) {
        List<String> actualLinks = homePage.getNavigationLinks();
        Assert.assertEquals(expectedLinks, actualLinks);
    }

    @Then("kullanıcı LinkedIn profil linkini görmeli")
    public void kullaniciLinkedInLinkiniGormeli() {
        Assert.assertTrue("LinkedIn linki görünür olmalı", homePage.isLinkedInLinkVisible());
    }

    @Then("kullanıcı GitHub profil linkini görmeli")
    public void kullaniciGitHubLinkiniGormeli() {
        Assert.assertTrue("GitHub linki görünür olmalı", homePage.isGitHubLinkVisible());
    }

    @When("kullanıcı Hakkımda bölümüne gider")
    public void kullaniciHakkimdaBolumuneGider() {
        homePage.navigateToAbout();
    }

    @Then("kullanıcı yetenekler bölümünü görmeli")
    public void kullaniciYeteneklerBolumunuGormeli() {
        Assert.assertTrue("Yetenekler bölümü görünür olmalı", homePage.isSkillsSectionVisible());
    }

    @Then("kullanıcı deneyim bölümünü görmeli")
    public void kullaniciDeneyimBolumunuGormeli() {
        Assert.assertTrue("Deneyim bölümü görünür olmalı", homePage.isExperienceSectionVisible());
    }

    @Then("kullanıcı eğitim bölümünü görmeli")
    public void kullaniciEgitimBolumunuGormeli() {
        Assert.assertTrue("Eğitim bölümü görünür olmalı", homePage.isEducationSectionVisible());
    }
}
