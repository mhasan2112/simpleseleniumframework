package com.selenium.framework.testBase;

import com.selenium.framework.inputFields.*;
import com.selenium.framework.typesOfInput.ButtonInput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputFinder {
    private final WebDriver webDriver;

    /**
     * Constructor
     * @param webDriver
     */
    public InputFinder(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public HomeValueInput getHomeValueInput(){
        return new HomeValueInput(webDriver.findElement(By.name("param[homevalue]")));
    }

    public LoanAmountInput getLoanAmountInput(){
        return new LoanAmountInput(webDriver.findElement(By.id("loanamt")));
    }

    public InterestRateInput getInterestRateInput(){
        return new InterestRateInput(webDriver.findElement(By.id("intrstsrate")));
    }

    public LoanTermInput getLoanTermInput(){
        return new LoanTermInput(webDriver.findElement(By.id("loanterm")));
    }

    public PropertyTaxInput getPropertyTaxInput(){
        return new PropertyTaxInput(webDriver.findElement(By.id("pptytax")));
    }

    public PMIInput getPmiInput(){
        return new PMIInput(webDriver.findElement(By.name("param[pmi]")));
    }

    public HomeInsInput getHomeInsInput(){
        return new HomeInsInput(webDriver.findElement(By.id("hoi")));
    }

    public MonthlyHOAInput getMonthlyHoaInput(){
        return new MonthlyHOAInput(webDriver.findElement(By.id("hoa")));
    }

    public ButtonInput getCalculateButton(){
        return new ButtonInput(webDriver.findElement(By.name("cal")));
    }

    public StartDateDropDownInput getMonth(){
        return new StartDateDropDownInput(webDriver, webDriver.findElement(By.name("param[start_month]")));
    }

    public StartDateDropDownInput getYear(){
        return new StartDateDropDownInput(webDriver, webDriver.findElement(By.name("param[start_year]")));
    }
}
