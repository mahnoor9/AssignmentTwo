package steps;

import org.openqa.selenium.WebDriver;

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
       addFiltersSteps.AddFilters (filterName,filterCriteria,filterValue);
        SaveChangingsSteps saveChangingsSteps= new SaveChangingsSteps (driver);
        saveChangingsSteps.save ();

    }
}
