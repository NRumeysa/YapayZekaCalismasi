package com.rumeysablog.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class TestUtils {
    private static Properties properties;

    public static String getConfigProperty(String key) {
        if (properties == null) {
            loadProperties();
        }
        return properties.getProperty(key);
    }

    private static void loadProperties() {
        try {
            properties = new Properties();
            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
            properties.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} 