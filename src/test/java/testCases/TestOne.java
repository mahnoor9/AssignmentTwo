package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import questions.WhichColsAdded;
import steps.AddFiltersSteps;
import steps.FillEditForm;

import steps.GotoEditSteps;
import testData.DataProviders;

import java.util.*;

public class TestOne extends BaseClass {

    @Test (dataProvider = "DataForEditForm", dataProviderClass = DataProviders.class)

    public void test(Map<String, String> sheet)
    {

        FillEditForm fillEditForm= new FillEditForm (driver);
        fillEditForm.addThings (sheet.get("Columns"),sheet.get("Filter"),sheet.get("Criteria"),sheet.get("Value"));
        WhichColsAdded whichColsAdded = new WhichColsAdded (driver);
       List<String> expectedCol= whichColsAdded.addedColumns ();
        Assert.assertEquals (expectedCol,sheet.get("Columns"));
    }
}
