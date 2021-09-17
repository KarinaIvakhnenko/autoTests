package com.google;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver driver;
    public String value;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        driver=new ChromeDriver();
    }

    @After
    public void close(){
        driver.quit();
    }
}
