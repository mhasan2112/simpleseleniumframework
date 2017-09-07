package com.selenium.framework.sampleTests;

import com.selenium.framework.helper.VerificationHelper;
import com.selenium.framework.testBase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest extends TestBase {
    @BeforeMethod
    public void openUrl() throws InterruptedException{
        driver.get("http://www.mortgagecalculator.org/");
        driver.manage().deleteAllCookies();
    }
    @Test
    public void firstTest(){
        inputFinder.getHomeValueInput().setValue(50000);
        inputFinder.getLoanAmountInput().setValue(30000);
        inputFinder.getInterestRateInput().setValue(4.12);
        inputFinder.getLoanTermInput().setValue(15);
        inputFinder.getMonth().selectDropdownByText("Jan");
        inputFinder.getYear().selectDropdownByText("2016");
        inputFinder.getPropertyTaxInput().setValue(2);
        inputFinder.getPmiInput().setValue(2);
        inputFinder.getHomeInsInput().setValue(2000);
        inputFinder.getMonthlyHoaInput().setValue(500);
        inputFinder.getCalculateButton().clickButton();
        VerificationHelper.verifyMonthlyPayment("$973.71");

    }
}
