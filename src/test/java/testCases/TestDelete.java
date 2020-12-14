package testCases;

import org.testng.annotations.Test;
import questions.DoesViewExist;
import questions.IsFavouriteMarked;
import steps.DeleteSteps;

public class TestDelete extends BaseClass {

    @Test
    public void test()
    {
        DeleteSteps deleteSteps = new DeleteSteps (driver);
        deleteSteps.DeleteView ("newview");
    }
}
