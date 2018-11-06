package elefantCucumber.stepsDef;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import elefantCucumber.utilsElefant.WebDriverSingleton;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotStep {

    WebDriverSingleton wbs = WebDriverSingleton.getInstanceOfWeDriverSingleton();

    private Scenario myScenario;

    @Before()
    public void embedScreenshotStep(Scenario scenario) {
        myScenario = scenario;
    }

    @Then("^I take a screenshot$")
    public void iTakeAScreenshot() throws Throwable {
        try {

            String base64Screenshot = ((TakesScreenshot) wbs.getDriver()).getScreenshotAs(OutputType.BASE64);

            byte[] decodeScreenshot = Base64.decodeBase64(base64Screenshot.getBytes());


            myScenario.write("Current Page URL is " + wbs.getDriver().getCurrentUrl());
//            byte[] screenshot = ((TakesScreenshot) wbs.getDriver()).getScreenshotAs(OutputType.BYTES);
            myScenario.embed(decodeScreenshot, "image/png");
        } catch (ClassCastException cce) {
            cce.printStackTrace();
        }
    }
}


