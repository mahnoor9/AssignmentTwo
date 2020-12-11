package testData;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DataProviders {

    @DataProvider(name = "DataForEditForm")
    public static Iterator<Object[]> GetData (Method method) {

        List<Map<String,String>> lom = new ArrayList<Map<String,String>> ();

        switch ((method.getName ())) {
            case "TestOne": {

            }
            case "TestTwo": {

            }
            case "TestThree": {

            }
        }
    }
}
