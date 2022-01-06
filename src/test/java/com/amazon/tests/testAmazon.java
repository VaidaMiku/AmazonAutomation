package com.amazon.tests;

import com.amazon.base.BaseTest;
import com.amazon.pages.AmazonHomePage;
import org.testng.annotations.Test;

public class testAmazon extends BaseTest {
    AmazonHomePage amazonHomePage;


    @Test
    public void findToy() {
        amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.findToy();

    }


}
