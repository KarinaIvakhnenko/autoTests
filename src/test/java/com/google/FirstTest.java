package com.google;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest extends WebDriverSettings {

    @Test
    //1. To check the page is opened that we expect to see
    public void firstTest() {
        driver.get("http://www.google.com/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Google"));
    }

    @Test
    //2. To check that some value could be entered in the searchBox
    public void secondTest(){
        driver.get("http://www.google.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("allo.ua"); //enter value in the searchBox
        value = driver.findElement(By.name("q")).getAttribute("value"); //get value from the searchBox and put it in the variable
        Assert.assertTrue(value.equals("allo.ua")); //check that the field is contained the value we entered

    }

    @Test
    //3. To check that the "Пошук Google" button is clickable
    public void thirdTest(){
        driver.get("http://www.google.com/");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click(); //click on the search button
    }

    @Test
    //4. To check that link to site which we expect to see is displayed after entering value in the searchBox and clicking on the "Пошук Google" button
    public void fourthTest(){
        driver.get("http://www.google.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("allo.ua" + Keys.ENTER);
        driver.findElement(By.linkText("АЛЛО"));
    }

    @Test
    //5. To check that the site which we expect to see can be opened
    public void fifthTest(){
        driver.get("http://www.google.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("allo.ua" + Keys.ENTER); //enter value in the searchBox
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.linkText("АЛЛО")).click(); //to find and open the right site
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Интернет-магазин ALLO.ua - магазин техники и электроники в Украине | Киев, Одесса, Днепр, Харьков")); // to check that opened site it` what we want to see
    }
}
