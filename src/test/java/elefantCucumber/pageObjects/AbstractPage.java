package elefantCucumber.pageObjects;

import elefantCucumber.utilsElefant.WebDriverSingleton;

import java.util.concurrent.TimeUnit;

public abstract class AbstractPage {

    WebDriverSingleton wbs = WebDriverSingleton.getInstanceOfWeDriverSingleton();

    public AbstractPage(WebDriverSingleton wbs) {
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

