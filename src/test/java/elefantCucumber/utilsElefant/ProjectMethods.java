package elefantCucumber.utilsElefant;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectMethods {

    WebDriverSingleton wbs = new WebDriverSingleton();

    //  *******  Constructor  ***********
    public ProjectMethods() {

    }

//  ********  Methods  *********

    //    Click on random web element
    public void clickWebElement(WebElement element) {
        element.click();
    }

    //    validate page
    public void validatePage(String expected, WebDriverSingleton wbs) {
        if (!(expected.isEmpty())) {
            String actual = wbs.getDriver().getTitle();
            Assert.assertEquals(expected, actual);
        }
    }

    //    Fill a WebElement a value
    public void fillWebElement(WebElement element, String value) {
        element.sendKeys(value);
    }

    //    DropDown
    //    Select by text
    public void selectByText(WebElement element, String text) {
        Select dropDown = new Select(element);
        dropDown.selectByVisibleText(text);
    }

    //    Select by value
    public void selectByValue(WebElement element, String value) {
        Select dropDown = new Select(element);
        dropDown.selectByValue(value);
    }

    //    Hover a WebElement
    public void hoverWebElement(WebElement element, WebDriverSingleton wbs) {
        Actions action = new Actions(wbs.getDriver());
        action.moveToElement(element).build().perform();
    }

    //    Wait explicit
    public void waitExplicit(WebElement element, WebDriverSingleton wbs) {
        new WebDriverWait(wbs.getDriver(), 2).until(ExpectedConditions.visibilityOf(element));
    }

    public void acceptAlert() {
        String text = "";
        try {
            Alert alert = wbs.getDriver().switchTo().alert();
            text = alert.getText();
            alert.accept();
        } catch (NoAlertPresentException e) {
        }
//        catch (WebDriverException e) {
//
//        }
    }

    public void dismissAlert() {
        String text = "";
        try {
            Alert alert = wbs.getDriver().switchTo().alert();
            text = alert.getText();
            alert.dismiss();
        } catch (NoAlertPresentException e) {

        }
    }

    public void alertButton() {
        WebElement alertButton = wbs.getDriver().findElement(By.xpath("//a[contains(text(),'Am inteles')]"));
        alertButton.click();
        alertButton.sendKeys(Keys.ENTER);
        wbs.getDriver().switchTo().alert().accept();
    }


    public String getTextJs(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) wbs.getDriver();
        String content = (String) executor.executeScript("return arguments[0].textContent;", element);  // textContent, innerHTML
        return content.trim();
    }


    public WebElement getErrorWebelementXpath(String value) {
        WebElement error = wbs.getDriver().findElement(By.xpath("//div[2]/div/div[contains(@id,'" + value + "-error')]"));
        return error;
    }

    //

}

