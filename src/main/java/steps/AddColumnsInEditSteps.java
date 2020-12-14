package steps;

import components.EditForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.StringToList;

import java.util.List;
import java.util.ListIterator;

public class AddColumnsInEditSteps {
    public WebDriver driver;

    public AddColumnsInEditSteps (WebDriver driver)
    {
        this.driver= driver;
    }



    public void dragAndDrop(List<String> list1)
    {
       List<By> list= EditForm.selectColumns (list1);
        Actions action = new Actions (driver);
        ListIterator iterator= list.listIterator ();
        WebElement destination= driver.findElement (EditForm.selectedCol);
        while(iterator.hasNext ())
        {
            WebElement source= driver.findElement((By) iterator.next());
           // action.dragAndDrop(source,destination).build().perform();
            Action dragAndDrop = action.clickAndHold(source)
                    .moveToElement(destination)
                    .release(destination)
                    .build();
            dragAndDrop.perform ();
        }

    }

    public void addColumns(String s)
    {
       System.out.println (s);
       driver.findElement (EditForm.deselectAll).click();
        dragAndDrop (StringToList.stringToList (s));


    }


}
