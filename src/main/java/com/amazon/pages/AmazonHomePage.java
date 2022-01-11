package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

import static com.amazon.TestDataReader.*;

public class AmazonHomePage {

    WebDriver driver;
    String toyName = getToyName();
    String fullName = getFullName();
    String phoneNumber = getPhoneNumber();
    String postcode = getPostcode();
    String addressLineOrCompany = getAddressLineOrCompany();
    String townOrCity = getTownOrCity();
    String country = getCountry();
    String countryRegion = getCountryRegion();

    public AmazonHomePage(WebDriver driver) throws IOException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;

    @FindBy(id = "nav-search-submit-button")
    WebElement searchButton;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    WebElement actualToyResultText;

    @FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
    WebElement proceedButton;

    @FindBy(xpath = "//span[@role='button']")
    WebElement countryButton;

    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressFullName']")
    WebElement fullNameBox;

    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
    WebElement phoneNumberBox;

    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPostalCode']")
    WebElement postcodeBox;

    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine1']")
    WebElement addressLineOrCompanyBox;

    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressCity']")
    WebElement townOrCityBox;

    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressDistrictOrCounty']")
    WebElement countryBox;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement useThisAddressButton;

    @FindBy(xpath = "//span[@id='sc-subtotal-amount-activecart']//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'][normalize-space()='£15.98']")
    WebElement subtotalAmount;

    @FindBy(xpath = "//div[@class='a-popover-wrapper']//div[@class='a-popover-inner']//ul[@class='a-nostyle a-list-link']//li[@role='option']")
    List<WebElement> listOfCountries;

    @FindBy(xpath = "//a[normalize-space()='United Kingdom']")
    WebElement selectedCountry;


    public void findToy() {
        searchBox.sendKeys(toyName);
        searchButton.click();
    }

    public String getActualToyResultText() {
        return actualToyResultText.getText();
    }

    public String subtotalAmount() {
        return subtotalAmount.getText();
    }

    public void proceedButton() {
        proceedButton.click();
    }
    public List<WebElement> countryButton() {
        countryButton.click();
        return listOfCountries;
    }

    public void selectedCountry() {
        selectedCountry.click();
    }

    public void fullName() {
        fullNameBox.clear();
        fullNameBox.sendKeys(fullName);
        phoneNumberBox.sendKeys(phoneNumber);
        postcodeBox.sendKeys(postcode);
        addressLineOrCompanyBox.sendKeys(addressLineOrCompany);
        townOrCityBox.sendKeys(townOrCity);
        countryBox.sendKeys(country);
        useThisAddressButton.click();

    }


}



