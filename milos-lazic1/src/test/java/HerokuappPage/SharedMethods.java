package HerokuappPage;

import HerokuappBase.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SharedMethods extends BaseTest {
    public SharedMethods() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "flash")
    WebElement LoginMessage;

    public boolean loginMessageIsDisplayed() {
        return wdWait.until(ExpectedConditions.visibilityOf(LoginMessage)).isDisplayed();
    }

    public String loginMessageGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(LoginMessage));
        return LoginMessage.getText();
    }

    @FindBy(linkText = "×")
    WebElement closeStatusMessageButton;

    public boolean closeStatusMessageButtonIsNotDisplayed() {
        return !wdWait.until(ExpectedConditions.visibilityOf(closeStatusMessageButton)).isDisplayed();
    }

    public void closeStatusMessageButtonClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(closeStatusMessageButton)).click();
    }
}