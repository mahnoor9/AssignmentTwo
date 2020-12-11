package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.ListIterator;

public class EditForm {
    public static By nameField= By.id("viewName");
    public static By selectAll= By.id("dbox_select_all");
    public static By deselectAll= By.id("dbox_de_select_all");
    public static List<By> selectColumns(List<String> list) {
        ListIterator<String> Iterator = list.listIterator ();
        List<By> xpaths = null;

        while (Iterator.hasNext ()) {

            String columnName = Iterator.next ();
            xpaths.add ( By.xpath ("//*[@id=\"avaiableColumns\"]//span[contains(., '" + columnName + "')]"));
            //*[@id="avaiableColumns"]//span[contains(., 'Column Name')]
        }
        return xpaths;
    }
    //public static By destination
}
