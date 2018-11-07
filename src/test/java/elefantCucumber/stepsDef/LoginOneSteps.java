package elefantCucumber.stepsDef;

import elefantCucumber.utilsElefant.TestContext;
import elefantCucumber.pageObjects.PageFactory;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginOneSteps {

    TestContext wbs = TestContext.getTestContext();
    PageFactory factory = new PageFactory();

    public LoginOneSteps() throws Throwable {
    }


    @When("^I open elefant.ro website$")
    public void i_open_elefant_ro_website() throws Throwable {
        factory.getHomePage().navigateTo();

    }

    @When("^navigate to login fields$")
    public void navigate_to_loghin_fields() throws Throwable {
        factory.getLoginPage().navigateTo();

    }


    @When("^I fill login fields on the form and submit$")
    public void i_fill_loghin_fields_on_the_form_and_submit() throws Throwable {

        String username = Hooks.getValue("username");
        String password = Hooks.getValue("password");

        factory.getLoginPage().loginBaseWithSubmit(username,password);

    }

    @Then("^I should see successfully submitted$")
    public void i_should_see_successfully_submitted() throws Throwable {

        //WebElement succes_message = wbs.getDriver().findElement(By.xpath("//span[contains(text(),'Garibaldi')]"));
        String actualSuccesMessage = factory.getLoginPage().getAccontName();
        String expectedSuccesMessage = Hooks.getValue("username");
        Assert.assertEquals(expectedSuccesMessage, actualSuccesMessage);

    }

//    @Then("I should be successfully authenticated = (.*)")
//    public void authenticatedcheck(String auth){
//        boolean success;
//        if (auth.equalsIgnoreCase("true"))
//            success=true;
//        else
//            success=false;
//        WebElement succes_message = driver.findElement(By.xpath("//span[contains(text(),'Garibaldi')]"));
//        String actualSuccesMessage = succes_message.getText();
//        String expectedSuccesMessage = "Garibaldi";
//        Assert.assertThat(expectedSuccesMessage.equals(actualSuccesMessage),Is.is(success));
//    }

}