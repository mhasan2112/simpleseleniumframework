package com.selenium.framework.typesOfInput;

import com.selenium.framework.testBase.LeftHandInput;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class NumericInput extends LeftHandInput {
    public NumericInput(WebElement element) {
        super(element);
    }

    public void setValue(double inputValue){
        element.clear();
        sleep(1);
        element.sendKeys(String.valueOf(inputValue));
        sleep(1);
    }
}
