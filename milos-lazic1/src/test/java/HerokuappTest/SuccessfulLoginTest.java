package HerokuappTest;

import HerokuappBase.BaseTest;
import HerokuappPage.LoginPageHerokuapp;
import HerokuappPage.SecureAreaPage;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import HerokuappPage.SharedMethods;
import org.junit.Before;
import org.junit.Test;

public class SuccessfulLoginTest extends BaseTest {
    LoginPageHerokuapp loginPageHerokuapp;
    SecureAreaPage secureAreaPage;
    SharedMethods sharedMehods;



    @Before public void setUpSuccessfulTest(){
        loginPageHerokuapp=new LoginPageHerokuapp();
        secureAreaPage=new SecureAreaPage();
        sharedMehods=new SharedMethods();
    }
    @Test
public void successfulLoginTest(){
assertTrue(loginPageHerokuapp.loginInstructionMessageIsDisplayed());
assertEquals("This is where you can log into the secure area. Enter tomsmith for the username and SuperSecretPassword! for the password. If the information is wrong you should see error messages.",
loginPageHerokuapp.loginInstructionMessageGetText());
loginPageHerokuapp.userNameInputFieldSendKeys("tomsmith");
loginPageHerokuapp.passwordInputFieldSendKeys("SuperSecretPassword!");
loginPageHerokuapp.loginButtonClick();
assertTrue(secureAreaPage.welcomeToSecureAreaMessageIsDisplayed());
assertEquals("Welcome to the Secure Area. When you are done click logout below.",
        secureAreaPage.welcomeToSecureAreaMessageGetText());

    }
}
