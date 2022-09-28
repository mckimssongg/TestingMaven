package testing.dataprovider;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InheritedDataProvider {
    @Test(dataProvider = "two-numbers-addup", dataProviderClass = DataProviders.class)
    public void twoNumbersAddValidator (int number1, int number2, int result){
        int total = number1 + number2;
        Assert.assertEquals(result, total);
    }
}
