package com.Brite_Erp.pages.crm;

import com.Brite_Erp.utilities.ConfigurationReader;
import com.Brite_Erp.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class crmPage {

    private WebDriver driver = Driver.getDriver();
    private WebDriverWait wait = new WebDriverWait(driver, Long.valueOf(ConfigurationReader.getProperty("explicitwait")));

    @FindBy(xpath="//input[@id='login']")
    public WebElement username;

    @FindBy(xpath ="//input[@id='password']" )
    public WebElement password;

    @FindBy(xpath ="//span[contains(text(),'CRM')]" )
    public WebElement crmbutton;

    @FindBy(xpath = "//button[@aria-label='list']")
    public WebElement listViewButton;

    @FindBy(xpath = "//tr[2]//td[9]")
    public WebElement expectedRevenue;

    @FindBy(css = "button[aria-label=pivot]") //css selector
    public WebElement pivot;

    @FindBy(css ="td[class=o_pivot_header_cell_closed]" ) //css for New button
    public WebElement pivotNew;

    @FindBy(xpath ="//a[.='Opportunity']" )
    public WebElement opportunityLocator ;

    @FindBy(css = "tr:nth-child(5) > td:nth-child(2)") //css selector for expectedValue in pivot view
    public WebElement pivotExpectedRevenue ;

    @FindBy(css = "tr:nth-child(3) > td:nth-child(2)")//book brand new
    public WebElement value1;

    @FindBy(css ="tr:nth-child(4) > td:nth-child(2)" )//book sale
    public WebElement value2;

    @FindBy(css ="tr:nth-child(5) > td:nth-child(2)" )//testing
    public WebElement value3;

    @FindBy(css= "tr:nth-child(1) > td:nth-child(2)")
    public WebElement totalRevenueLocator;




    public crmPage(){
    PageFactory.initElements(driver, this);
    // PageFactory.initElements(driver, LoginPage.class); other way to write it
}

}
