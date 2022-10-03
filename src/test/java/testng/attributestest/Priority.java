package testng.attributestest;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 3)
    public void testCases1(){
        System.out.println("Test 1");
    }
    @Test(dependsOnMethods = "testCases1")
    public void testCases2(){
        System.out.println("Test 2");
    }
    @Test(priority = 1)
    public void testCases3(){
        System.out.println("Test 3");
    }
}
