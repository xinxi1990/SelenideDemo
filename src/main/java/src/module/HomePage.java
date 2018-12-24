package src.module;


import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static src.config.Common.serachPhone;

public class HomePage {

    public static String homeurl = "https://bj.58.com";
    public static String serachkeyword = "#keyword";
    public static String serachbtn = "#searchbtn";
    public static String jobbtn = "//div/div[3]/div[1]/h2/a";
    public static String pushjob = "/html/body/div[2]/div/div[2]/a[1]";

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
    public void homeJob() {
        System.out.println("首页招聘测试");
        $x(jobbtn).shouldHave(text("北京招聘"));
        $x(jobbtn).should(exist);
        $x(jobbtn).shouldBe(visible);
    }

    /**
     * 首页本地服务
     */
    public void homeLocal() {
        System.out.println("首页本地服务测试");
        $(By.xpath("//a[text()='本地服务大全']")).click();
        // 使用文案查询元素
        switchTo().window(1);
        //按照index切换到新打开的窗口
        $(By.xpath("//a[text()='免费发布']")).click();

    }


}
