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

    public void goToRegisterNowPageTest(){
        HomePage homePage = new HomePage();
        RegisterPage registerPage = new RegisterPage();
        Assert.assertTrue(homePage.isRegisterDisplayed());
        homePage.clickRegister();
        Assert.assertTrue(registerPage.isRegisterNowDisplayed());
        registerPage.clickRegisterNow();
    }



}
