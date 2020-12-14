package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class DoesElementExist {

    WebDriver driver;
    public DoesElementExist (WebDriver driver)
    {
        this.driver = driver;
    }
    public boolean isElementPresent(By by){
        try{
           driver.findElement(by);
            return true;
        }
        catch(NoSuchElementException e){
            System.out.println ("element does not exist");
            return false;
        }
    }

}
