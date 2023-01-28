package HerokuappTest;

import HerokuappBase.BaseTest;
import HerokuappPage.LoginPageHerokuapp;
import HerokuappPage.SecureAreaPage;
import HerokuappPage.SharedMethods;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WrongCredentialsTest extends BaseTest {
    LoginPageHerokuapp loginPageHerokuapp;
    SecureAreaPage secureAreaPage;

    SharedMethods sharedMehods;

    @Before
    public void setUpWrongPasswordTest() {
        loginPageHerokuapp = new LoginPageHerokuapp();
        secureAreaPage = new SecureAreaPage();
        sharedMehods=new SharedMethods();
    }

    @Test
    public void wrongCredentialsTest() {
        loginPageHerokuapp.userNameInputFieldSendKeys("tomsmit");
        loginPageHerokuapp.passwordInputFieldSendKeys("SuperSecretPassword");
        loginPageHerokuapp.loginButtonClick();
        assertTrue(sharedMehods.loginMessageIsDisplayed());
        assertEquals("Your username is invalid!\n" +
                        "×",
                sharedMehods.loginMessageGetText());

    }
}