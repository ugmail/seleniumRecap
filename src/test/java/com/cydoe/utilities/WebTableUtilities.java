package com.cydoe.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebTableUtilities {
    //TC #2: Web table practice Task1 cont.
    //1. Create a new class called WebTableUtils.
    //2. Create two methods to verify order
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test

    //Method #1 info:
    //• Name: returnOrderDate ()
    //• Return type: String
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //This method should accept a costumerName and return the costumer order date
    //as a String.

    public static String returnOrderDate(WebDriver driver, String customerName){
        String orderDate = driver.findElement(By.xpath("//table//table//td[text()='"+customerName+"']/following-sibling::td[3]")).getText();
        System.out.println(orderDate);
        return orderDate;
    }

    //Method #2 info:
    //• Name: orderVerify ()
    //• Return type: void
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //• Arg3: String expectedOrderDate
    //This method should accept above mentioned arguments and internally assert
    //expectedOrderDate matching actualOrderDate.

    public static void orderVerify(WebDriver driver,String customerName,String expectedOrderDate){
        String actualOrderDate = returnOrderDate(driver,customerName);
        //String actualOrderDate = driver.findElement(By.xpath("//table//table//td[2][text()='"+customerName+"']")).getText();

        Assert.assertEquals(actualOrderDate,expectedOrderDate);




    }
}
