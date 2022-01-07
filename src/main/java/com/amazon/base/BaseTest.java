package com.amazon.base;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import java.io.IOException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    String baseUrl;
    String nodeUrl;
    DesiredCapabilities dc;

    @BeforeTest
    public void setUp() throws IOException {

        String browser = "chrome";
        baseUrl = "https://www.amazon.co.uk";
        nodeUrl = "http://192.168.32.5:4444";
        dc = new DesiredCapabilities();
        dc.setPlatform(Platform.WINDOWS);
        dc.setBrowserName(browser);
        driver = new RemoteWebDriver(new URL(nodeUrl), dc);
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }

    @AfterTest
    public void tearDown() {
        //driver.close();
    }

}
