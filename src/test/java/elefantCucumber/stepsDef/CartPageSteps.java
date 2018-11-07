package elefantCucumber.stepsDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import elefantCucumber.pageObjects.PageFactory;
import elefantCucumber.utilsElefant.TestContext;
import io.cucumber.datatable.DataTable;
import java.util.Map;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class CartPageSteps {

    TestContext wbs = TestContext.getInstanceOfWeDriverSingleton();
    PageFactory factory = new PageFactory();


    public CartPageSteps() throws Throwable {
    }

    @And("^I open myCart$")
    public void iOpenMyCart() throws Throwable {
        factory.getCartPage().openMyCart();
    }

    @Then("^I should have the products in myCart:$")
    public void iShouldHaveTheProductsInMyCartAnd(DataTable dataTable) throws Throwable {

//        System.out.println(dataTable.row(0).get(0));
//        System.out.println(dataTable.row(0).get(1));
//        System.out.println(dataTable.row(1).get(0));
//        System.out.println(dataTable.row(1).get(1));
//        System.out.println("as map:");


        Map<String, String> expectedItems = dataTable.asMap(String.class, String.class);

        assertThat(factory.getCartPage().getAllProductFromMyCart(), is(expectedItems));

    }
}
