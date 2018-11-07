package elefantCucumber.pageObjects.pagesFlow;

import elefantCucumber.utilsElefant.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    TestContext wbs =  TestContext.getTestContext();
    public ProductPage() {
              PageFactory.initElements(wbs.getDriver(), this);
    }

    @FindBy(how = How.XPATH, using = "//a/span[contains(text(),'Adauga in cos')]")
    private WebElement addToCartProduct; ////div[@id='main_comanda']/div/div/div/div/div/a[contains(text(),'Apa de toaleta One Shock, 200 ml, Pentru Barbati')]
    @FindBy(how = How.XPATH, using = "//div[@id='main_comanda']/div/div/div/div/div/a[contains(text(),'Apa de toaleta One Shock, 200 ml, Pentru Barbat')]")
    private WebElement choosenProduct;


    public ProductPage addToCart (){
        addToCartProduct.click();
        return this;
    }


}
