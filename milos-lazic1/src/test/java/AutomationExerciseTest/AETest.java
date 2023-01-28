package AutomationExerciseTest;

import AutomationExerciseBase.BaseAETest;
import AutomationExercisePage.AutomationExerciseAccountCreationPage;
import AutomationExercisePage.AutomationExerciseHomePage;
import AutomationExercisePage.AutomationExerciseSignUpPage;
import AutomationExercisePage.SuccessfulProfileCreation;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;


public class AETest extends BaseAETest {
    AutomationExerciseHomePage automationExerciseHomePage;
    AutomationExerciseSignUpPage automationExerciseSignUpPage;
    AutomationExerciseAccountCreationPage automationExerciseAccountCreationPage;
    SuccessfulProfileCreation successfulProfileCreation;

    Random random= new Random();
    String name= "qatest"+ random.nextInt(99999);
    String email= name+"@testmail.com";
    String password=name;
String firstName= "someName";
String lastName= "lastName";
String company= "yahoo";
String address1= "roadtoNY1";
String address2="roadtoNY2";
String state="Vancuver";
String city="Hello";
String zipcode= "99542";
String mobile= "9949564299";



    @Before
    public void setUpAETest(){
        automationExerciseHomePage=new AutomationExerciseHomePage();
        automationExerciseSignUpPage=new AutomationExerciseSignUpPage();
        automationExerciseAccountCreationPage=new AutomationExerciseAccountCreationPage();
        successfulProfileCreation=new SuccessfulProfileCreation();
    }
    @Test
    public void successfulAETest(){
        automationExerciseHomePage.signUpLinkClick();
        automationExerciseSignUpPage.nameInputFieldSendkeys(name);
        automationExerciseSignUpPage.emailInputFieldSendKeys(email);
        automationExerciseSignUpPage.signUpButtonClick();
        automationExerciseAccountCreationPage.genderButtonClick()
        .passwordInputFieldSendKeys(password)
        .dayOfBirthDropdownSelect()
        .monthOfBirthDropdownSelect()
        .yearOfBirthDropdownSelect()
        .firstNameInputFieldSendKeys(firstName)
                .lastNameInputFieldSendKeys(lastName)
                .companyInputFieldSendKeys(company)
                .address1InputFieldSendKeys(address1)
                .address2InputFieldSendKeys(address2)
                .countryDropdownSelect()
                .stateInputFiled(state)
                .cityInputFieldSendKeys(city)
                .zipcodeInputFieldSendKeys(zipcode)
                .mobileNumberInputFieldSendKeys(mobile)
                .createAccountButtonClick();
      assertTrue(successfulProfileCreation.accountCreatedMessageIsDisplayed());
      assertEquals("ACCOUNT CREATED!",
        successfulProfileCreation.accountCreatedMessageGetText());
        successfulProfileCreation.continueButtonClick();
      //  driver.navigate().refresh();
      //  successfulProfileCreation.continueButtonClick();
        automationExerciseSignUpPage.logoutButtonClick();
        automationExerciseHomePage.signUpLinkIsDisplayed();
    }



}
