package elefantCucumber.pageObjects.pagesFlow;

import elefantCucumber.utilsElefant.TestContext;
import org.openqa.selenium.support.PageFactory;

public class InitialPage {

    TestContext wbs = TestContext.getTestContext();
    public InitialPage() {
        PageFactory.initElements(wbs.getDriver(), this);

    }

}
