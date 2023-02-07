package com.cydoe.test;

import com.cydoe.pages.Imdb_Pages;
import com.cydoe.utilities.BrowserUtils;
import com.cydoe.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ImdbTest {
    @Test
    public void test_Artist_Movie() {

        Driver.getDriver().get("https://www.imdb.com");

        Imdb_Pages imdbPages = new Imdb_Pages();


        imdbPages.searchImdb.sendKeys("John Wick" + Keys.ENTER);

        BrowserUtils.sleep(5);
        imdbPages.firstElementOfResult.click();
        BrowserUtils.sleep(5);

        Driver.getDriver().findElement(By.xpath("//a[@aria-label='See full cast and crew']")).click();
    }

}
