package com.webdriveruniversity.resources;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;

import java.util.Set;

public class SwitchTabs extends WebDriverSettings {

//    public void switchTabs(String link){
//
////        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
////        driver.switchTo().window(tabs2.get(1));
////        driver.close();
////        driver.switchTo().window(tabs2.get(0));
//
////    protected void changeWindow(int i){
////        Set<String> windows = driver.getWindowHandles();
////        String[] handle = windows.toArray(new String[windows.size()]);
////        driver.switchTo().window(handle[i]);
////        driver.switchTo().window(handle[i]).getTitle();
////    }

    public void switchTabs (String link) {
        Set<String> handles = driver.getWindowHandles();
        String current = driver.getWindowHandle();
        if (handles.size() > 1)
        {
            handles.remove(current);
            String newTab = handles.iterator().next();
            driver.switchTo().window(newTab);
        }


//        JavascriptExecutor js = (JavascriptExecutor)driver;
//
//        try{
//
//            String window1 = driver.getWindowHandle();
//
//            js.executeScript("window.open()");
//
//            Set<String> currentWindows = driver.getWindowHandles();
//
//            String window2 = null;
//
//            for (String window : currentWindows){
//                if (!window.equals(window1)){
//                    window2 = window;
//                    break;
//                }
//            };
//            driver.switchTo().window(window2);
//            //driver.getCurrentUrl();
//            //driver.close();
//            //driver.switchTo().window(window1);
//        }
//        //catch (InterruptedException e){
//           // e.printStackTrace();
//        //}
//        finally {
//            driver.quit();
//        }
    }
}
