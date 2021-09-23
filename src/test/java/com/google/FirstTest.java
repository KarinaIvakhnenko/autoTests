package com.google;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class FirstTest extends WebDriverSettings {

    public static final String HTTP_WWW_GOOGLE_COM = "http://www.google.com/";

    @Before
    public void setUp() {
        driver.get(HTTP_WWW_GOOGLE_COM);
    }

    @Test
    public void testTitlePage() {
        String title = driver.getTitle();
        Assert.assertEquals("Google", title);
    }

    @Test
    public void testInputInSearchBox() {
        driver.findElement(By.name("q")).sendKeys("allo.ua");
        String qElementValue = driver.findElement(By.name("q")).getAttribute("value");
        Assert.assertEquals("allo.ua", qElementValue);

    }

    @Test
    public void testButtonIsClickable() {
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
    }

    @Test
    public void testLinkIsDisplayed() {
        driver.findElement(By.name("q")).sendKeys("allo" + Keys.ENTER);
        driver.findElement(By.xpath("//a/h3[text()='Алло']"));
    }

    @Test
    public void testSiteCanBeOpened() {
        driver.findElement(By.name("q")).sendKeys("allo" + Keys.ENTER);
        driver.findElement(By.xpath("//a/h3[text()='Алло']")).click();
        String link = driver.getCurrentUrl();
        Assert.assertEquals("https://allo.ua/", link);
    }
}
