package HerokuappTest;

import HerokuappBase.BaseTest;
import HerokuappPage.LoginPageHerokuapp;
import HerokuappPage.SharedMethods;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NoCredentialsTest extends BaseTest {
    LoginPageHerokuapp loginPageHerokuapp;
    SharedMethods sharedMehods;
    @Before
    public void setUpNoCredentialsTest(){
        loginPageHerokuapp=new LoginPageHerokuapp();
        sharedMehods=new SharedMethods();
    }
    @Test
    public void noCredentialsTest(){
        loginPageHerokuapp.loginButtonClick();
        assertTrue(sharedMehods.loginMessageIsDisplayed());
        assertEquals("Your username is invalid!\n" +
                        "×",
                sharedMehods.loginMessageGetText());
    }
}
