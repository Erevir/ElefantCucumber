package elefantCucumber.pageObjects;

import elefantCucumber.utilsElefant.ProjectMethods;
import elefantCucumber.utilsElefant.WebDriverSingleton;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {

    private String homePageURL="https://www.elefant.ro/homepage";// get from properties file!!!

    WebDriverSingleton wbs =  WebDriverSingleton.getInstanceOfWeDriverSingleton();
    public ProjectMethods functions = new ProjectMethods();

    public HomePage(WebDriverSingleton wbs){
        super(wbs);
    }
    public HomePage() {
        PageFactory.initElements(wbs.getDriver(), this);
    }

    @Override
    public void navigateTo() {
        super.navigateTo(homePageURL);
    }


}
