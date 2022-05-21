import locators.HomePageConstants;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.CurrencyCalculatorPage;
import pages.HomePage;
import pages.RegisterNowPage;
import pages.RegisterPage;

public class HomePageTests {


    @Test

    public void goToRegisterNowPageTest() {
        HomePage homePage = new HomePage();
        RegisterPage registerPage = new RegisterPage();
        RegisterNowPage registerNowPage = new RegisterNowPage();
        Assert.assertTrue(homePage.isRegisterDisplayed());
        homePage.clickRegister();
        Assert.assertTrue(registerPage.isRegisterNowDisplayed());
        registerPage.clickRegisterNow();
        registerNowPage.clickEmailSection();
        registerNowPage.clickPasswordSection();
        registerNowPage.clickRepeatPasswordSection();
        registerNowPage.clickAgreeWithTSSection();
        Assert.assertFalse(registerNowPage.checkEmailText());
        Assert.assertFalse(registerNowPage.checkPasswordText());
        Assert.assertFalse(registerNowPage.checkRepeatPasswordText());
    }

    @Test
    public void emailInputIsValidTest(){
        HomePage homePage = new HomePage();
        homePage.clickRegister();
        RegisterPage registerPage = new RegisterPage();
        registerPage.clickRegisterNow();
        RegisterNowPage registerNowPage = new RegisterNowPage();
        registerNowPage.clickEmailSection();
        registerNowPage.validEmailInput();
        registerNowPage.clickPasswordSection();
        registerNowPage.clickRepeatPasswordSection();
        Assert.assertFalse(registerNowPage.checkEmailText());
    }
    @Test
    public void emailInputIsInvalidTest(){
        HomePage homePage = new HomePage();
        homePage.clickRegister();
        RegisterPage registerPage = new RegisterPage();
        registerPage.clickRegisterNow();
        RegisterNowPage registerNowPage = new RegisterNowPage();
        registerNowPage.clickEmailSection();
        registerNowPage.inValidEmailInput();
        registerNowPage.clickPasswordSection();
        registerNowPage.clickRepeatPasswordSection();
        Assert.assertTrue(registerNowPage.checkEmailText());
    }

    @Test
    public void passwordInputIsValidTest(){
        HomePage homePage = new HomePage();
        homePage.clickRegister();
        RegisterPage registerPage = new RegisterPage();
        registerPage.clickRegisterNow();
        RegisterNowPage registerNowPage = new RegisterNowPage();
        registerNowPage.clickEmailSection();
        registerNowPage.validEmailInput();
        registerNowPage.clickPasswordSection();
        registerNowPage.passwordValidInput();
        registerNowPage.clickRepeatPasswordSection();
        Assert.assertFalse(registerNowPage.checkPasswordText());
    }

    @Test
    public void passwordInputIsInValidTest(){
        HomePage homePage = new HomePage();
        homePage.clickRegister();
        RegisterPage registerPage = new RegisterPage();
        registerPage.clickRegisterNow();
        RegisterNowPage registerNowPage = new RegisterNowPage();
        registerNowPage.clickEmailSection();
        registerNowPage.validEmailInput();
        registerNowPage.clickPasswordSection();
        registerNowPage.passwordInValidInput();
        registerNowPage.clickRepeatPasswordSection();
        Assert.assertTrue(registerNowPage.checkPasswordText());
    }

    @Test
    public void repeatPasswordInputIsValidTest(){
        HomePage homePage = new HomePage();
        homePage.clickRegister();
        RegisterPage registerPage = new RegisterPage();
        registerPage.clickRegisterNow();
        RegisterNowPage registerNowPage = new RegisterNowPage();
        registerNowPage.clickEmailSection();
        registerNowPage.validEmailInput();
        registerNowPage.clickPasswordSection();
        registerNowPage.passwordValidInput();
        registerNowPage.clickRepeatPasswordSection();
        registerNowPage.repeatPasswordValidInput();
        Assert.assertFalse(registerNowPage.checkRepeatPasswordText());

    }
    @Test
    public void repeatPasswordInputIsInValidTest(){
        HomePage homePage = new HomePage();
        homePage.clickRegister();
        RegisterPage registerPage = new RegisterPage();
        registerPage.clickRegisterNow();
        RegisterNowPage registerNowPage = new RegisterNowPage();
        registerNowPage.clickEmailSection();
        registerNowPage.validEmailInput();
        registerNowPage.clickPasswordSection();
        registerNowPage.passwordValidInput();
        registerNowPage.clickRepeatPasswordSection();
        registerNowPage.repeatPasswordInValidInput();
        Assert.assertTrue(registerNowPage.checkRepeatPasswordText());

    }

}
