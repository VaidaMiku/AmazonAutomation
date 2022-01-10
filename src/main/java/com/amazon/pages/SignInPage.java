package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static com.amazon.TestDataReader.getPassword;
import static com.amazon.TestDataReader.getUsername;

public class SignInPage {

    WebDriver driver;
    String username = getUsername();
    String password = getPassword();

    public SignInPage(WebDriver driver) throws IOException {
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
