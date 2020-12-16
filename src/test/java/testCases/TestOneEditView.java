package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import questions.HowManyFiltersAdded;
import questions.WhichColsAdded;
import steps.FillEditForm;

import steps.GotoEditSteps;
import testData.DataProviders;

import java.util.*;

import static utils.GetSortedList.sorted;

public class TestOneEditView extends BaseClass {

    @Test(dataProvider = "DataForEditForm", dataProviderClass = DataProviders.class)

    public void test (Map<String, String> sheet) {

       /* GotoEditSteps gotoEditSteps= new GotoEditSteps (driver);
        gotoEditSteps.openEditView ("newview");
        FillEditForm fillEditForm= new FillEditForm (driver);
        fillEditForm.FillForm (sheet.get("Columns"),sheet.get("Filter"),sheet.get("Criteria"),sheet.get("Value"));

        WhichColsAdded whichColsAdded = new WhichColsAdded (driver);

        //Assertion For Columns Added

        List<String> expectedCol= whichColsAdded.addedColumns ();
        Assert.assertEquals (expectedCol, sorted(sheet.get ("Columns"))); */

        HowManyFiltersAdded howManyFiltersAdded = new HowManyFiltersAdded (driver);
        howManyFiltersAdded.numberOfAddedFilters ("sdf");

    }
}
