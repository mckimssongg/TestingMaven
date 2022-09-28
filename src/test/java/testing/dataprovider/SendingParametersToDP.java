package testing.dataprovider;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SendingParametersToDP {

    @Test(dataProvider = "data-provider-with-parameter", dataProviderClass = DataProviders.class)
    public void add(int number1, int number2, int result){
        int total = number1 + number2;
        Assert.assertEquals(total, result);
    }

    @Test(dataProvider = "data-provider-with-parameter", dataProviderClass = DataProviders.class)
    public void sub(int number1, int number2, int result){
        int total = number1 - number2;
        Assert.assertEquals(total, result);
    }
}
