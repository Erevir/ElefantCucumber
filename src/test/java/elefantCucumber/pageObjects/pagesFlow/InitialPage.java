package elefantCucumber.pageObjects.pagesFlow;

import elefantCucumber.utilsElefant.WebDriverSingleton;
import org.openqa.selenium.support.PageFactory;

public class InitialPage {

    WebDriverSingleton wbs = WebDriverSingleton.getInstanceOfWeDriverSingleton();
    public InitialPage() {
        PageFactory.initElements(wbs.getDriver(), this);

    }

}
