package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScrollToElement {

    public static void scrollToElement(WebElement element,WebDriver driver) {
       JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
                "document.querySelector('div.ag-body-viewport.ag-layout-normal.ag-row-no-animation').scrollLeft ", element);
       // EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver (driver);
       // eventFiringWebDriver.executeScript("document.querySelector('div.ag-center-col-container').scrollLeft(500)");
    }
}
