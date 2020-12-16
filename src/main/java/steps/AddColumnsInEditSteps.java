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





    public void addColumns(String columns)
    {
       System.out.println (columns);
       driver.findElement (EditForm.deselectAll).click();
       DragAndDrop dragAndDrop = new DragAndDrop (driver);
       dragAndDrop.dragAndDropCol (StringToList.stringToList (columns));

    }


}
