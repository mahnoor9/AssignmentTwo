package questions;

import components.MarkFav;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DoesElementExist;

public class IsFavouriteMarked {
    public WebDriver driver;
    public IsFavouriteMarked(WebDriver driver)
    {
        this.driver= driver;
    }


    public boolean checkIfFav(String s)
    {
        DoesElementExist doesElementExist = new DoesElementExist (driver);
        driver.findElement (MarkFav.viewAll);
        if(doesElementExist.isElementPresent (MarkFav.favList (s)) == true)
        {
            System.out.println ("It is already fav");
            return true;
        }
        else
            return false;
    }
}
