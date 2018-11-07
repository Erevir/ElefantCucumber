package elefantCucumber.pageObjects.pagesFlow;

import elefantCucumber.utilsElefant.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ParfumeCosmeticsPage {

    TestContext wbs =  TestContext.getInstanceOfWeDriverSingleton();

    public ParfumeCosmeticsPage() {

        PageFactory.initElements(wbs.getDriver(), this);
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Parfumuri pentru barbati')]")
    private WebElement men_parfume_section;

    public MenParfumesProductsPage clickOnMenParfumesButton() {
        men_parfume_section.click();
        return new MenParfumesProductsPage();

    }
}
