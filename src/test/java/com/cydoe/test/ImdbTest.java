package com.cydoe.test;

import com.cydoe.pages.Imdb_Pages;
import com.cydoe.utilities.BrowserUtils;
import com.cydoe.utilities.ConfigurationReader;
import com.cydoe.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ImdbTest {
    @Test
    public void test_Artist_Movie() throws Exception {

        Driver.getDriver().get("http://www.imdb.com");

        Imdb_Pages imdbPages = new Imdb_Pages();

        imdbPages.searchImdb.sendKeys(ConfigurationReader.getProperty("movie") + Keys.ENTER);

        imdbPages.firstElementOfResult.click();

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].scrollIntoView(true)", imdbPages.seeAllStars);
        BrowserUtils.sleep(10);

        imdbPages.seeAllStars.click();
        List<WebElement> artistList1 = new ArrayList<>();
        artistList1 = Driver.getDriver().findElements(By.xpath("//tr[@class='odd']"));

        List<WebElement> artistList2 = new ArrayList<>();
        artistList2 = Driver.getDriver().findElements(By.xpath("//tr[@class='even']"));

        artistList1.addAll(artistList2);


        int count = 0;
        for (WebElement each : artistList1) {

            if (each.getText().contains(ConfigurationReader.getProperty("artist"))) {
                System.err.println("\nArtist and movie matched..!!!\n");
                count++;
            }
            System.out.println(each.getText());

        }
        if (count < 1) {
            throw new Exception("\nArtist and movie NOT matched..!\n");
        }


    }

}
