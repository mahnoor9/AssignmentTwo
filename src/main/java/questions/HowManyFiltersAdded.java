package questions;

import components.MarkFav;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HowManyFiltersAdded {

    WebDriver driver;

    public HowManyFiltersAdded(WebDriver driver)
    {
        this.driver= driver;

    }

    public List<String> numberOfAddedFilters(String nameOfView) {

        List<String> result= new ArrayList<> ();
        List<WebElement> list = driver.findElements (By.cssSelector ("div.ag-cell.ag-cell-not-inline-editing.ag-cell-with-height.ag-cell-value"));
        ListIterator<WebElement> it= list.listIterator ();
        int x=0;
        while(it.hasNext ())
        {
           // System.out.println (list.size ());
            String nameOfCol=it.next ().getAttribute ("col-id");
            if(nameOfCol== "Source")
            {
                result.set (x,it.next ().getText ());
                System.out.println (result.get(x));
            }


        }
        return result;



    }

}
