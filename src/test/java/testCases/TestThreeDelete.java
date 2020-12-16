package testCases;

import org.testng.annotations.Test;
import questions.DoesViewExist;
import questions.IsFavouriteMarked;
import steps.DeleteSteps;
import testData.DataProviders;

import java.util.Map;

public class TestThreeDelete extends BaseClass {

    @Test (dataProvider = "DataForEditForm", dataProviderClass = DataProviders.class)
    public void test(Map<String, String> sheet)
    {
        DeleteSteps deleteSteps = new DeleteSteps (driver);
        deleteSteps.DeleteView (sheet.get ("ToDelete"));
    }
}
