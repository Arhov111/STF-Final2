package pages;

import helpers.Waiter;
import locators.CurrencyCalculatorConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CurrencyCalculatorPage extends BasePage{

    private By cash = By.xpath(CurrencyCalculatorConstants.cash);
    private By non_cash = By.xpath(CurrencyCalculatorConstants.non_cash);

    @Override
    public String getUrl() {
        return baseURL + "/#calc";
    }

    public boolean isCashDisplayed(){
        return isElementDisplayed(cash);
    }
    public void clickCash() {
        click(cash);
    }

    public boolean isNonCashDisplayed(){
        return isElementDisplayed(non_cash);
    }
    public void clickNonCash() {
        click(non_cash);
    }




}
