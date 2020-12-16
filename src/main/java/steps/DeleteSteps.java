package steps;

import components.DasboardColView;
import components.DeleteView;
import components.MarkFav;
import org.openqa.selenium.WebDriver;
import questions.DoesViewExist;
import questions.IsFavouriteMarked;

public class DeleteSteps {
    WebDriver driver;

    public DeleteSteps(WebDriver driver)
    {
        this.driver = driver;
    }

    public void DeleteView(String name)
    {
                driver.findElement (DasboardColView.viewAll);
                driver.findElement (DasboardColView.listOfView (name)).click ();
                driver.findElement (DeleteView.deleteButton).click ();
                driver.findElement (DeleteView.yesButton).click ();
        }


}
