package src.module;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static src.config.Common.serachPhone;

public class HomePage {

    public static String homeurl = "https://bj.58.com";
    public static String serachkeyword = "#keyword";
    public static String serachbtn = "#searchbtn";
    public static String jobbtn = "//div/div[3]/div[1]/h2/a";

    /**
     * 首页搜索
     */
    public void homeSerach(){
        System.out.println("首页搜索测试");
        $(serachkeyword).setValue(serachPhone);
        $(serachbtn).click();
    }

    /**
     * 首页搜索参数化搜索
     */
    public void homeSerachMore(String keyword){
        System.out.println("首页搜索测试");
        $(serachkeyword).setValue(keyword);
        $(serachbtn).click();
        back();
    }

    /**
     * 首页房产
     */
    public void homeHouse(){
        System.out.println("首页房产测试");
        $(By.name("北京房产")).click();
    }

    /**
     * 首页招聘
     */
    public void homeJob(){
        System.out.println("首页房产测试");
        $x(jobbtn).click();
        sleep(5000);
    }


}
