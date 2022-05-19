package pages;

import helpers.Waiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static helpers.WebDriverClass.getDriver;

public abstract class BasePage{
    public static WebDriver webDriver;
    public Actions actions;
    public static String baseURL = "https://www.rate.am";
    public BasePage() {
        webDriver = getDriver();
    }
    public abstract String getUrl();
    public void openPageByUrl() {
        webDriver.get(getUrl());
    }
    public boolean isElementDisplayed(By location) {
        return findElement(location).isDisplayed();
    }
    public WebElement getElement(By location) {
        return getDriver().findElement(location);
    }
    public WebElement findElement(By location) {
        Waiter.getInstance().isElementDisplayed(location);
        return webDriver.findElement(location);
    }
    public void click(By locator) {
        WebElement element = Waiter.getInstance().waitForElementToBeClickable(locator);
        element.click();
    }
    public void click(By locator, int index) {
        List<WebElement> elements = Waiter.getInstance().waitForElementsToBeVisible(locator);
        elements.get(index).click();
    }
    public String getPageUrl(){
        return webDriver.getCurrentUrl();
    }
    public void writeInput(By locator,String s){
        WebElement element = Waiter.getInstance().waitForElementToBeVisible(locator);
        element.sendKeys(s);
    }
    public void scrollToElement(By locator) {
        WebElement element = Waiter.getInstance().waitForElementToBeClickable(locator);
        actions.moveToElement(element).perform();
    }
    public void scrollToElement(By locator, int index){
        List<WebElement> elements =  Waiter.getInstance().waitForElementsToBeVisible(locator);
        actions.moveToElement(elements.get(index));
    }


}