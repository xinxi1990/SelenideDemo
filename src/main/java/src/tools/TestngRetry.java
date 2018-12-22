package src.tools;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


/**
 * @author xinxi
 * 失败重试机制
 */

public class TestngRetry implements IRetryAnalyzer{
    private static int retryCount = 0;
    private static int maxRetryCount = 1;


    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            System.out.println("Retrying test " + result.getName() + " with status "
                    + getResultStatusName(result.getStatus()) + " for the " + (retryCount+1) + " time(s).");
            retryCount++;
            return true;
        }
        return false;
    }

    public String getResultStatusName(int status) {//这个函数将状态码转换为状态文字。
        String resultName = null;
        if(status==1)
            resultName = "SUCCESS";
        if(status==2)
            resultName = "FAILURE";
        if(status==3)
            resultName = "SKIP";
        return resultName;
    }


    public static void resetRetryCount() {
        retryCount = 0;
    }
}
