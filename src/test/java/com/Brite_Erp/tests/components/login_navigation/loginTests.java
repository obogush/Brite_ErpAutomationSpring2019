package com.Brite_Erp.tests.components.login_navigation;

import com.Brite_Erp.pages.login_navigation.LoginPage;
import com.Brite_Erp.utilities.ConfigurationReader;
import com.Brite_Erp.utilities.TestBase;
import org.testng.annotations.Test;

public class loginTests extends TestBase { //for tests
    LoginPage loginPage = new LoginPage();
    @Test (description = "user should be able to login with correct credentials")
    public void loginTest(){
        String username = ConfigurationReader.getProperty("em");
        String password = ConfigurationReader.getProperty("empw");
        loginPage.login(username, password);
    }

    @Test (description = "user should not be able to login with incorrect credentials")
    public void loginTestInvalid(){
        LoginPage loginPage = new LoginPage();
        //String username = ConfigurationReader.getProperty("em");
        //String password = ConfigurationReader.getProperty("empw");
        String username = "wrongUser";
        String password =  "wrongPW";
        loginPage.login(username, password);
    }
}
