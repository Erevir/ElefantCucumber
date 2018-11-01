package elefantCucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


//        features = "C:\\Project_Junior\\CucumberProject\\ElefantCucumber\\src\\test\\resources\\elefantFeatures\\loginWrongErrorsCheck.feature",
//        features = "C:\\Project_Junior\\CucumberProject\\ElefantCucumber\\src\\test\\resources\\elefantFeatures\\loginUserSteps.feature" ,
//        features = "C:\\Project_Junior\\CucumberProject\\ElefantCucumber\\src\\test\\resources\\elefantFeatures\\verifyMyCart.feature" ,

        features = {"src/test/resources/elefantFeatures" },
        tags = {"@SmokeTest"},
        plugin = {"html:target/html","pretty", "json:target/cucumber-reports/cucumber.json"},
        glue = {"src/test/java/elefantCucumber/stepsDef"}


//        dryRun=true
)

public class RunSmokeCucumberTest {

}
