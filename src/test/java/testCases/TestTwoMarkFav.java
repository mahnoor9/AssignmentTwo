package testCases;

import org.testng.annotations.Test;
import questions.IsFavouriteMarked;
import steps.MarkAsFavSteps;

public class TestTwoMarkFav extends BaseClass{

    @Test
    public void test()
    {

            MarkAsFavSteps markAsFavSteps = new MarkAsFavSteps (driver);
            markAsFavSteps.MarkFavstep ("Test_Cloned_Edited");

    }
}
