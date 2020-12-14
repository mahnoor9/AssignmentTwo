package questions;

import components.MarkFav;
import org.openqa.selenium.WebDriver;

public class HowManyFiltersAdded {

    WebDriver driver;

    public HowManyFiltersAdded(WebDriver driver)
    {
        this.driver= driver;

    }
/*
    public int numberOfAddedFilters(String nameOfView)
    {
        IsFavouriteMarked isFavouriteMarked = new IsFavouriteMarked (driver);
        if( isFavouriteMarked.checkIfFav (nameOfView) == false) {
            driver.findElement (MarkFav.viewAll);
            driver.findElement (MarkFav.CreatedByMeList (nameOfView)).click ();

    }*/
}
