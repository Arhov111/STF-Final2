package pages;

import helpers.Waiter;
import locators.RegisterPageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage{

    private By registerNowButton = By.xpath(RegisterPageConstants.registerNowButton);


    @Override
    public String getUrl() {
        return baseURL + "/am/log-in";
    }

    public boolean isRegisterNowDisplayed(){
        return isElementDisplayed(registerNowButton);
    }
    public void clickRegisterNow() {
        click(registerNowButton);
    }
}
