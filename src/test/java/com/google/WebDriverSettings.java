package com.google;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class WebDriverSettings {
    public ChromeDriver driver;
    public String value;

    @Before
    public void setUp() throws IOException {

        if (System.getProperty("os.name").toLowerCase().contains("mac os x")) {
            Runtime.getRuntime().exec("chmod 755 " + ".//chromedriver");
            }

        if(System.getProperty("os.name").toLowerCase().contains("windows")){
            System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void close(){
        driver.quit();
    }
}
