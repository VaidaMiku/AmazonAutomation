package com.amazon.tests;

import com.amazon.base.BaseTest;
import com.amazon.pages.AmazonHomePage;
import com.amazon.pages.AmazonSearchPage;
import com.amazon.pages.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class testAmazon extends BaseTest {
    SignInPage signInPage;
    AmazonHomePage amazonHomePage;
    AmazonSearchPage amazonSearchPage;


   @Test (priority = 1)
    public void signingIn() throws IOException {
        signInPage = new SignInPage(driver);
        signInPage.signingIn();
        Assert.assertEquals(signInPage.successfulLogIn(), "Hello, John", "Test failed");
        System.out.println(signInPage.successfulLogIn());

    }


    @Test (priority = 2)
    public void findToy() {
        amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.findToy();
        Assert.assertEquals(amazonHomePage.getActualToyResultText(), "1-48 of over 1,000 results for", "Test is wrong");
        System.out.println(amazonHomePage.getActualToyResultText());
        System.out.println("Hello world");

    }

    @Test (priority = 3)
    public void sortByReview() {
        amazonSearchPage = new AmazonSearchPage(driver);
        amazonSearchPage.sortByReview();
        Assert.assertTrue(amazonSearchPage.itemsAreSorted());
        amazonSearchPage.addItemsToCart();
    }

    @Test (priority = 4)
    public void deleteItemFormCart () {
        amazonSearchPage = new AmazonSearchPage(driver);
        amazonSearchPage.navigateToShoppingCart();
        Assert.assertEquals(amazonSearchPage.getNumberOfItems(), "Subtotal (2 items):", "Test not passed");
        System.out.println(amazonSearchPage.getNumberOfItems());
        amazonSearchPage.deleteSecondItem();
        Assert.assertEquals(amazonSearchPage.getNumberOfItems(), "Subtotal (1 item):", "Test not passed");
        System.out.println(amazonSearchPage.getNumberOfItems());
    }
}











