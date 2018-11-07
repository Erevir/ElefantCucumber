package elefantCucumber.pageObjects.pagesFlow;

import elefantCucumber.utilsElefant.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ParfumesPage {
    TestContext wbs =  TestContext.getTestContext();

    public ParfumesPage() {

        PageFactory.initElements(wbs.getDriver(), this);
    }
    @FindBy(how = How.XPATH, using = "//li/a[contains(text(),'Parfumuri & Cosmetice')]")
    private WebElement parfume_section;

    public ParfumeCosmeticsPage hoverOnMenParfumesButton(){
       parfume_section.click();
        return new ParfumeCosmeticsPage();

    }
}
