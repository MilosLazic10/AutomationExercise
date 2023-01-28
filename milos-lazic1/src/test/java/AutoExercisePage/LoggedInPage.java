package AutoExercisePage;

import AutoExerciseBase.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoggedInPage extends Base {
    public LoggedInPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(),\"Logged\")]")
    WebElement loggedInMessage;
    public boolean loggedInMessageIsDisplayed(){
         return wdWait.until(ExpectedConditions.visibilityOf(loggedInMessage)).isDisplayed();
    }
    public String loggedInMessageGetText(){
        return wdWait.until(ExpectedConditions.visibilityOf(loggedInMessage)).getText();
    }
    @FindBy(linkText = "Delete Account")
    WebElement deleteAccountButton;
    public void deleteAccountButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(deleteAccountButton)).click();
    }
    @FindBy(linkText = "Logout")
    WebElement logoutButton;
    public void logoutButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(logoutButton)).click();
    }

}
