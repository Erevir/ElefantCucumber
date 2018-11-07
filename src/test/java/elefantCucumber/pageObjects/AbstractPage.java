package elefantCucumber.pageObjects;

import elefantCucumber.utilsElefant.TestContext;

import java.util.concurrent.TimeUnit;

public abstract class AbstractPage {

    TestContext wbs = TestContext.getTestContext();

    public AbstractPage(TestContext wbs) {
        this.wbs = wbs;
    }

    public AbstractPage() {
    }

    public abstract void navigateTo();

    public void navigateTo(final String value) {

        wbs.getDriver().navigate().to(value);
        wbs.getDriver().manage().window().maximize();
        wbs.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public String pageTitle() {
        return wbs.getDriver().getTitle();
    }

}

