package elefantCucumber.stepsDef;

import cucumber.api.Scenario;
import elefantCucumber.utilsElefant.WebDriverSingleton;

public class BaseSteps {

    private static Scenario scenario;
    WebDriverSingleton wbs = WebDriverSingleton.getInstanceOfWeDriverSingleton();

//        public void getScreenshot() {
//
//        if (scenario.isFailed()) {
//        try {
//            byte[] screenshot = ((TakesScreenshot) wbs.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.embed(screenshot, "image/png");
//        } catch (WebDriverException e) {
//            System.err.println(e.getMessage());
//        }
//        }
//    }


    public void getScreenshot(){

    }


}
