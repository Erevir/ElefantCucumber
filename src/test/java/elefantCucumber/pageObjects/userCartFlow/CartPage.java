package elefantCucumber.pageObjects.userCartFlow;

import elefantCucumber.utilsElefant.ProjectMethods;
import elefantCucumber.utilsElefant.TestContext;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.*;

public class CartPage {
    TestContext wbs = TestContext.getTestContext();
    public ProjectMethods functions = new ProjectMethods();


    public CartPage() {
        PageFactory.initElements(wbs.getDriver(), this);
    }

//    @FindBy(how = How.XPATH, using = "//div[@id='main_comanda']")
//    private WebElement main_comanda;
//    @FindBy(how = How.XPATH, using = "//div[@id='main_comanda']//div[contains(@class,'product_cos_new')]")// product from cart
//    private WebElement allProductInCart;
//    @FindBy(how = How.XPATH, using = "//div[@id='main_comanda']//div[contains(@class,'product_cos_new')]//div[contains(@class,'title')]")
//    private WebElement productTitleInCart;
//    @FindBy(how = How.XPATH, using = "//div[@id='main_comanda']//span[contains(@id,'quantity')]")
//    private WebElement quantityProductInCart;

    @FindBy(how = How.XPATH, using = "//div[@class='header-cart-icon']")
    private WebElement cart_button;
    @FindBy(how = How.XPATH, using = "//div[@id='more_1994648_13']/a[contains(text(),'modifica')]")
    private WebElement modifica_button;
    @FindBy(how = How.XPATH, using = "//div[@id='more_1994648_13_actions']/div/a/span[@class='fa fa-plus-circle']")
    private WebElement plus_button;
    @FindBy(how = How.XPATH, using = "//div[@id='more_1994648_13_actions']/div/a/span[@class='fa fa-minus-circle']")
    private WebElement minus_button;
    @FindBy(how = How.XPATH, using = "//div[@id='more_1994648_13_actions']/div/a[contains(text(),'salveaza')]")
    private WebElement save_button;
    @FindBy(how = How.XPATH, using = "//div[@id='more_1994648_13_actions']/div/a[contains(text(),'anuleaza')]")
    private WebElement anulation_button;
    @FindBy(how = How.XPATH, using = "//a[@id='1994648']")
    private WebElement delete_product_1994648;
    @FindBy(how = How.XPATH, using = "//a[@id='1287399']")
    private WebElement delete_product_1287399;
    @FindBy(how = How.XPATH, using = "//a[@id='1284865']")
    private WebElement delete_product_1284865;
    @FindBy(how = How.XPATH, using = "//div[@id='more_1994648_13']/div/span[contains(text(),'buc')]")
    private WebElement quantity_product_field;
    @FindBy(how = How.XPATH, using = "//span[@class='exponea-text-sub']")
    private WebElement bonuCode_product;

    //******* webelement  product from myCart   **************
    @FindBy(how = How.XPATH, using = "//div/a[contains(text(),'Gel de dus Men Xtreme Polar, 400 ml')]")
    private WebElement product_166127_13;
    @FindBy(how = How.XPATH, using = "//div[@id='more_166127_13']/div/span[contains(text(),' buc')]")
    private WebElement qty_product_166127_13;

    @FindBy(how = How.XPATH, using = "//div/a[contains(text(),'Ceas Fossil The Commuter FS5417')]")
    private WebElement product_1994648_13;
    @FindBy(how = How.XPATH, using = "//div[@id='more_1994648_13']/div/span[contains(text(),' buc')]")
    private WebElement qty_product_1994648_13;

    @FindBy(how = How.XPATH, using = "//div/a[contains(text(),'Apa de toaleta Calvin Klein One Shock, 200 ml, Pentru Barbati')]")
    private WebElement product_566969_13;
    @FindBy(how = How.XPATH, using = "//div[@id='more_566969_13']/div/span[contains(text(),' buc')]")
    private WebElement qty_product_566969_13;


    //****** generic webelement myCart*******//

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'values')]/span[contains(text(),'buc')]")
    private List<WebElement> productQuantityList;
    @FindBy(how = How.XPATH, using = "//div[@id='main_comanda']//div[contains(@class,'product_cos_new')]//div[contains(@class,'title')]/a")
    private List<WebElement> productTitleList;


    public void openMyCart() {
        functions.clickWebElement(cart_button);
    }

    public Map<String, String> getAllProductFromMyCart() {

        List<String> productTitle = new ArrayList<>();
        for (WebElement aProductTitleList : productTitleList) {
            String itm = aProductTitleList.getText();
            productTitle.add(itm);
        }
//        for (String itms : productTitle) {
//            System.out.println(itms);
//        }

        List<String> itemQuantity = new ArrayList<>();
        for (WebElement aproductQuantityList : productQuantityList) {
            String qty = aproductQuantityList.getText();
            itemQuantity.add(qty);
        }
//        for (String qty : itemQuantity) {
//            System.out.println(qty);
//        }

        Map<String, String> allProduct= new HashMap<String, String>();
        Iterator<String> i1 = productTitle.iterator();
        Iterator<String> i2 = itemQuantity.iterator();
        while (i1.hasNext() && i2.hasNext()) {
            allProduct.put(i1.next(), i2.next());
        }

        for (String key : allProduct.keySet()) {
            System.out.println(key + "=" + allProduct.get(key));}

        return allProduct;
    }


    //*** old page methods****//
    public CartPage modifyProductFromCart() {
        functions.clickWebElement(modifica_button);
        return this;
    }

    public CartPage addProductFromCart() {
        functions.clickWebElement(plus_button);
        return this;
    }

    public CartPage minusProductFromCart() {
        functions.clickWebElement(minus_button);
        return this;
    }

    public CartPage saveProductFromCart() {
        functions.waitExplicit(save_button, wbs);
        JavascriptExecutor jsx = (JavascriptExecutor) wbs;
        jsx.executeScript("window.scrollBy(0,350)", "");
        functions.clickWebElement(save_button);
        return this;
    }

    public CartPage anulationProductFromCart() {
        functions.clickWebElement(anulation_button);
        return this;
    }

    public CartPage deleteProductFromCart() {
        functions.clickWebElement(delete_product_1287399);
        return this;
    }

    public CartPage verifyProductOnCart() {
        functions.waitExplicit(quantity_product_field, wbs);
        String actualNrOfProduct = quantity_product_field.getText();
        String expectedNrOfProduct = "1 buc";
        Assert.assertEquals(expectedNrOfProduct, actualNrOfProduct);
        return this;
    }

    public CartPage getBonusText() {
        System.out.println(bonuCode_product.getText());
        return this;
    }

}

