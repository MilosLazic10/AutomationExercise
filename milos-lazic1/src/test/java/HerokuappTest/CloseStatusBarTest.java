package HerokuappTest;

import HerokuappBase.BaseTest;
import HerokuappPage.LoginPageHerokuapp;
import HerokuappPage.SharedMethods;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class CloseStatusBarTest extends BaseTest {

        LoginPageHerokuapp loginPageHerokuapp;
        SharedMethods sharedMethods;


    @Before
    public void setUpCloseStatusBarTest() {
       loginPageHerokuapp = new LoginPageHerokuapp();
       sharedMethods=new SharedMethods();
    }
    @Test
    public void closeStatusBarTest(){
        loginPageHerokuapp.userNameInputFieldSendKeys("tomsmith");
        loginPageHerokuapp.passwordInputFieldSendKeys("SuperSecretPassword");
        loginPageHerokuapp.loginButtonClick();
        sharedMethods.closeStatusMessageButtonClick();
        assertTrue(sharedMethods.closeStatusMessageButtonIsNotDisplayed());
    }
}