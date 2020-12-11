package components;

import org.openqa.selenium.By;

public class SideNavigationBar {
    public static By columnViewButton= By.linkText("Column Dictionary");
    public static By DataCatalogSelect= By.xpath ("//div[@id='sidebar']/ul[@class='nav nav-list']//span[contains(., 'Data Catalog')]");
// public static By DataCatalogSelect= By.xpath ("//div[@id='sidebar']/ul/li[4]/a/b");
    public static By dummy= By.cssSelector (".custom-icon-dictionary");

}
