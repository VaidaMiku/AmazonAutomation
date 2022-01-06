package com.amazon.tests;

import com.amazon.base.BaseTest;
import com.amazon.pages.AmazonHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testAmazon extends BaseTest {
    AmazonHomePage amazonHomePage;


    @Test
    public void findToy() {
        amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.findToy();
        Assert.assertEquals(amazonHomePage.getActualToyResultText(), "1-48 of over 1,000 results for", "Test is wrong");

    }


}
