package com.google;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import resources.WebDriverSettings;

import static org.junit.Assert.*;


public class SearchTest extends WebDriverSettings {

    public static final String mainGooglePage = "http://www.google.com/";

    @Before
    public void setUp() {
        driver.get(mainGooglePage);
    }

    @Test
    public void testTitlePage() {
        String title = driver.getTitle();
        assertEquals("Google", title);
    }

    @Test
    public void testInputInSearchBox() {
        WebElement searchButton = driver.findElement(By.name("q"));
        assertNotNull(searchButton);
        searchButton.sendKeys("allo.ua");
        searchButton = driver.findElement(By.name("q"));
        assertNotNull(searchButton);
        String qElementValue = searchButton.getAttribute("value");
        assertEquals("allo.ua", qElementValue);

    }

    @Test
    public void testClickOnSearchButton() {
        WebElement searchField = driver.findElement(By.name("q"));
        assertNotNull(searchField);
        searchField.sendKeys("allo.ua");
        WebElement searchButton = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
        assertNotNull(searchButton);
        searchButton.click();

        String currentLink = driver.getCurrentUrl();
        assertTrue(currentLink.contains("q=allo.ua"));
    }

    @Test
    public void testLinkIsDisplayed() {
        WebElement searchField = driver.findElement(By.name("q"));
        assertNotNull(searchField);
        searchField.sendKeys("allo.ua" + Keys.ENTER);
        WebElement linkAllo = driver.findElement(By.xpath("//div[@class='yuRUbf']//a[@href='https://allo.ua/']"));
        assertNotNull(linkAllo);
        assertTrue(linkAllo.isDisplayed());
    }

    @Test
    public void testSiteCanBeOpened() {
        WebElement searchField = driver.findElement(By.name("q"));
        assertNotNull(searchField);
        searchField.sendKeys("allo" + Keys.ENTER);
        WebElement linkAllo = driver.findElement(By.xpath("//div[@class='yuRUbf']//a[@href='https://allo.ua/']"));
        assertNotNull(linkAllo);
        linkAllo.click();
        String link = driver.getCurrentUrl();
        assertEquals("https://allo.ua/", link);
    }
}
