package com.cydoe.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class
WebDriverFactory {
    public static WebDriver getDriver(String browserType) {
       // WebDriver driver = null;
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            //driver = new ChromeDriver();
            //driver.manage().window().maximize();
            return new ChromeDriver();
        } else if (browserType == "firefox") {
            WebDriverManager.firefoxdriver().setup();
            //driver = new FirefoxDriver();
            //driver.manage().window().maximize();
            return new ChromeDriver();
        } else {
            System.err.println("Given browser type does not exist/or is not currently supported");
            System.err.println("Driver = null");
            System.exit(0);
            return null;
        }
        // return driver;
    }
    // TASK : NEW METHOD CREATION
    // Method name : getDriver
    // Static method
    // Accept Sting arg : browserType
    // - This arg will determine what type of browser is opened
    // - if "chrome" passed --> it will open chrome browser
    // - if "firefox" passed --> it will open firefox browser
    //  RETURN TYPE : "WebDriver"
    //----------------------------------------------------------------------------------------------------


    //Open web page with given webURL in the given browserType
    public static WebDriver openPage(String browserType, String webUrl) {
        WebDriver driver = null;
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(webUrl);

        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(webUrl);
        } else {
            System.err.println("Given browser type does not exist/or is not currently supported");
            System.err.println("Driver = null");
            System.exit(0);
        }
        return driver;
    }


    public static WebDriver searchGoogle(String browserType, String searchWord) {
        WebDriver driver = null;
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://google.com");
            WebElement searcBox = driver.findElement(By.name("q"));
            searcBox.sendKeys(searchWord + Keys.ENTER);
            List<WebElement> links = driver.findElements(By.tagName("a"));
            for (WebElement each : links) {
                if (each.getText().contains(searchWord)) {
                    each.click();
                    break;
                }
            }

        } else if (browserType == "firefox") {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://google.com");
            WebElement searcBox = driver.findElement(By.name("q"));
            searcBox.sendKeys(searchWord + Keys.ENTER);
            List<WebElement> links = driver.findElements(By.tagName("a"));
            for (WebElement each : links) {
                if (each.getText().contains(searchWord)) {
                    each.click();
                    break;
                }
            }
        } else {
            System.err.println("Given browser type does not exist/or is not currently supported");
            System.err.println("Driver = null");
            System.exit(0);
        }
        return driver;
    }

    public static void clickAndVerifyRadioButton(String browserType, String webUrl, String attribute, String value

    ) {
        WebDriver driver = null;
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(webUrl);

        } else if (browserType == "firefox") {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(webUrl);
        } else {
            System.err.println("Given browser type does not exist/or is not currently supported");
            System.err.println("Driver = null");
            System.exit(0);
        }

        WebElement radioButton = driver.findElement(By.xpath("//*[@" + attribute + "='" + value + "']"));

        radioButton.click();

        System.out.println(radioButton.getAttribute(attribute) + " radio button is selected = " + radioButton.isSelected());

    }


}

