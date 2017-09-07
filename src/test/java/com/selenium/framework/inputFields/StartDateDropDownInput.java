package com.selenium.framework.inputFields;

import com.selenium.framework.typesOfInput.DropdownInput;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartDateDropDownInput extends DropdownInput {
    public StartDateDropDownInput(WebDriver webDriver, WebElement webElement) {
        super(driver, webElement);
    }
    public void selectMonth(String inputValue){
        selectDropdownByText(inputValue);
    }

    public void selectYear(String inputValue){
        selectDropdownByText(inputValue);
    }
}
