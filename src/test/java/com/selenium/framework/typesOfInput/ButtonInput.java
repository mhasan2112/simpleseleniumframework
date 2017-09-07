package com.selenium.framework.typesOfInput;

import com.selenium.framework.testBase.LeftHandInput;
import org.openqa.selenium.WebElement;

public class ButtonInput extends LeftHandInput {
    public ButtonInput(WebElement element) {
        super(element);
    }
    public void clickButton(){
        element.click();
    }
}
