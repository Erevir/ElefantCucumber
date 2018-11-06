package elefantCucumber.stepsDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import elefantCucumber.entity.UserName;
import elefantCucumber.pageObjects.PageFactory;
import elefantCucumber.utilsElefant.WebDriverSingleton;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.not;

public class SettingsUserSteps extends BaseSteps {

    public UserName userName;

    WebDriverSingleton wbs = WebDriverSingleton.getInstanceOfWeDriverSingleton();
    PageFactory factory = new PageFactory();

    public  SettingsUserSteps(UserName userName){
        this.userName=userName;
    }

    @And("I navigate to settings page$")
    public void iNavigateToSettingsPage() throws Throwable {
        factory.getSettingsPage().open();
    }

    @Then("^I should be check user$")
    public void iShouldBeCheckUser() throws Throwable {

     //TODO: change so that it check if empty but not null, empty could also mean a few spaces

//        assertThat(factory.getSettingsPage().getAccontName(), isEmptyString());
                assertThat(factory.getSettingsPage().getAccontName(), not(isEmptyString()));

                super.getScreenshot();

    }



    }



