package components;

import org.openqa.selenium.By;

public class MarkFav {
    public static By favButton = By.id("favoriteViewBtn");
    public static By favList (String s)
    {
       return By.xpath ("//*[@id=\"viewsCreatedByme\"]/li[contains(., '"+s+"')]");
    }
    public static By CreatedByMeList (String s)
    {
        return By.xpath ("//*[@id=\"viewsCreatedByme\"]/li[contains(., '"+s+"')]");
    }


    public static By viewAll= By.xpath("//*[@id=\"selectedView\"]");
}
