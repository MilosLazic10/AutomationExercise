package HerokuappTest;

import HerokuappBase.BaseTest;
import HerokuappPage.LoginPageHerokuapp;
import HerokuappPage.SecureAreaPage;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import HerokuappPage.SharedMethods;
import org.junit.Before;
import org.junit.Test;

public class WrongUserNameTest extends BaseTest {
    LoginPageHerokuapp loginPageHerokuapp;
SecureAreaPage secureAreaPage;
    SharedMethods sharedMehods;

@Before
public void setUpWrongUserNameTest(){
    loginPageHerokuapp=new LoginPageHerokuapp();
    secureAreaPage=new SecureAreaPage();
    sharedMehods=new SharedMethods();
}
@Test
    public void wrongUserNameTest(){
    loginPageHerokuapp.userNameInputFieldSendKeys("tomsmit");
    loginPageHerokuapp.passwordInputFieldSendKeys("SuperSecretPassword!");
    loginPageHerokuapp.loginButtonClick();
    assertTrue(sharedMehods.loginMessageIsDisplayed());
    assertEquals("Your username is invalid!\n" +
                    "×",
            sharedMehods.loginMessageGetText());

}
}
