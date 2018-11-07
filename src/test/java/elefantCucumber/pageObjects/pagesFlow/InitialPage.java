package elefantCucumber.pageObjects.pagesFlow;

import elefantCucumber.utilsElefant.TestContext;
import org.openqa.selenium.support.PageFactory;

public class InitialPage {

    TestContext wbs = TestContext.getInstanceOfWeDriverSingleton();
    public InitialPage() {
        PageFactory.initElements(wbs.getDriver(), this);

    }

}
