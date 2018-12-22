package src.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.impl.WebDriverContainer;
import com.codeborne.selenide.impl.WebDriverThreadLocalContainer;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.close;
import static src.config.Common.chromePath;

public class BasePage {

    @BeforeMethod
    public void setUp(){
        WebDriverContainer webDriverContainer = new WebDriverThreadLocalContainer();
        Configuration.screenshots = false;
        webDriverContainer.clearBrowserCache();
        Configuration.browser = WebDriverRunner.CHROME;
        System.setProperty("webdriver.chrome.driver", chromePath);
        System.out.println("完成driver初始化");
    }


    @AfterMethod
    public void tearDown(){
        close();
        System.out.println("测试用例结束!");
    }


}
