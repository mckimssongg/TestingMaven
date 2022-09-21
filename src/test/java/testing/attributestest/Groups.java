package testing.attributestest;

import org.testng.annotations.Test;

public class Groups {
    @Test(groups = {"regression", "smoke"})
    public void testCases1(){
        System.out.println("Test 1 >>> regression >> smoke");
    }
    @Test(groups = "regression")
    public void testCases2(){
        System.out.println("Test 2 >>> regression");
    }
    @Test(groups = "smoke")
    public void testCases3(){
        System.out.println("Test 3 >>> smoke");
    }
}
