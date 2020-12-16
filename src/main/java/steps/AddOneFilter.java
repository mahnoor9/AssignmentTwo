package steps;

import components.EditForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.DoesElementExist;

public class AddOneFilter {

    WebDriver driver;
    public AddOneFilter(WebDriver driver)
    {
        this.driver=driver;
    }
    public void addFilter(String filterName, String filterCriteria, String filterValue)
    {
        DoesElementExist doesElementExist = new DoesElementExist (driver);
        driver.findElement(EditForm.filterColumn).click();
        new Select (driver.findElement(EditForm.filterColumn)).selectByVisibleText(filterName);
        driver.findElement(EditForm.filterIncludes).click();
        new Select(driver.findElement(EditForm.filterIncludes)).selectByVisibleText(filterCriteria);
             driver.findElement(EditForm.filterValue).click();
            driver.findElement(EditForm.filterValue).sendKeys(filterValue);

    }
}
