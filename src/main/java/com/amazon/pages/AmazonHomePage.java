package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {

    WebDriver driver;
    String toyName = "fidget spinner";

    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;

    @FindBy(id = "nav-search-submit-button")
    WebElement searchButton;

    @FindBy(xpath = "//span[normalize-space()='1-48 of over 1,000 results for']")
    WebElement actualToyResultText;


    public void findToy() {
        searchBox.sendKeys(toyName);
        searchButton.click();
    }

    public String getActualToyResultText() {
        return actualToyResultText.getText();

    }


}



