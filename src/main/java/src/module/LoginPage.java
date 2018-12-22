package src.module;

import src.config.Secret;

import static com.codeborne.selenide.Selenide.*;


public class LoginPage {

    public static String loginUrl = "https://bj.58.com";
    public static String doLogin = "#commonTopbar_login > a:nth-child(1)";
    public static String doPassword = "#pwdLogin > i";
    public static String userLogin = "#usernameUser";
    public static String userPassword = "//*[@id=\"passwordUserText\"]";
    public static String loginBtn = "#btnSubmitUser";


    /**
     * 登录
     */
    public void login(){
        System.out.println("登录测试");
        open(loginUrl);
        $(doLogin).click();
        $(doPassword).click();
        $(userLogin).setValue(Secret.username);
        $x(userPassword).click();
        $x(userPassword).setValue(Secret.pwd);
        $(loginBtn).click();
        sleep(5000);
    }


}
