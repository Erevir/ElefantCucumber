package elefantCucumber.pageObjects.pagesFlow;


import elefantCucumber.utilsElefant.ProjectMethods;
import elefantCucumber.utilsElefant.TestContext;
import org.junit.Assert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MenParfumesProductsPage {

    TestContext wbs = TestContext.getTestContext();
    public ProjectMethods functions = new ProjectMethods();

    public MenParfumesProductsPage() {
        PageFactory.initElements(wbs.getDriver(), this);
    }

    @FindBy(how = How.XPATH, using = "//span[@class='fa fa-caret-down']")
    private WebElement sort_button;  //data-sort-name="something"

    @FindBy(how = How.XPATH, using = "//li/a[contains(text(),'Discount')]")
    private WebElement sort_select_button;  //data-sort-name="Discount"

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Givenchy')]")
    private WebElement brand_checkbox; // check ex. Givenchy

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'100 ml')]")
    private WebElement quantity_checkbox; // check ex. span class="elf-name pull-left">100 ml

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Reducere')]")
    private WebElement discount_button; //

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Reducere 50%-70%')]")
    private WebElement discount_select_button; // check ex. span class="elf-name pull-left">Reducere 50%-70%

    @FindBy(how = How.XPATH, using = "//div[@id='101178249']/div/div/div/div/a[contains(text(),'Apa de toaleta Pour Homme, 100 ml, Pentru Barbati')]")
    private WebElement choosen_product_101178249; // click img choose the product Givenchy red

    @FindBy(how = How.XPATH, using = "//div[@id='101566969']/div/div/div/div/a [contains(text(),'Apa de toaleta One Shock, 200 ml, Pentru Barbati')]")
    private WebElement choosen_product_101566969; // click img choose the product

    @FindBy(how = How.XPATH, using = "//a/span[contains(text(),'Cosmetice si Parfumuri')]")
    private WebElement findMenParfumesProductPageTitle; //


    public MenParfumesProductsPage selectProduct() {
        try {
            functions.clickWebElement(sort_button);
            functions.waitExplicit(sort_select_button, wbs);

            functions.clickWebElement(sort_select_button);
            functions.waitExplicit(discount_select_button, wbs);

            functions.clickWebElement(discount_select_button);
//            functions.waitExplicit(quantity_checkbox, driver);
//            JavascriptExecutor jsx = (JavascriptExecutor) driver;
//            jsx.executeScript("window.scrollBy(1,250)", "");
//            functions.clickWebElement(quantity_checkbox);
//            functions.waitExplicit(brand_checkbox, driver);
//            jsx.executeScript("window.scrollBy(0,850)", "");
//            functions.clickWebElement(brand_checkbox);

        } catch (UnhandledAlertException e) {
//            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    public MenParfumesProductsPage verifyTitle() {
        Assert.assertTrue(findMenParfumesProductPageTitle.getText().contains("Cosmetice si Parfumuri"));
        return this;
    }

    public ProductPage clickChoosenProduct() {
        choosen_product_101566969.click();
        return new ProductPage();
    }

}
