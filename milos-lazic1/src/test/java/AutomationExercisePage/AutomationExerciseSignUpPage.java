package AutomationExercisePage;

import AutomationExerciseBase.BaseAETest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AutomationExerciseSignUpPage extends BaseAETest {
    public AutomationExerciseSignUpPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "name")
    WebElement nameInputField;
    public void nameInputFieldSendkeys(String name){
        wdWait.until(ExpectedConditions.elementToBeClickable(nameInputField)).clear();
        nameInputField.sendKeys(name);
    }
    @FindBy(css = "[data-qa=\"signup-email\"]")
    WebElement emailInputField;
    public void emailInputFieldSendKeys(String email){
        wdWait.until(ExpectedConditions.elementToBeClickable(emailInputField)).clear();
        emailInputField.sendKeys(email);
    }
    @FindBy(css = "[data-qa=\"signup-button\"]")
    WebElement signUpButton;
    public void signUpButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(signUpButton)).click();
    }
    @FindBy(linkText = "Logout")
    WebElement logoutButton;
    public void logoutButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(logoutButton)).click();

    }
}
