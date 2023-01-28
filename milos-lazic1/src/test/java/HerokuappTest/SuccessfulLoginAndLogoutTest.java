package HerokuappTest;

import HerokuappBase.BaseTest;
import HerokuappPage.LoginPageHerokuapp;
import HerokuappPage.SecureAreaPage;
import HerokuappPage.SharedMethods;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SuccessfulLoginAndLogoutTest extends BaseTest {

    LoginPageHerokuapp loginPageHerokuapp;
    SecureAreaPage secureAreaPage;
    SharedMethods sharedMehods;



    @Before
    public void setUpSuccessfulTest(){
        loginPageHerokuapp=new LoginPageHerokuapp();
        secureAreaPage=new SecureAreaPage();
        sharedMehods=new SharedMethods();
    }
    @Test
    public void successfulLoginAndLogoutTest(){
        assertTrue(loginPageHerokuapp.loginInstructionMessageIsDisplayed());
        assertEquals("This is where you can log into the secure area. Enter tomsmith for the username and SuperSecretPassword! for the password. If the information is wrong you should see error messages.",
                loginPageHerokuapp.loginInstructionMessageGetText());
        loginPageHerokuapp.userNameInputFieldSendKeys("tomsmith");
        loginPageHerokuapp.passwordInputFieldSendKeys("SuperSecretPassword!");
        loginPageHerokuapp.loginButtonClick();
        assertTrue(secureAreaPage.welcomeToSecureAreaMessageIsDisplayed());
        assertEquals("Welcome to the Secure Area. When you are done click logout below.",
                secureAreaPage.welcomeToSecureAreaMessageGetText());
        secureAreaPage.logOutButtonClick();
        assertTrue(sharedMehods.loginMessageIsDisplayed());
        assertEquals("You logged out of the secure area!\n" +
                        "×",
                sharedMehods.loginMessageGetText());


}
}
