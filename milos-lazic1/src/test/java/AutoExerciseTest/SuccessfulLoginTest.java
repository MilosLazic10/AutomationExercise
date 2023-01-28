package AutoExerciseTest;

import AutoExerciseBase.Base;
import AutoExercisePage.HomePage;
import AutoExercisePage.LoggedInPage;
import AutoExercisePage.SignLoginPage;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.openqa.selenium.By;

public class SuccessfulLoginTest extends Base {
    HomePage homePage;
    SignLoginPage signLoginPage;
    LoggedInPage loggedInPage;
    String password= "qatest29832";
    String email= password + "@testmail.com";
    String loggedInMessage="Logged in as " + password;
    @Before
    public void setUpTest() {
        homePage = new HomePage();
        signLoginPage = new SignLoginPage();
        loggedInPage=new LoggedInPage();
    }
    @org.junit.Test
    public void secondAETest(){
        homePage.homeButtonIsSelected();
        homePage.signLoginButtonClick();
        assertTrue(signLoginPage.loginAccountMessageIsDisplayed());
        assertEquals("Login to your account",
        signLoginPage.loginAccountMessageGetText());
        signLoginPage.emailInputFieldSendKeys(email);
        signLoginPage.passwordInputFieldSendKeys(password);
        signLoginPage.loginButtonClick();
        assertTrue(loggedInPage.loggedInMessageIsDisplayed());
        assertEquals(loggedInMessage,
                loggedInPage.loggedInMessageGetText());
        loggedInPage.deleteAccountButtonClick();
        assertTrue(driver.findElements(By.linkText(" Delete Account")).isEmpty());
    }
}
