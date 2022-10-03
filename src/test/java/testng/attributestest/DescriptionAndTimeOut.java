package testng.attributestest;

import org.testng.annotations.Test;

public class DescriptionAndTimeOut {
    @Test(description = "This is an example of description attribute")
    public void testCases1() {
        System.out.println("Description attribute example");
    }

    @Test(timeOut = 2000)
    public void testCase2() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException exception ){}
    }
}
