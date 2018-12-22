package testcase;

import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import src.base.BasePage;
import src.module.HomePage;
import src.tools.SetDataProvider;
import static com.codeborne.selenide.Selenide.open;

@Feature("测试首页")
public class Test_HomePage extends BasePage {


    public HomePage homePage;
    public static String homeurl = "https://bj.58.com";

    @BeforeMethod
    public void setUp(){
        super.setUp();
        homePage = new HomePage();
        open(homeurl);
    }


    @Issue("请查看这个Issue")
    @Story("测试首页搜索")
    @Description("这是测试首页搜索")
    @Link("https://example.org")
    @TestCaseId("1")
    @Test
    public void test_homeSerach(){
        homePage.homeSerach();
    }

    @Issue("请查看这个Issue")
    @Story("测试首页搜索参数化")
    @Description("测试首页搜索参数化")
    @Link("https://example.org")
    @TestCaseId("2")
    @Test(dataProvider = "getData",dataProviderClass = SetDataProvider.class)
    public void test_homeSerachMore(String keyword){
        homePage.homeSerachMore(keyword);
    }


    @TestCaseId("3")
    @Description("测试首页房产-失败用例")
    @Test()
    public void test_homeHouse(){
        homePage.homeHouse();
    }


    @Test()
    public void test_homeJob(){
        homePage.homeJob();
    }


}
