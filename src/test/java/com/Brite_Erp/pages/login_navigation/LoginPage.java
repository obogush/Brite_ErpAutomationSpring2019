package com.Brite_Erp.pages.login_navigation;

import com.Brite_Erp.utilities.ConfigurationReader;
import com.Brite_Erp.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage { // for Web elements and methods; locators
    //
    private WebDriver driver = Driver.getDriver();
    private WebDriverWait wait = new WebDriverWait(driver, Long.valueOf(ConfigurationReader.getProperty("explicitwait")));
    @FindBy(xpath="//input[@name='login']")
    public WebElement usernameElement;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordElement;
    @FindBy(xpath="//button[@class='btn btn-primary']")
    public WebElement loginButtonElement;
    public LoginPage(){
        PageFactory.initElements(driver, this);
        // PageFactory.initElements(driver, LoginPage.class); other way to write it
    }
    public void login(String username, String password){
        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }
}