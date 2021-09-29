package com.google;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import resources.WebDriverSettings;


public class SearchTests extends WebDriverSettings {

    public static final String mainGooglePage = "http://www.google.com/";

    @Before
    public void setUp() {
        driver.get(mainGooglePage);
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
    public void testClickOnSearchButton() {
        driver.findElement(By.name("q")).sendKeys("allo.ua");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();

        String currentLink = driver.getCurrentUrl();
        Assert.assertTrue(currentLink.contains("q=allo.ua"));
    }

    @Test
    public void testLinkIsDisplayed() {
        driver.findElement(By.name("q")).sendKeys("allo.ua" + Keys.ENTER);
        WebElement linkAllo = driver.findElement(By.xpath("//div[@class='yuRUbf']//a[@href='https://allo.ua/']"));
        Assert.assertTrue(linkAllo.isDisplayed());
    }

    @Test
    public void testSiteCanBeOpened() {
        driver.findElement(By.name("q")).sendKeys("allo" + Keys.ENTER);
        driver.findElement(By.xpath("//div[@class='yuRUbf']//a[@href='https://allo.ua/']")).click();
        String link = driver.getCurrentUrl();
        Assert.assertEquals("https://allo.ua/", link);
    }
}
