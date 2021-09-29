package com.webdriveruniversity.pages.main;

import com.webdriveruniversity.resources.WebDriverSettings;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import com.webdriveruniversity.resources.SwitchTabs;


public class ElementsAreDisplayed extends WebDriverSettings {
    public static final String HTTPS_WEBDRIVERUNIVERSITY_COM = "https://webdriveruniversity.com";

    SwitchTabs sTabs = new SwitchTabs();

    @Before
    public void setUp() {
        driver.get(HTTPS_WEBDRIVERUNIVERSITY_COM);
    }

    @Test
    public void pageIsCorrect() {
        String title = driver.getTitle();
        Assert.assertEquals("WebDriverUniversity.com", title);
    }

    @Test
    public void section_ContactUs() {
        driver.findElement(By.xpath("//a[@id='contact-us']//h1[text()='CONTACT US']")).isDisplayed();
    }

    @Test
    public void section_LoginPortal() {
        driver.findElement(By.xpath("//a[@id='login-portal']//h1[text()='LOGIN PORTAL']")).isDisplayed();
    }

    @Test
    public void section_ButtonsClicks() {
        driver.findElement(By.xpath("//a[@id='button-clicks']//h1[text()='BUTTON CLICKS']")).isDisplayed();
    }

    @Test
    public void section_ToDoList() {
        driver.findElement(By.xpath("//a[@id='to-do-list']//h1[text()='TO DO LIST']")).isDisplayed();
    }

    @Test
    public void section_PageObjectModel() {
        driver.findElement(By.xpath("//a[@id='page-object-model']//h1[text()='PAGE OBJECT MODEL']")).isDisplayed();
    }

    @Test
    public void section_AccordionText() {
        driver.findElement(By.xpath("//a[@id='page-object-model']//h1[text()='ACCORDION & TEXT AFFECTS (APPEAR & DISAPPEAR)']")).isDisplayed();
    }

    @Test
    public void section_DropdownCheckboxe() {
        driver.findElement(By.xpath("//a[@id='dropdown-checkboxes-radiobuttons']//h1[text()='DROPDOWN, CHECKBOXE(S) & RADIO BUTTON(S)']")).isDisplayed();
    }

    @Test
    public void section_AjaxLoader() {
        driver.findElement(By.xpath("//a[@id='ajax-loader']//h1[text()='AJAX LOADER']")).isDisplayed();
    }

    @Test
    public void section_Actions() {
        driver.findElement(By.xpath("//a[@id='actions']//h1[text()='ACTIONS']")).isDisplayed();
    }

    @Test
    public void section_ScrollingAround() {
        driver.findElement(By.xpath("//a[@id='scrolling-around']//h1[text()='SCROLLING AROUND']")).isDisplayed();
    }

    @Test
    public void section_PopupAlerts() {
        driver.findElement(By.xpath("//a[@id='popup-alerts']//h1[text()='POPUP & ALERTS']")).isDisplayed();
    }

    @Test
    public void section_Iframe() {
        driver.findElement(By.xpath("//a[@id='iframe']//h1[text()='IFRAME']")).isDisplayed();
    }

    @Test
    public void section_HiddenElements() {
        driver.findElement(By.xpath("//a[@id='hidden-elements']//h1[text()='HIDDEN ELEMENTS']")).isDisplayed();
    }

    @Test
    public void section_DataTables() {
        driver.findElement(By.xpath("//a[@id='data-table']//h1[text()='DATA, TABLES & BUTTON STATES']")).isDisplayed();
    }

    @Test
    public void section_AutocompleteTextfield() {
        driver.findElement(By.xpath("//a[@id='autocomplete-textfield']//h1[text()='AUTOCOMPLETE TEXTFIELD']")).isDisplayed();
    }

    @Test
    public void section_FileUpload() {
        driver.findElement(By.xpath("//a[@id='file-upload']//h1[text()='FILE UPLOAD']")).isDisplayed();
    }

    @Test
    public void section_Datepicker() {
        driver.findElement(By.xpath("//a[@id='datepicker']//h1[text()='DATEPICKER']")).isDisplayed();
    }

    @Test
    public void udemyPromoCode1() {
        driver.findElement(By.xpath("//img[@id='udemy-promo-code-webdriverio']")).isDisplayed();

    }

    @Test
    public void udemyPromoCode2() {
        driver.findElement(By.xpath("//img[@id='udemy-promo-code-cucumber']")).isDisplayed();

    }

    @Test
    public void click_OnContactUs() {
        String linkContactUs = "https://webdriveruniversity.com/Contact-Us/contactus.html";
        driver.findElement(By.xpath("//div[@class='col-sm-12 col-lg-8 col-md-8']")).click();
        sTabs.switchTabs(linkContactUs);
        String linkCurrent = driver.getCurrentUrl();
        Assert.assertEquals(linkCurrent, linkContactUs);
    }


//    @Test
//    public void testInputInSearchBox() {
//        driver.findElement(By.name("q")).sendKeys("allo.ua");
//        String qElementValue = driver.findElement(By.name("q")).getAttribute("value");
//        Assert.assertEquals("allo.ua", qElementValue);
//
//    }
//
//    @Test
//    public void testButtonIsClickable() {
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
//    }
//
//    @Test
//    public void testLinkIsDisplayed() {
//        driver.findElement(By.name("q")).sendKeys("АЛЛО" + Keys.ENTER);
//        driver.findElement(By.xpath("//a/h3[text()='АЛЛО']"));
//    }
//
//    @Test
//    public void testSiteCanBeOpened() {
//        driver.findElement(By.name("q")).sendKeys("АЛЛО" + Keys.ENTER);
//        driver.findElement(By.xpath("//a/h3[text()='АЛЛО']")).click();
//        String link = driver.getCurrentUrl();
//        Assert.assertEquals("https://allo.ua/", link);
//    }
}
