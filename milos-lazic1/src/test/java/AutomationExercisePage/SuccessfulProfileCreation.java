package AutomationExercisePage;

import AutomationExerciseBase.BaseAETest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuccessfulProfileCreation extends BaseAETest {
    public SuccessfulProfileCreation() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//b[text()=\"Account Created!\"]")
    WebElement accountCreatedMessage;

    public boolean accountCreatedMessageIsDisplayed() {
        return wdWait.until(ExpectedConditions.visibilityOf(accountCreatedMessage)).isDisplayed();
    }

    public String accountCreatedMessageGetText() {
        return wdWait.until(ExpectedConditions.visibilityOf(accountCreatedMessage)).getText();
    }

    @FindBy(linkText = "Continue")
    WebElement continueButton;

    public void continueButtonClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
        driver.navigate().refresh();
        if (continueButton.isEnabled()) {
            wdWait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
        }
    }
}