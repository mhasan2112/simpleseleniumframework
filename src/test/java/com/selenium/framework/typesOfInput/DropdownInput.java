package com.selenium.framework.typesOfInput;

import com.selenium.framework.testBase.LeftHandInput;
import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DropdownInput extends LeftHandInput {
    protected WebDriver webDriver;
    protected WebElement pickerElement;
    protected List<WebElement> dropdownElements;
    public DropdownInput( WebDriver webDriver, WebElement pickerElement) {
        super(pickerElement);
        this.webDriver = webDriver;
        this.pickerElement = pickerElement;
    }
    public void selectDropdownByText(String text)
    {
        // first expand the dropdown
        Actions action = new Actions(webDriver);
        sleep(5);
        action.moveToElement(pickerElement).click().perform();
        //pickerElement.click();
        sleep(1);

        // then locate and click the dropdown item
        final String locator = ".rw-box select option[label='" + text + "']";
        WebElement dropdownElement = webDriver.findElement(By.cssSelector(locator));
        dropdownElement.click();


        sleep(1);
    }
}
