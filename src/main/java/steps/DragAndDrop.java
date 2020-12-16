package steps;

import components.EditForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.ListIterator;

public class DragAndDrop {
    WebDriver driver;
    public DragAndDrop(WebDriver driver)
    {
        this.driver=driver;

    }

        public void dragAndDropCol(List<String> list1)
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

}
