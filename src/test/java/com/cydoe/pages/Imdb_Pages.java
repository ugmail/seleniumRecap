package com.cydoe.pages;

import com.cydoe.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Imdb_Pages {

    public Imdb_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);



    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement searchImdb;

    @FindBy(xpath = "(//a[@class='ipc-metadata-list-summary-item__t'])[1]")
    public WebElement firstElementOfResult;

    @FindBy(xpath = "//a[.='All cast & crew']")
    public WebElement seeAllStars;






}
