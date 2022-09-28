package testing.dataprovider;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {
    @Test
    //si es mas de un parametro debe de ir en llaves
    @Parameters({"int1","int2"})
    public void addTwoNumbers(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("The result: " + result);
    }
}
