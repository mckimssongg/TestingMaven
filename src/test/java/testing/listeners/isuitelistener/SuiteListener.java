package testing.listeners.isuitelistener;

import org.testng.ISuite;

public class SuiteListener implements org.testng.ISuiteListener {
    public void onStart(ISuite suite){
        System.out.println("---> Method on start" + suite.getName());
    }
    public void onFinish(ISuite suite){
        System.out.println("---> Method on finish" + suite.getName());
    }
}
