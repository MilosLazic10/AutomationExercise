package AutomationExerciseBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseAETest {
    public static WebDriver driver;
    public static WebDriverWait wdWait;
    public static Actions actions;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        wdWait=new WebDriverWait( driver, Duration.ofSeconds(10));
        actions=new Actions(driver);
        driver.navigate().to("http://automationexercise.com");
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
   //     driver.quit();
    }
}