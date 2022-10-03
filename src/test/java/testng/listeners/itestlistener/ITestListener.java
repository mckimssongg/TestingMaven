package testng.listeners.itestlistener;

import org.testng.ITestContext;
import org.testng.ITestResult;

public class ITestListener implements org.testng.ITestListener {
    public void onStart(ITestContext context){
        System.out.println("---> onStart method");
    }

    public void onFinish(ITestContext context){
        System.out.println("---> onFinish method");
    }

    public void onTestStart(ITestResult result){
        System.out.println("---> onTestStart method" + result.getTestName());
    }

    public void onTestSuccess(ITestResult result){
        System.out.println("---> onTestSuccess method" + result.getTestName()+ "success");
    }

    public void onTestFailure(ITestResult result){
        System.out.println("---> onTestFailure method" + result.getTestName() + "failed");
    }

    public void onTestSkipped(ITestResult result){
        System.out.println("---> onTestSkipped method" + result.getTestName()+ "skipped");
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult result){
        System.out.println("---> onTestFailureWithinSuccessPercentage method" + result.getTestName());
    }

}
