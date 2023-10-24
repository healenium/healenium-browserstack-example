package com.epam.healenium.tests;

import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class HlmAppiumTests {

    private static WebDriver driver;
    public static final String PROXY_URL = "http://localhost:8085";
    protected String mainPageUrl = "https://elenastepuro.github.io/test_env/index.html";

    @BeforeAll
    static public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        HashMap<String, Object> browserstackOptions = new HashMap<>();
        browserstackOptions.put("osVersion", "16");
        browserstackOptions.put("deviceName", "iPhone 14");
        browserstackOptions.put("local", "false");
        capabilities.setCapability("bstack:options", browserstackOptions);

        driver = new AndroidDriver(new URL(PROXY_URL), capabilities);
    }

    @Test
    public void testXpathSpecialCharacter() {
        driver.get(mainPageUrl);
        driver.findElement(By.xpath("//*[@id='change:name']"));
        driver.findElement(By.id("Submit")).click();
        driver.findElement(By.xpath("//*[@id='change:name']"));
    }

    @AfterAll
    static public void afterAll() {
        if (driver != null) {
            driver.quit();
        }
    }
}
