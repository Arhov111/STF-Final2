package pages;

import locators.RegisterNowPageConstants;
import locators.RegisterPageConstants;
import org.openqa.selenium.By;

public class RegisterNowPage extends BasePage{
    @Override
    public String getUrl() {
        return baseURL + "/am/new-user";
    }
    private By emailSection = By.xpath(RegisterNowPageConstants.emailSection);
    private By passwordSection = By.xpath(RegisterNowPageConstants.passwordSection);
    private By repeatPasswordSection = By.xpath(RegisterNowPageConstants.repeatPasswordSection);
    private By invalidEmail = By.xpath(RegisterNowPageConstants.invalidEmail);
    private By invalidPassword = By.xpath(RegisterNowPageConstants.invalidPassword);
    private By agreeWithTC = By.xpath(RegisterNowPageConstants.agreeWithTC);


    public void clickEmailSection() {
        click(emailSection);
    }

    public boolean checkEmailText(){
        if (isElementDisplayed(invalidEmail)){
            return true;
        }
        return false;
    }

    public void clickPasswordSection() {
        click(passwordSection);
    }

    public boolean checkPasswordText(){
        if (isElementDisplayed(invalidEmail)){
            return true;
        }
        return false;
    }
    public void clickRepeatPasswordSection() {
        click(repeatPasswordSection);
    }
    public boolean checkRepeatPasswordText(){
        if (isElementDisplayed(invalidPassword)){
            return true;
        }
        return false;
    }

    public void clickAgreeWithTSSection() {
        click(agreeWithTC);
    }
    public void validEmailInput(){
        writeInput(emailSection, "araks_hovhannisyan@edu.aua.am");
    }
    public void inValidEmailInput(){
        writeInput(emailSection, "araks_hovhannisyan.edu.aua.am");
    }
    public void passwordValidInput(){
        writeInput(passwordSection,"pass1234");
    }
    public void passwordInValidInput(){
        writeInput(passwordSection,"1");
    }
    public void repeatPasswordValidInput(){
        writeInput(passwordSection,"pass1234");
    }
    public void repeatPasswordInValidInput(){
        writeInput(passwordSection,"1");
    }


}
