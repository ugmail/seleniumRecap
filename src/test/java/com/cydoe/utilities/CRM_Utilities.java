package com.cydoe.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    /**
     This method will login with helpdesk1@cybertekschool.com user when its called

     */
    public static void crm_login(WebDriver driver){

        //3. Enter valid username
        WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
        username.sendKeys("helpdesk1@cybertekschool.com");
//        4. Enter valid password
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("UserUser");
//        5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

    }


    public static void crm_login(WebDriver driver,String username, String password){

        //3. Enter valid username
        WebElement usernameInput = driver.findElement(By.xpath("//input[@type='text']"));
        usernameInput.sendKeys(username);
//        4. Enter valid password
        WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInput.sendKeys(password);
//        5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();





    }
}
