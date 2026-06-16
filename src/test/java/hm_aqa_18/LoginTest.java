package hm_aqa_18;

import aqa_hm_18.HomePage;
import aqa_hm_18.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void LoginToHotlineTest(){

        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnLoginMenu();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.enterEmailValue("sofiashevtcuk2.04@gmail.com");
        Assert.assertTrue(
                loginPage.isEmailFieldDisplayed(),
                "Email field is not displayed"
        );

        loginPage.enterPasswordValue("testPassword");
        Assert.assertTrue(
                loginPage.isPasswordFieldDisplayed(),
                "Password field is not displayed"
        );
    }
}
