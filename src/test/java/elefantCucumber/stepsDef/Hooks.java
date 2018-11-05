package elefantCucumber.stepsDef;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import elefantCucumber.utilsElefant.WebDriverSingleton;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Hooks {

    WebDriverSingleton wbs = WebDriverSingleton.getInstanceOfWeDriverSingleton();

    private static Properties property;
    private FileInputStream file;

    public Hooks() throws Throwable {
    }


    @Before
    //TODO: rename to a more meaningufll name
    public void loadFileProperty(Scenario scenario) throws IOException {
        wbs.initDriver();
        //using properties Class to create an object
        property = new Properties();
        //Call the file using
        //TODO: change so it is not full path

        String filename = "properties/browser.properties";
        file =  new FileInputStream(filename);//getClass().getClassLoader().get(filename);

        //Load the file
        try {
            property.load(file);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        scenario.write("WebDriver is load");
    }

    public static String getValue(String key) {
        return property.getProperty(key);
    }


    @After
    public void afterTest(Scenario scenario) {

//        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) wbs.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException e) {
                System.err.println(e.getMessage());
            }
//        }
    }

    @After
    public void tearDown() {
        if (wbs.getDriver() != null) {
            wbs.getDriver().quit();
        }
    }

}
