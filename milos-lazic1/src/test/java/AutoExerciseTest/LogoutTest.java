package AutoExerciseTest;

import AutoExerciseBase.Base;
import AutoExercisePage.HomePage;
import AutoExercisePage.LoggedInPage;
import AutoExercisePage.SharedMethods;
import AutoExercisePage.SignLoginPage;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LogoutTest extends Base {
    HomePage homePage;
    SignLoginPage signLoginPage;
    LoggedInPage loggedInPage;
    SharedMethods sharedMethods;
    String password= "qatest93613";
    String email= password +"@testmail.com";
    String url="https://automationexercise.com/login";

    @Before
    public void setUpTest() {
        homePage = new HomePage();
        signLoginPage = new SignLoginPage();
        loggedInPage = new LoggedInPage();
        sharedMethods=new SharedMethods();
    }
        @Test
                public void logoutTest(){
            homePage.homeButtonIsSelected();
            homePage.signLoginButtonClick();
           assertTrue(signLoginPage.loginAccountMessageIsDisplayed());
           assertEquals("Login to your account",
                   signLoginPage.loginAccountMessageGetText());
           signLoginPage.emailInputFieldSendKeys(email)
                   .passwordInputFieldSendKeys(password)
                   .loginButtonClick();
           assertTrue(loggedInPage.loggedInMessageIsDisplayed());
           assertEquals("Logged in as qatest93613",
                   loggedInPage.loggedInMessageGetText());
           loggedInPage.logoutButtonClick();
          assertTrue(driver.findElements(By.linkText("Logout")).isEmpty());
         assertEquals(url,driver.getCurrentUrl());
        }
    }

