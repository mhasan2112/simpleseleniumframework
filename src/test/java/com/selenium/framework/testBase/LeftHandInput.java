package com.selenium.framework.testBase;

import org.openqa.selenium.WebElement;

public class LeftHandInput extends TestBase{
    public LeftHandInput(WebElement element) {
        this.element = element;
    }

    protected WebElement element;

}
