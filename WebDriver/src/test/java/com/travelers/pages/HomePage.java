package com.travelers.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//span[text()='Search by Hotel or City Name']")

    private WebElement searchSpan;

    @FindBy(xpath = "//input[@class='select2-input']")
    private WebElement searchCityInput;


}
