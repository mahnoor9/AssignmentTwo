package TestCases;

import org.testng.annotations.Test;
import steps.MarkAsFavSteps;
import TestData.DataProviders;

import java.util.Map;

public class TestTwoMarkFavorite extends BaseClass{

    @Test  (dataProvider = "DataForEditForm", dataProviderClass = DataProviders.class)
    public void test(Map<String, String> sheet)
    {

            MarkAsFavSteps markAsFavSteps = new MarkAsFavSteps (driver);
            markAsFavSteps.MarkFavstep (sheet.get ("ToMarkFav"));

    }
}
