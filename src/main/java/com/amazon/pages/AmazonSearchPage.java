package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class AmazonSearchPage {

    WebDriver driver;

    public AmazonSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text() = 'Sort by:']")
    WebElement sortingButton;

    @FindBy(id = "s-result-sort-select_3")
    WebElement sortByReview;

    @FindBy(xpath = "//span[text()='Avg. Customer Review']")
    WebElement byReview;

    @FindBy(xpath = "//span[@class='celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_3']")
    WebElement thirdItem;

    @FindBy(xpath = "//span[@class='celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_4']")
    WebElement fourthItem;

    @FindBy(id = "add-to-cart-button")
    WebElement addToCartButton;

    @FindBy(xpath = "//div[@id='nav-cart-count-container']")
    WebElement shoppingCart;

    @FindBy(id = "sc-subtotal-label-buybox")
    WebElement itemsInCart;

    @FindBy(xpath = "//div[@data-item-count='2']/div[4]/div/div/div/div/div/div/span[2]/span/input")
    WebElement deleteButton;



    public void sortByReview() {
        sortingButton.click();
        sortByReview.click();
    }

    public Boolean itemsAreSorted () {

        return byReview.isDisplayed();
    }

    public void addItemsToCart() {
        thirdItem.click();
        addToCartButton.click();
        driver.navigate().back();
        driver.navigate().back();
        fourthItem.click();
        addToCartButton.click();
        driver.navigate().back();
        driver.navigate().back();
    }

    public void navigateToShoppingCart (){
        shoppingCart.click();
    }

    public String getNumberOfItems() {
        return itemsInCart.getText();
    }

    public void deleteSecondItem () {
        deleteButton.click();
    }
}

