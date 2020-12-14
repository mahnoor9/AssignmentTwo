package steps;

import components.MarkFav;
import org.openqa.selenium.WebDriver;
import questions.IsFavouriteMarked;

public class MarkAsFavSteps {
    public WebDriver driver;

    public MarkAsFavSteps(WebDriver driver)
    {
        this.driver = driver;
    }
    public void MarkFavstep(String s)
    {
        IsFavouriteMarked isFavouriteMarked = new IsFavouriteMarked (driver);
        if( isFavouriteMarked.checkIfFav (s) == false) {
            driver.findElement (MarkFav.viewAll);
            driver.findElement (MarkFav.CreatedByMeList (s)).click ();
            driver.findElement (MarkFav.favButton).click ();
        }
        else
        {
            System.out.println ("Already Marked as fav");
        }
    }
}
