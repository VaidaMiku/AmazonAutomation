package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    WebDriver driver;
    String username = "petrasTester@gmail.com";
    String password = "Amazoneamazone21?";

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='nav-link-accountList']")
    WebElement signInButton;

    @FindBy(xpath = "//*[@id='ap_email']")
    WebElement usernameBox;

    @FindBy(xpath = "//*[@id='continue']")
    WebElement continueButton;

    @FindBy(xpath = "//*[@id='ap_password']")
    WebElement passwordBox;

    @FindBy(xpath = "//*[@id='signInSubmit']")
    WebElement signIn;

    public void signingIn() {
        signInButton.click();
        usernameBox.sendKeys(username);
        continueButton.click();
        passwordBox.sendKeys(password);
        signIn.click();

    }






}
