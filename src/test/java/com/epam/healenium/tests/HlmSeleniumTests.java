package com.epam.healenium.tests;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class HlmSeleniumTests {

    private static WebDriver driver;
    public static final String PROXY_URL = "http://localhost:8085";
    protected String mainPageUrl = "https://elenastepuro.github.io/test_env/index.html";

    @BeforeAll
    static public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        driver = new RemoteWebDriver(new URL(PROXY_URL), capabilities);
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
