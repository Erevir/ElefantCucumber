package elefantCucumber.stepsDef;

import cucumber.api.java.en.Then;
import elefantCucumber.pageObjects.PageFactory;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;

import java.util.Map;

public class LoginErrorsSteps {

    PageFactory factory = new PageFactory();

    @Then("^I should see the following error messages:$")
    public void iShouldSeeTheFollowingErrorMessages(DataTable dataTable) throws Throwable {
        Map<String, String> type = dataTable.asMap(String.class, String.class);

        if (!type.get("general_error").isEmpty()) {
            System.out.println("general check");
            Assert.assertEquals(type.get("general_error"), factory.getLoginPage().getLoginGeneralErrors());
        }
        if (!type.get("username_error").isEmpty()) {
            System.out.println("username check");
            Assert.assertEquals(type.get("username_error"), factory.getLoginPage().getUsernameErrorsMessage());
        }
        if (!type.get("password_error").isEmpty()) {
            System.out.println("password check");
            Assert.assertEquals(type.get("password_error"), factory.getLoginPage().getPasswordErrorsMessage());
        }


        System.out.println("Errors not found");
    }
}

