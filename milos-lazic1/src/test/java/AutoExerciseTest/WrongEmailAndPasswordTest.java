package AutoExerciseTest;

import AutoExerciseBase.Base;
import AutoExercisePage.HomePage;
import AutoExercisePage.SignLoginPage;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class WrongEmailAndPasswordTest extends Base {
HomePage homePage;
SignLoginPage signLoginPage;
String email= "wrongemail@mail.com";
String password="wrongpassword";
@Before
    public void setUP(){
    homePage=new HomePage();
    signLoginPage=new SignLoginPage();


}
@Test
    public void wrongEmailAndPasswordTest(){
    homePage.homeButtonIsSelected();
    homePage.signLoginButtonClick();
    assertTrue(signLoginPage.loginAccountMessageIsDisplayed());
    assertEquals("Login to your account",
            signLoginPage.loginAccountMessageGetText());
    signLoginPage.emailInputFieldSendKeys(email)
            .passwordInputFieldSendKeys(password)
            .loginButtonClick();
assertTrue(signLoginPage.incorrectEmailOrPasswordMessageIsDisplayed());
assertEquals("Your email or password is incorrect!",
        signLoginPage.incorrectEmailOrPasswordMessageGetText());
}
}
