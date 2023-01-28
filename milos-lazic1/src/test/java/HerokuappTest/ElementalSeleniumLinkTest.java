package HerokuappTest;

import HerokuappBase.BaseTest;
import HerokuappPage.LoginPageHerokuapp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElementalSeleniumLinkTest extends BaseTest {
    LoginPageHerokuapp loginPageHerokuapp;
    String url= "http://elementalselenium.com/";
    Integer tabNumber=2;
    Integer tab=1;

    @Before
    public void setUpSuccessfulTest() {
        loginPageHerokuapp = new LoginPageHerokuapp();
    }
    @Test
    public void ElementalSeleniumLinkTest(){
loginPageHerokuapp.seleniumLinkClick();
loginPageHerokuapp.switchToNewTab(tabNumber, tab);
        Assert.assertEquals(url, driver.getCurrentUrl());

    }
}