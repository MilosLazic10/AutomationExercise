package HerokuappPage;

import HerokuappBase.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SecureAreaPage extends BaseTest {
    public SecureAreaPage(){
        PageFactory.initElements(driver,this);

    }
    @FindBy(className = "subheader")
    WebElement welcomeToSecureAreaMessage;
    public boolean welcomeToSecureAreaMessageIsDisplayed(){
      return   wdWait.until(ExpectedConditions.visibilityOf(welcomeToSecureAreaMessage)).isDisplayed();
    }
public String welcomeToSecureAreaMessageGetText(){
       return wdWait.until(ExpectedConditions.visibilityOf(welcomeToSecureAreaMessage)).getText();
}
@FindBy(linkText = "Logout")
    WebElement logOutButton;
    public void logOutButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(logOutButton)).click();
    }
}
