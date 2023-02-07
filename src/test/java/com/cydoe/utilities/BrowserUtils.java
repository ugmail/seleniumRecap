package com.cydoe.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

/*
In this class only general utility methods that are not related to some specific page.
 */
public class BrowserUtils {

    /**
    This method will accept int (in seconds) and execute Thread.sleep for given duration
     */

    public static void sleep(int second){
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }





    /**

    This method; if there is more than 1 window it switch to expectedURL and verify the current Title contains expectedTitle
     Arg1 : webDriver
     Arg2 : Expectedurl
     Arg3 : expectedInTitle

     */
    public static void switchWindowAndVerify(WebDriver driver, String expectedUrl, String expectedTitle){

        Set<String> WindowHandles = driver.getWindowHandles();
        for (String each : WindowHandles) {
            driver.switchTo().window(each);
            if(driver.getCurrentUrl().contains(expectedUrl)){
                break;
            }
        }
        //Assert: Title contains “expectedTitle”
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));

    }



    /**

    This method accepts a String "expectedTitle" and Asserts if it is true

    */

    public static void verifyTitle(WebDriver driver, String expectedTitle){

        String currentTitle = driver.getTitle();

        Assert.assertEquals(currentTitle,expectedTitle);


    }






}
