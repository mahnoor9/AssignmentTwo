package testData;

import org.testng.annotations.DataProvider;
import utils.DataFromExcelSheet;

import java.lang.reflect.Method;
import java.util.*;

public class DataProviders {

    @DataProvider(name = "DataForEditForm")
    public static Iterator<Object[]> GetData () throws Exception {

        List<Map<String,String>> lom = DataFromExcelSheet.readFromSheet ("src/test/java/testData/Book1.xlsx","Sheet1");

      //  switch ((method.getName ())) {
        //    case "Test": {

                Collection<Object[]> data = new ArrayList<Object[]> ();
                lom.forEach(item -> data.add(new Object[]{item}));
                return data.iterator ();




    }
}
