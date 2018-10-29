package elefantCucumber.pageObjects.settingsFlow;

import elefantCucumber.entity.UserName;
import elefantCucumber.utilsElefant.ProjectMethods;
import elefantCucumber.utilsElefant.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyString;

public class SettingsPage {

    WebDriverSingleton wbs =  WebDriverSingleton.getInstanceOfWeDriverSingleton();
    public ProjectMethods functions = new ProjectMethods();
    UserName userName;

public SettingsPage() {
        PageFactory.initElements(wbs.getDriver(), this);
    }
//    public SettingsPage(UserName userName){
//    this.userName=userName;
//    }

    @FindBy(how = How.XPATH, using = "//a[@href='/contul-meu/setari-cont']")
    private WebElement my_account_settings;

//    @FindBy(how = How.XPATH, using = "//a[@href='/contul-meu/setari-cont']")
//    private WebElement settings_page;

    @FindBy(how = How.XPATH, using = "//div[@class='header-account-holder']/div[contains(text(),'Contul')]")
    private WebElement my_acoount_button;

    @FindBy(how = How.XPATH, using = "//div/div/div[contains(text(),'Setari cont')]")
    private WebElement settings_page_title;

    @FindBy(how=How.ID, using="email")
    private WebElement account_name;

// ******* If I implement follow steps i other scenario******
//    When I open elefant.ro website
//    And navigate to login fields
//    And I enter username as "<username>" and "<pwd>"
//    And I submit
//

    public SettingsPage open(){
        WebDriver driver=  wbs.getDriver();
       driver.navigate().to("http://www.elefant.ro"+"/contul-meu/setari-cont");
        return this;
    }

    public void navigateToSettingPage() {
        functions.clickWebElement(my_acoount_button);
        functions.clickWebElement(my_account_settings);
    }
    public String getAccontName(){
        return account_name.getAttribute("value");
    }

   public void checkUserNameInSettings(UserName userName){

//      String actualSuccesMessage = account_name.getAttribute("value");
//       String expectedSuccesMessage = userName.getUserName();
       //TODO: change so that it check if empty but not null, empty could also mean a few spaces
       assertThat(account_name.getText(), isEmptyString());
       //        assertThat(first_name_text.getText(), not(isEmptyString()));
   }



}
