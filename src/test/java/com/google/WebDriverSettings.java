package com.google;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WebDriverSettings {
    public static ChromeDriver driver;
    public String value;

    @BeforeClass
    public static void setUp() throws IOException {

        if (System.getProperty("os.name").toLowerCase().contains("mac os x")) {
            Runtime.getRuntime().exec("chmod 755 " + ".//chromedriver");
        }
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
        } else {
            System.setProperty("webdriver.chrome.driver", ".//chromedriver");
        }
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void close() {
        driver.quit();
    }
}
