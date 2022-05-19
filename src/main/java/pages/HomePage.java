package pages;


import helpers.Waiter;
import locators.HomePageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    private By goToRegister = By.xpath(HomePageConstants.goToRegister);
    private By gel = By.xpath(HomePageConstants.gel);
    private By aed = By.xpath(HomePageConstants.aed);
    private By currency_calculator = By.xpath(HomePageConstants.currency_calculator);

    @Override
    public String getUrl() {
        return baseURL;
    }

    public boolean isRegisterDisplayed(){
        return isElementDisplayed(goToRegister);
    }
    public void clickRegister() {
        click(goToRegister);
    }

    public boolean isCurrencyCalculatorDisplayed(){
        return isElementDisplayed(currency_calculator);
    }
    public void clickCurrencyCalculator() {
        click(currency_calculator);
    }

    public boolean isGelDisplayed(){
        return isElementDisplayed(gel);
    }
    public void clickGel() {
        click(gel);
    }
    public boolean isAedDisplayed(){
        return isElementDisplayed(aed);
    }
    public void clickAed() {
        click(aed);
    }



}