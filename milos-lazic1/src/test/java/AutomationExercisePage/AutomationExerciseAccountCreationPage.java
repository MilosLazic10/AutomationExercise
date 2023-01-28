package AutomationExercisePage;

import AutomationExerciseBase.BaseAETest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class AutomationExerciseAccountCreationPage extends BaseAETest {
    public AutomationExerciseAccountCreationPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "id_gender1")
    WebElement genderButton;
    public AutomationExerciseAccountCreationPage genderButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(genderButton)).click();
        return this;
    }
    @FindBy(id = "password")
    WebElement passwordInputField;
    public AutomationExerciseAccountCreationPage passwordInputFieldSendKeys(String password){
        wdWait.until(ExpectedConditions.elementToBeClickable(passwordInputField)).clear();
        passwordInputField.sendKeys(password);
        return this;
    }
    @FindBy(id = "days")
    WebElement dayOfBirthDropdown;
    public AutomationExerciseAccountCreationPage dayOfBirthDropdownSelect(){
        wdWait.until(ExpectedConditions.elementToBeClickable(dayOfBirthDropdown));
        Select dayOfBirthDropdown= new Select(driver.findElement(By.id("days")));
        dayOfBirthDropdown.selectByValue("1");
        return this;
    }
    @FindBy(id = "months")
    WebElement monthOfBirthDropdown;
    public AutomationExerciseAccountCreationPage monthOfBirthDropdownSelect(){
        wdWait.until(ExpectedConditions.elementToBeClickable(monthOfBirthDropdown));
        Select monthOfBirthDropdown=new Select(driver.findElement(By.id("months")));
        monthOfBirthDropdown.selectByValue("1");
        return this;
    }
    @FindBy(id = "years")
    WebElement yearOfBirthDropdown;
    public AutomationExerciseAccountCreationPage yearOfBirthDropdownSelect(){
        wdWait.until(ExpectedConditions.elementToBeClickable(yearOfBirthDropdown));
        Select yearOfBirthDropdown=new Select(driver.findElement(By.id("years")));
        yearOfBirthDropdown.selectByValue("2001");
        return this;
    }
    @FindBy(id = "first_name")
    WebElement firstNameInputField;
    public AutomationExerciseAccountCreationPage  firstNameInputFieldSendKeys(String firstname){
        wdWait.until(ExpectedConditions.elementToBeClickable(firstNameInputField)).clear();
        firstNameInputField.sendKeys(firstname);
        return this;
    }
    @FindBy(id = "last_name")
    WebElement lastNameInputField;
    public AutomationExerciseAccountCreationPage lastNameInputFieldSendKeys(String lastName){
        wdWait.until(ExpectedConditions.elementToBeClickable(lastNameInputField)).clear();
        lastNameInputField.sendKeys(lastName);
        return this;
    }
    @FindBy(id = "company")
    WebElement companyInputField;
    public AutomationExerciseAccountCreationPage companyInputFieldSendKeys(String company){
        wdWait.until(ExpectedConditions.elementToBeClickable(companyInputField)).clear();
        companyInputField.sendKeys(company);
        return this;
    }
    @FindBy(id = "address1")
    WebElement address1InputField;
    public AutomationExerciseAccountCreationPage address1InputFieldSendKeys(String address1){
        wdWait.until(ExpectedConditions.elementToBeClickable(address1InputField)).clear();
        address1InputField.sendKeys(address1);
        return this;
    }
    @FindBy(id = "address2")
    WebElement address2InputField;
    public AutomationExerciseAccountCreationPage address2InputFieldSendKeys(String address2){
        wdWait.until(ExpectedConditions.elementToBeClickable(address2InputField)).clear();
        address2InputField.sendKeys(address2);
        return this;
    }
    @FindBy(id = "country")
    WebElement countryDropdown;
    public AutomationExerciseAccountCreationPage countryDropdownSelect(){
        wdWait.until(ExpectedConditions.elementToBeClickable(countryDropdown));
        Select countryDropdown= new Select(driver.findElement(By.id("country")));
        countryDropdown.selectByValue("Canada");
        return this;
    }
    @FindBy(id = "state")
    WebElement stateInputFiled;
    public AutomationExerciseAccountCreationPage stateInputFiled(String state){
        wdWait.until(ExpectedConditions.elementToBeClickable(stateInputFiled)).clear();
        stateInputFiled.sendKeys(state);
        return this;
    }
    @FindBy (id = "city")
    WebElement cityInputField;
    public AutomationExerciseAccountCreationPage cityInputFieldSendKeys(String city){
        wdWait.until(ExpectedConditions.elementToBeClickable(cityInputField)).clear();
        cityInputField.sendKeys(city);
        return this;
    }
    @FindBy(id = "zipcode")
    WebElement zipcodeInputField;
    public AutomationExerciseAccountCreationPage zipcodeInputFieldSendKeys(String zipcode){
        wdWait.until(ExpectedConditions.elementToBeClickable(zipcodeInputField)).clear();
        zipcodeInputField.sendKeys(zipcode);
        return this;
    }
@FindBy(id = "mobile_number")
    WebElement mobileNumberInputField;
    public AutomationExerciseAccountCreationPage mobileNumberInputFieldSendKeys(String mobile){
        wdWait.until(ExpectedConditions.elementToBeClickable(mobileNumberInputField)).clear();
        mobileNumberInputField.sendKeys(mobile);
        return this;
    }
    @FindBy(css = "[data-qa=\"create-account\"]")
    WebElement createAccountButton;
    public void createAccountButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(createAccountButton)).isDisplayed();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        createAccountButton.click();
    }
}
