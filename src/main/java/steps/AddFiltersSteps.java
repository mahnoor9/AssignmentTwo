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
        List<String> filterNames= StringToList.stringToList (filterName);
        List<String> Criterias= StringToList.stringToList (criteria);
        List<String> filterValues= StringToList.stringToList (value);
        for (int i= 0; i< filterNames.size (); i++ ) {
            AddOneFilter addOneFilter = new AddOneFilter (driver);
            addOneFilter.addFilter (filterNames.get (i), Criterias.get(i), filterValues.get (i));
            BrowserWait addWait= new BrowserWait ();
            addWait.wait(driver).until(ExpectedConditions.elementToBeClickable(EditForm.AddButton)).click();
        }

    }
}
