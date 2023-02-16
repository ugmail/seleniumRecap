package com.cydeo.pages.FleetGru;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetGru_MainPage {

    //1.create constructor and instances

    public FleetGru_MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="/html//div[@id='organization-switcher']//h1/a[@title='Fleet Management']")
    public WebElement FleetManagement;

        @FindBy(xpath ="//div[@id='main-menu']//span[@class='title title-level-1']")
        public WebElement Dashboards;
      //  Select DashboardsObj = new Select(Dashboards);

        @FindBy(xpath ="//div[@id='main-menu']/ul/li[@class='dropdown dropdown-level-1 first']/div[@class='dropdown-menu-wrapper dropdown-menu-wrapper__placeholder']/div[@class='dropdown-menu-wrapper dropdown-menu-wrapper__scrollable']/ul[@class='dropdown-menu dropdown-menu-level-1 menu menu-level-1']//a[@href='/dashboard/view/1?change_dashboard=1']/span[@class='title title-level-2']")
        public WebElement Dashboard;

        @FindBy(xpath ="//*[text()='Manage Dashboards']")
        public WebElement ManageDashboards;
//div[@id='main-menu']//span[@class='title title-level-2']

    //div[@id='main-menu']/ul/li[@class='dropdown dropdown-level-1 first']/div[@class='dropdown-menu-wrapper dropdown-menu-wrapper__placeholder']/div[@class='dropdown-menu-wrapper dropdown-menu-wrapper__scrollable']/ul[@class='dropdown-menu dropdown-menu-level-1 menu menu-level-1']//a[@href='/dashboard']/span[@class='title title-level-2']

    @FindBy(xpath ="//div[@id='main-menu']/ul/li[2]/a[@href='#']/span[@class='title title-level-1']")
    public WebElement Fleets;

        @FindBy(xpath ="//div[@id='main-menu']/ul/li[2]/div[@class='dropdown-menu-wrapper dropdown-menu-wrapper__placeholder']/div[@class='dropdown-menu-wrapper dropdown-menu-wrapper__scrollable']/ul[@class='dropdown-menu dropdown-menu-level-1 menu menu-level-1']//a[@href='entity/Extend_Entity_Carreservation']/span[@class='title title-level-2']")
        public WebElement Vehicles;

        @FindBy(xpath ="//div[@id='main-menu']/ul/li[2]/div[@class='dropdown-menu-wrapper dropdown-menu-wrapper__placeholder']/div[@class='dropdown-menu-wrapper dropdown-menu-wrapper__scrollable']/ul[@class='dropdown-menu dropdown-menu-level-1 menu menu-level-1']//a[@href='/entity/Extend_Entity_VehiclesOdometer']/span[@class='title title-level-2']")
        public WebElement VehicleOdometer;

        @FindBy(xpath ="//div[@id='main-menu']/ul/li[2]/div[@class='dropdown-menu-wrapper dropdown-menu-wrapper__placeholder']/div[@class='dropdown-menu-wrapper dropdown-menu-wrapper__scrollable']/ul[@class='dropdown-menu dropdown-menu-level-1 menu menu-level-1']//a[@href='/entity/Extend_Entity_VehicleCosts']/span[@class='title title-level-2']")
        public WebElement VehicleCosts;

        @FindBy(xpath ="//div[@id='main-menu']/ul/li[2]/div[@class='dropdown-menu-wrapper dropdown-menu-wrapper__placeholder']/div[@class='dropdown-menu-wrapper dropdown-menu-wrapper__scrollable']/ul[@class='dropdown-menu dropdown-menu-level-1 menu menu-level-1']//a[@href='/entity/Extend_Entity_VehicleContract']/span[@class='title title-level-2']")
        public WebElement VehicleContracts;


}
