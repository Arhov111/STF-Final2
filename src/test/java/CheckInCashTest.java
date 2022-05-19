import org.junit.Assert;
import org.junit.Test;
import pages.CurrencyCalculatorPage;
import pages.HomePage;

public class CheckInCashTest {

    @Test

    public void checkCashFromCurrencyCalculator(){
        HomePage homePage = new HomePage();
        CurrencyCalculatorPage currencyCalculatorPage = new CurrencyCalculatorPage();
        //homePage.scrollToElement(currencyCalc);
        Assert.assertTrue(homePage.isCurrencyCalculatorDisplayed());
        homePage.clickCurrencyCalculator();
        Assert.assertTrue(currencyCalculatorPage.isCashDisplayed());
        currencyCalculatorPage.clickCash();

    }


}
