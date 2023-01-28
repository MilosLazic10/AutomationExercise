package AutomationExercisePage;

import AutomationExerciseBase.BaseAETest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AutomationExerciseHomePage extends BaseAETest {
    public AutomationExerciseHomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(partialLinkText = "Signup ")
    WebElement signUpLink;
    public void signUpLinkClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(signUpLink)).click();
    }
    public boolean signUpLinkIsDisplayed(){
      return   wdWait.until(ExpectedConditions.elementToBeClickable(signUpLink)).isDisplayed();
    }
}
