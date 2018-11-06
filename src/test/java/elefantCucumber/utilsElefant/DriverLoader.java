package elefantCucumber.utilsElefant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DriverLoader {

    WebDriver driver;

//    @Parameterized.Parameters("browser")

    public WebDriver loadDriver() throws IOException {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/webdriver/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/chromedriver.exe");
        System.setProperty("phantomjs.binary.path", "src/test/resources/webdriver/phantomjs.exe");

        String browser = getBrowserName();

        if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
            System.out.println("Firefox driver loaded");
            return driver;
        }
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
            System.out.println("Chrome driver loaded");
            return driver;
        }
        if (browser.equals("phantomjs")) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setJavascriptEnabled(true);
            driver = new PhantomJSDriver();
            System.out.println("PhantomJS driver loaded");
            return driver;
        }

        driver = new ChromeDriver();
        System.out.println("Chrome driver loaded as default");
        return driver;
    }

    public String getBrowserName() throws IOException {

        String systemBrowserProperty = getParameter("browser");
        if (null != systemBrowserProperty)
            return systemBrowserProperty;
        else
            return getBrowserFromFile();
    }

    private String getParameter(String name) {
        String value = System.getProperty(name);
        if (value == null)
            throw new RuntimeException(name + " is not a parameter!");

        if (value.isEmpty())
            throw new RuntimeException(name + " is empty!");

        return value;
    }


    private String getBrowserFromFile() throws IOException {

        Properties prop = new Properties();

        String filename = "properties/browser.properties";
        InputStream propFile =  new FileInputStream(filename);//getClass().getClassLoader().get(filename);
        if (propFile == null) System.out.println("Sorry, unable to find " + filename);

        prop.load(propFile);
//        Properties prop = new Properties();
//        InputStream propFile = new FileInputStream("src/test/java/resources/properties/browser.properties");
//        prop.load(propFile);

        return prop.getProperty("browser");

    }

}



