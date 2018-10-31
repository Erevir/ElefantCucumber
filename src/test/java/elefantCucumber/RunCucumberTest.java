package elefantCucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


//        features = "C:\\Project_Junior\\CucumberProject\\ElefantCucumber\\src\\test\\resources\\elefantCucumber\\loginWrongErrorsCheck.feature",

//        features = "C:\\Project_Junior\\CucumberProject\\ElefantCucumber\\src\\test\\resources\\elefantCucumber\\loginUserSteps.feature" ,
//        features = "C:\\Project_Junior\\CucumberProject\\ElefantCucumber\\src\\test\\resources\\elefantCucumber\\verifyMyCart.feature" ,
//path relative
        features = {"classpath:features"},
        plugin = {"html:target/html","pretty", "json:target/cucumber-reports/cucumber.json"}



//        dryRun=true
        )
public class RunCucumberTest {
}