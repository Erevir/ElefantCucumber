package elefantCucumber.utilsElefant;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class WebDriverSingleton {

    private static WebDriver driver;

    private static WebDriverSingleton instanceOfWebDriverSingleton = null;


    public static WebDriverSingleton getInstanceOfWeDriverSingleton() {
        if (instanceOfWebDriverSingleton == null) {
            instanceOfWebDriverSingleton = new WebDriverSingleton();
        }
        return instanceOfWebDriverSingleton;
    }

    public void initDriver() throws IOException {
        DriverLoader driverLoader = new DriverLoader();
        driverLoader.getBrowserType();
        driver = driverLoader.loadDriver();
    }

    public WebDriver getDriver()  {

        return driver;
    }
}
