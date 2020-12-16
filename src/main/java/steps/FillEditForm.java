package steps;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FillEditForm {

    WebDriver driver;
    public FillEditForm(WebDriver driver)
    {

        this.driver= driver;
    }

    public void FillForm(String selectedColumn, String filterName, String filterCriteria, String filterValue)
    {

        AddColumnsInEditSteps addColumnsInEditStepss = new AddColumnsInEditSteps (driver);
        addColumnsInEditStepss.addColumns (selectedColumn);
       AddFiltersSteps addFiltersSteps = new AddFiltersSteps (driver);
      // addFiltersSteps.AddFilters (filterName,filterCriteria,filterValue);
        SaveChangingsSteps saveChangingsSteps= new SaveChangingsSteps (driver);
        saveChangingsSteps.save ();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
}
