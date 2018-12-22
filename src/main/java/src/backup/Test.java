package src.backup;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.impl.WebDriverContainer;
import com.codeborne.selenide.impl.WebDriverThreadLocalContainer;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;


public class Test {

    private static final String CHROME_DRIVER_PATH = "/Users/xinxi/Documents/SelenideDemo/src/main/java/Demo/chromedriver";

    public static void main(String[] args) throws InterruptedException {
         WebDriverContainer webDriverContainer = new WebDriverThreadLocalContainer();
         Configuration.screenshots = false;
         webDriverContainer.clearBrowserCache();
         Configuration.browser = WebDriverRunner.CHROME;
         System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        //Configuration.browser = WebDriverRunner.CHROME;
        //Configuration.remote = "http://39.104.122.87:5001/wd/hub";
        //Configuration.baseUrl = "https://www.zhihu.com/";
         System.out.println("启动浏览器!");
         open("http://localhost:8080/login");
         System.out.println("打开网站!");
         $("#username > input").setValue("zhangsan");
         $("#password > input").setValue("1111111");
         $(By.xpath("//*[@id=\"app\"]/div/div/div/form/div[3]/div/button")).click();
         Thread.sleep(2000);
         $(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[1]/ul/li[5]/div")).click();
         $(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[1]/ul/li[5]/ul/li[1]")).click();
         $(By.xpath("//*[@id=\"app\"]/div/div/div[5]/div[2]/div/div/div/div/button/span")).should(disappear).click();
         System.out.println("创建性能报告!");

         $(By.xpath("//*[@id=\"app\"]/div/div/div[5]/div[2]/div/div/div/div/div/div[2]/form/div[1]/div[2]/div[1]/div/div/input")).setValue("basepage");
         close();

    }





}
