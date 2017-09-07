package com.selenium.framework.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected static WebDriver driver;
    protected InputFinder inputFinder;

    @BeforeMethod
    public void startDriver(){
        //Set up preferred browser
        driver = new FirefoxDriver();

        //Maximize window
        driver.manage().window().maximize();

        //initialize input finder
        inputFinder = new InputFinder(driver);
    }
    @AfterMethod
    public void closeDriver(){
        driver.close();
    }

    public void sleep(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000L));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
