package AutoExercisePage;

import AutoExerciseBase.Base;
import org.junit.validator.ValidateWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignLoginPage extends Base {
    public SignLoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h2[text()=\"Login to your account\"]")
    WebElement loginAccountMessage;
    public boolean loginAccountMessageIsDisplayed(){
       return wdWait.until(ExpectedConditions.visibilityOf(loginAccountMessage)).isDisplayed();
    }
    public String loginAccountMessageGetText(){
       return wdWait.until(ExpectedConditions.visibilityOf(loginAccountMessage)).getText();
    }
    @FindBy(css = "input[data-qa=\"login-email\"]")
    WebElement emailInputField;
    public SignLoginPage emailInputFieldSendKeys(String email){
        wdWait.until(ExpectedConditions.elementToBeClickable(emailInputField)).clear();
        emailInputField.sendKeys(email);
        return this;
    }
    @FindBy(css = "input[data-qa=\"login-password\"]")
    WebElement passwordInputField;
    public SignLoginPage passwordInputFieldSendKeys(String password){
        wdWait.until(ExpectedConditions.elementToBeClickable(passwordInputField)).clear();
        passwordInputField.sendKeys(password);
        return this;
    }
    @FindBy(xpath = "//button[text()=\"Login\"]")
    WebElement loginButton;
    public void loginButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }
    @FindBy(xpath = "//p[contains(text(),\"incorrect!\")]")
    WebElement incorrectEmailOrPasswordMessage;
    public boolean incorrectEmailOrPasswordMessageIsDisplayed(){
     return    wdWait.until(ExpectedConditions.visibilityOf(incorrectEmailOrPasswordMessage)).isDisplayed();
    }
    public String incorrectEmailOrPasswordMessageGetText(){
        return wdWait.until(ExpectedConditions.visibilityOf(incorrectEmailOrPasswordMessage)).getText();
    }
}
