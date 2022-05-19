package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverClass {
    private static WebDriver driver;
    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "/Users/mac/Desktop/STF-Final/src/resources/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://www.rate.am");
        }
        return driver;
    }
    public static void quitDriver() {
        getDriver().quit();
        driver = null;
    }

}