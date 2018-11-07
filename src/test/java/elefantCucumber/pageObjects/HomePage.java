package elefantCucumber.pageObjects;

import elefantCucumber.utilsElefant.ProjectMethods;
import elefantCucumber.utilsElefant.TestContext;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {

    private String homePageURL="https://www.elefant.ro/homepage";// get from properties file!!!

    TestContext wbs =  TestContext.getTestContext();
    public ProjectMethods functions = new ProjectMethods();

    public HomePage(TestContext wbs){
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
