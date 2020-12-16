package questions;

import components.DasboardColView;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import steps.GotoEditSteps;
import utils.StringToList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

public class WhichColsAdded {
    WebDriver driver;

    public WhichColsAdded (WebDriver driver)
    {
        this.driver = driver;
    }

    public List<String> addedColumns()
    {
       List <String> expectedCol= new ArrayList<> ();
        List <WebElement> Col= driver.findElements (DasboardColView.colAddedText);
        ListIterator<WebElement> iterator = Col.listIterator ();
        while(iterator.hasNext ())
        { {
            expectedCol.add (iterator.next ().getText ());
        }
        }
        expectedCol.remove (0);
        expectedCol.sort (String.CASE_INSENSITIVE_ORDER);
        return expectedCol;
    }
}
