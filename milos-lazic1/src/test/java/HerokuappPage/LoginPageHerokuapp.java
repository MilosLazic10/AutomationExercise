package HerokuappPage;

import HerokuappBase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class LoginPageHerokuapp extends BaseTest {
    public LoginPageHerokuapp(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "username")
    WebElement userNameInputField;

    public void userNameInputFieldSendKeys(String userName){
        wdWait.until(ExpectedConditions.elementToBeClickable(userNameInputField)).clear();
        userNameInputField.sendKeys(userName);
    }

    @FindBy(id = "password")
    WebElement passwordInputField;
    public void passwordInputFieldSendKeys(String password){
        wdWait.until(ExpectedConditions.elementToBeClickable(passwordInputField)).clear();
        passwordInputField.sendKeys(password);
    }

    @FindBy(css = ".fa-2x")
    WebElement loginButton;
    public void loginButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }


    @FindBy(className = "subheader")
    WebElement loginInstructionMessage;
    public boolean loginInstructionMessageIsDisplayed(){
       return wdWait.until(ExpectedConditions.visibilityOf(loginInstructionMessage)).isDisplayed();
    }
    public String loginInstructionMessageGetText(){
        return wdWait.until(ExpectedConditions.visibilityOf(loginInstructionMessage)).getText();
    }

    @FindBy(linkText = "Elemental Selenium")
    WebElement seleniumLink;
    public void seleniumLinkClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(seleniumLink)).click();
    }
   public void switchToNewTab(int tabNumber, int tab){
        wdWait.until(ExpectedConditions.numberOfWindowsToBe(tabNumber));
       ArrayList<String> numberOfTabs= new ArrayList<>(driver.getWindowHandles());
       driver.switchTo().window(numberOfTabs.get(tab));
   }


}
