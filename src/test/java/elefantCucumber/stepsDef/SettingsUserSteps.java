package elefantCucumber.stepsDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import elefantCucumber.pageObjects.PageFactory;
import elefantCucumber.utilsElefant.ProjectMethods;
import elefantCucumber.utilsElefant.TestContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.not;

public class SettingsUserSteps  {

    public ProjectMethods functions = new ProjectMethods();

    TestContext wbs = TestContext.getTestContext();
    PageFactory factory = new PageFactory();

    @And("I navigate to settings page$")
    public void iNavigateToSettingsPage() throws Throwable {
        factory.getSettingsPage().open();
        functions.getScreenshot(wbs.getScenario());
    }

    @Then("^I should be check user$")
    public void iShouldBeCheckUser() throws Throwable {

        // assertThat(factory.getSettingsPage().getAccontName(), isEmptyString());
        assertThat(factory.getSettingsPage().getAccontName(), not(isEmptyString()));

        functions.getScreenshot(wbs.getScenario());

    }


}



