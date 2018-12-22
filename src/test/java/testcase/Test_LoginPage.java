package testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import src.base.BasePage;
import src.module.LoginPage;

public class Test_LoginPage extends BasePage {

    public LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        super.setUp();
        loginPage = new LoginPage();
    }


    @Test
    public void test_login(){
        loginPage.login();
    }


}
