package testing.attributestest;

import org.testng.annotations.Test;

public class DependsOnMethods {
    @Test(timeOut = 2000)
    public void testCases1(){
        System.out.println("Test 1");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException exception ){}
    }
    @Test(dependsOnMethods = "testCases1")
    public void testCases2(){
        System.out.println("Test 2");
    }
    @Test
    public void testCases3(){
        System.out.println("Test 3");
    }
}
