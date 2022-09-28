package testing.dataprovider;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviders {
    @DataProvider(name = "two-numbers-addup")
    public Object[][] twoNumbersAddUp(){
        return new Object[][] {{2,3,5}, {1,3,4}, {32,3,1}};
    }

    @DataProvider(name = "data-provider-with-parameter")
    public  Object[][] dataProviderReceivingParameter(Method method){
        switch (method.getName()){
            case "add":
                return new Object[][] {{2,3,5}, {1,3,4}, {32,3,1}};
            case "sub":
                return new Object[][] {{4,1,3}, {4,3,1}, {5,3,1}};
        }
        return null;
    }
}
