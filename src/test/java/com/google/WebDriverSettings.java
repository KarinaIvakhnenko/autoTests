package com.google;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class WebDriverSettings {
    public static ChromeDriver driver;
    public String value;

    @BeforeClass
    public static void setUp() throws IOException {

        if (System.getProperty("os.name").toLowerCase().contains("mac os x")) {
            Runtime.getRuntime().exec("chmod 755 " + ".//chromedriver");
            }

        if(System.getProperty("os.name").toLowerCase().contains("windows")){
            System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    }

    @AfterClass
    public static void close(){
        driver.quit();
    }
}
