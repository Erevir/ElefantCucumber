package elefantCucumber.utilsElefant;

import cucumber.api.Scenario;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestContext {

    private static WebDriver driver;

    private Scenario scenario;

    private static TestContext instanceOfWebDriverSingleton = null;

    public static TestContext getInstanceOfWeDriverSingleton() {
        if (instanceOfWebDriverSingleton == null) {
            instanceOfWebDriverSingleton = new TestContext();
        }
        return instanceOfWebDriverSingleton;
    }


    public void initDriver() throws IOException {
        DriverLoader driverLoader = new DriverLoader();
        driverLoader.getBrowserName();
        driver = driverLoader.loadDriver();
    }

        public WebDriver getDriver()  {

        return driver;
    }

    public Scenario getScenario() {
        return scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }
}
