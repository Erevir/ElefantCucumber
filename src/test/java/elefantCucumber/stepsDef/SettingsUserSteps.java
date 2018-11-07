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

//    Screenshot screenshot;
    public ProjectMethods functions = new ProjectMethods();

    TestContext wbs = TestContext.getInstanceOfWeDriverSingleton();
    PageFactory factory = new PageFactory();

    @And("I navigate to settings page$")
    public void iNavigateToSettingsPage() throws Throwable {
        factory.getSettingsPage().open();
        functions.getScreenshot(wbs.getScenario());
    }

    @Then("^I should be check user$")
    public void iShouldBeCheckUser() throws Throwable {

        //TODO: change so that it check if empty but not null, empty could also mean a few spaces

       // assertThat(factory.getSettingsPage().getAccontName(), isEmptyString());
        assertThat(factory.getSettingsPage().getAccontName(), not(isEmptyString()));
//        screenshot.getScr();

//        myScenario.getScenario().write("Take screenshoot");
        functions.getScreenshot(wbs.getScenario());

    }


}



