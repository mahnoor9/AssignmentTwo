package steps;

import components.EditForm;
import org.openqa.selenium.WebDriver;

public class SaveChangingsSteps {
    private WebDriver driver;
    public SaveChangingsSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void save() {
        driver.findElement(EditForm.saveButton).click();
    }
}
