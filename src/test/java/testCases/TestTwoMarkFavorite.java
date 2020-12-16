package testCases;

import org.testng.annotations.Test;
import questions.IsFavouriteMarked;
import steps.MarkAsFavSteps;
import testData.DataProviders;

import java.util.Map;

public class TestTwoMarkFavorite extends BaseClass{

    @Test  (dataProvider = "DataForEditForm", dataProviderClass = DataProviders.class)
    public void test(Map<String, String> sheet)
    {

            MarkAsFavSteps markAsFavSteps = new MarkAsFavSteps (driver);
            markAsFavSteps.MarkFavstep (sheet.get ("ToMarkFav"));

    }
}
