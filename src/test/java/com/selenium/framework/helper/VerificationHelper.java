package com.selenium.framework.helper;

import com.selenium.framework.testBase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class VerificationHelper extends TestBase{
    public static void verifyMonthlyPayment(String inputValue){
        WebElement element = driver.findElement(By.cssSelector((".repayment-block .rw-box .left-cell h3")));
        element.getText();
        String strng = element.getText();
        Assert.assertEquals(strng, inputValue);
    }
}
