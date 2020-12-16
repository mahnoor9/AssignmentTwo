package questions;

import components.MarkFav;
import components.DasboardColView;
import org.openqa.selenium.WebDriver;
import utils.DoesElementExist;

public class DoesViewExist {

    WebDriver driver;

    public DoesViewExist(WebDriver driver)
    {
        this.driver = driver;
    }


    public boolean exist(String name)
    {
        driver.findElement (DasboardColView.viewAll);
        DoesElementExist doesElementExist = new DoesElementExist (driver);
       if( doesElementExist.isElementPresent (DasboardColView.listOfView (name)) == true)
       {
           return true;
       }
       else
           return false;

    }
}
