package AutoExercisePage;

import AutoExerciseBase.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends Base {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "Home")
    WebElement homeButton;
    public String homeButtonIsSelected(){
        wdWait.until(ExpectedConditions.visibilityOf(homeButton));
        return homeButton.getAttribute("style=\"color: orange;\"");
    }
    @FindBy(partialLinkText = "Login")
    WebElement signLoginButton;
    public void signLoginButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(signLoginButton)).click();
    }

}
