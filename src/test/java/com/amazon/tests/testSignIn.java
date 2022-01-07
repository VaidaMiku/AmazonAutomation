package com.amazon.tests;

import com.amazon.base.BaseTest;
import com.amazon.pages.SignInPage;
import org.testng.annotations.Test;

public class testSignIn extends BaseTest {
    SignInPage signInPage;

    @Test
    public void signingIn() {
        signInPage = new SignInPage(driver);
        signInPage.signingIn();



    }


}
