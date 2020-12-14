package components;

import org.openqa.selenium.By;

public class DasboardColView {
    public static By selectSpecific = By.cssSelector ("li.userView.selected.single-line-ellipses");
    public static By viewAll = By.xpath ("//*[@id=\"selectedView\"]");
    public static By options =By.xpath ("//button[@data-toggle='dropdown']");
    public static By editViewButton = By.id ("editViewBtn");
    public static By deleteButton = By.id ("deleteViewBtn");
    public static By colAddedText= By.xpath("//*[@ref=\"eText\"]");

}