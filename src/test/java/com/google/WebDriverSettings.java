package com.google;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver driver;
    public String value;

    @Before
    public void setUp(){
        //String driverPath = ".//chromedriver";

        if(System.getProperty("os.name").toLowerCase().contains("windows")){
            System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
        }
        else {
            System.setProperty("webdriver.chrome.driver", ".//chromedriver");
        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void close(){
        driver.quit();
    }
}
