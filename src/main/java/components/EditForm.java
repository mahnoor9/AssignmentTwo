package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EditForm {
    public static By nameField= By.id("viewName");
    public static By selectAll= By.id("dbox_select_all");
    public static By deselectAll= By.id("dbox_de_select_all");
    public static By selectedCol = By.id("selectedColumns");
    public static List<By> selectColumns(List<String> list) {
        ListIterator<String> Iterator = list.listIterator ();
        List<By> xpaths=new ArrayList<By> ();

        while (Iterator.hasNext ()) {

            String columnName = Iterator.next ();
            xpaths.add ( By.xpath ("//*[@id=\"avaiableColumns\"]//span[contains(., '" + columnName + "')]"));
            //*[@id="avaiableColumns"]//span[contains(., 'Column Name')]
        }
        return xpaths;
    }

    public static By filterColumn = By.id("filterColumns");
    public static By filterIncludes = By.id("filterOperator");
    public static By filterValue = By.xpath ("//div[@id='valueList_chosen']//input[contains(@class,'chosen-search-input')]");
    public static By filterValueNum = By.cssSelector ("input#numericValue1.valid");
    public static By saveButton = By.xpath("//button[contains(.,'Save')]");
    public static By AddButton = By.id("addFilterRow");
    public static By searchChoiceClose= By.xpath("//a[@class='search-choice-close']");
    public static By searchChoice = By.xpath("//li[@class='search-choice']");
    //public static By destination
}
