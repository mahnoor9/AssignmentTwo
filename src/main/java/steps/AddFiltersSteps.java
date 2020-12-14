package steps;

import components.EditForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserWait;
import utils.DoesElementExist;
import utils.StringToList;

import java.util.List;
import java.util.ListIterator;

public class AddFiltersSteps {
    WebDriver driver;

    public AddFiltersSteps(WebDriver driver)
    {
        this.driver= driver;
    }

    public void AddFilters(String filterName, String criteria, String value)
    {
        DoesElementExist doesElementExist = new DoesElementExist (driver);
            List<String> filterNames= StringToList.stringToList (filterName);
            List<String> Criterias= StringToList.stringToList (criteria);
            List<String> filterValues= StringToList.stringToList (value);
            ListIterator<String> i=  filterNames.listIterator ();
            int v=0;
            while(i.hasNext ())
            {

                driver.findElement(EditForm.filterColumn).click();
                new Select (driver.findElement(EditForm.filterColumn)).selectByVisibleText(filterNames.get (0));
                driver.findElement(EditForm.filterIncludes).click();
                new Select(driver.findElement(EditForm.filterIncludes)).selectByVisibleText(Criterias.get (0));
             /*   if(doesElementExist.isElementPresent (By.name("numericValue1")))
                {
                driver.findElement(By.name("numericValue1")).click();
                driver.findElement(EditForm.filterValue).sendKeys("12345");
                }
                if(doesElementExist.isElementPresent (By.name("stringValue1")))
                {
                    driver.findElement(By.name("stringValue1")).click();
                    driver.findElement(EditForm.filterValue).sendKeys("wewe");
                } */
                if(i.hasNext ())
                {
                    BrowserWait addWait= new BrowserWait ();
                    addWait.wait(driver).until(ExpectedConditions.elementToBeClickable(EditForm.AddButton)).click();

                }
                v++;
            }



    }
}
