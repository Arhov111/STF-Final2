import org.junit.Assert;
import org.junit.Test;
import pages.CurrencyCalculatorPage;
import pages.HomePage;

public class CheckNonCashTest {

    @Test

    public void checkNonCashFromCurrencyCalculator(){
        HomePage homePage = new HomePage();
        CurrencyCalculatorPage currencyCalculatorPage = new CurrencyCalculatorPage();
        Assert.assertTrue(homePage.isCurrencyCalculatorDisplayed());
        homePage.clickCurrencyCalculator();
        Assert.assertTrue(currencyCalculatorPage.isNonCashDisplayed());
        currencyCalculatorPage.clickNonCash();

    }

}
