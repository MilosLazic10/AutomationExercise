package AutoExercisePage;

import AutoExerciseBase.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;

public class SharedMethods extends Base {
    String url = "https://automationexercise.com/login";

    public SharedMethods() {
        PageFactory.initElements(driver, this);
    }

    public static boolean validateUrl(WebDriver driver, String expUrl) {
        boolean result = false;
        if (driver.getCurrentUrl().equalsIgnoreCase(expUrl)) {
            result = true;
        }
        return result;
    }
}