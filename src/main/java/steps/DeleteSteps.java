package steps;

import components.DeleteView;
import components.MarkFav;
import org.openqa.selenium.WebDriver;
import questions.DoesViewExist;
import questions.IsFavouriteMarked;

public class DeleteSteps {
    WebDriver driver;

    public DeleteSteps(WebDriver driver)
    {
        this.driver = driver;
    }

    public void DeleteView(String name)
    {
        DoesViewExist doesViewExist = new DoesViewExist (driver);

        if(doesViewExist.exist (name)==true)
        {
            driver.findElement (MarkFav.viewAll);
            IsFavouriteMarked isFavouriteMarked = new IsFavouriteMarked (driver);
            if( isFavouriteMarked.checkIfFav (name) == false) {
                driver.findElement (MarkFav.CreatedByMeList (name)).click ();
                driver.findElement (DeleteView.deleteButton).click ();
                driver.findElement (DeleteView.yesButton).click ();
            }
            else
            {
                driver.findElement (MarkFav.favList (name)).click ();
                driver.findElement (DeleteView.deleteButton).click ();
                driver.findElement (DeleteView.yesButton).click ();

            }
        }

    }
}
