package elefantCucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


//        features = "C:\\Project_Junior\\CucumberProject\\ElefantCucumber\\src\\test\\resources\\elefantFeatures\\loginWrongErrorsCheck.feature",

//        features = "C:\\Project_Junior\\CucumberProject\\ElefantCucumber\\src\\test\\resources\\elefantFeatures\\loginUserSteps.feature" ,
//        features = "C:\\Project_Junior\\CucumberProject\\ElefantCucumber\\src\\test\\resources\\elefantFeatures\\verifyMyCart.feature" ,
//path relative
        features = {"src/test/resources/elefantFeatures/elefantFeature.feature"},
//        tags = {"@Login", "@User"},
        plugin = {"html:target/html","pretty", "json:target/cucumber-reports/cucumber.json"}


//        dryRun=true
        )
public class RunCucumberTest {
}