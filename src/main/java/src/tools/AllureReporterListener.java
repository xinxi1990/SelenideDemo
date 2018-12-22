package src.tools;

import io.qameta.allure.Attachment;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import static com.codeborne.selenide.Selenide.screenshot;
import static src.tools.Common.getImageStr;
import java.io.IOException;


public class AllureReporterListener extends TestListenerAdapter {

    public static int Success = 0;
    public static int Failure = 0;
    public static String imgPath;
    public static byte[] imgStr;


    @Override
    public void onTestSuccess(ITestResult tr) {
        super.onTestSuccess(tr);
        Success ++;
        System.out.println("成功了..");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        super.onTestFailure(iTestResult);
        System.out.println("失败了..");
        try {
            takeScreenShot(iTestResult.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        super.onTestSkipped(iTestResult);
    }

    @Attachment(value = "Failure in method {0}", type = "image/png")
    private byte[] takeScreenShot(String methodName) throws IOException {
        imgPath = screenshot(methodName);
        imgStr = getImageStr(imgPath);
        return imgStr;
    }




}
