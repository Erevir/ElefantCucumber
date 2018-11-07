package elefantCucumber.pageObjects.loghinFlow;

import elefantCucumber.pageObjects.AbstractPage;
import elefantCucumber.utilsElefant.ProjectMethods;
import elefantCucumber.utilsElefant.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.core.IsNot.not;

public class LoginPage extends AbstractPage {

    TestContext wbs = TestContext.getInstanceOfWeDriverSingleton();
    public ProjectMethods functions = new ProjectMethods();

    String loginPageURL = "http://www.elefant.ro/autentificare";

    public LoginPage(TestContext wbs) {
        super(wbs);
    }

    public LoginPage() {
        PageFactory.initElements(wbs.getDriver(), this);
    }

//    ***** Erroe Message WebElement*******

    @FindBy(xpath = "//div[2]/div/div[contains(@id,'username-error')]")
// and contains(@id,'error')]")  // Introdu o adresa de email! login_username
    private WebElement err_message_email;


    @FindBy(xpath = "//div[2]/div/div[contains(@id,'password-error')]")// and contains(@id,'error')]")  // Introdu o parola!//
    private WebElement err_message_pwd;


    @FindBy(xpath = "//div[3]/div[contains(@class,'errors')]")
    private WebElement err_message_email_and_pwd; ///div[3]/div[contains(@class,'errors')]


    @FindBy(how = How.XPATH, using = "//div[@class='hidden-xs header-account-display']")
    private WebElement account_display_button;

    @FindBy(how = How.XPATH, using = "//div[@id='login_password-error']")
    private WebElement login_error_message;

    @FindBy(how = How.LINK_TEXT, using = "Intra in cont")
    private WebElement logged_in_button;

    @FindBy(how = How.ID, using = "login_username")
    private WebElement user_box;
    @FindBy(how = How.ID, using = "login_password")
    private WebElement password_box;
    @FindBy(how = How.ID, using = "login_classic")
    private WebElement submit_button;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Garibaldi')]")
    private WebElement succes_message;

    @FindBy(how = How.XPATH, using = "//span[@id='user_name']")
    private WebElement first_name_text;

    @FindBy(how = How.XPATH, using = "//a[@href='/contul-meu/setari-cont']")
    private WebElement my_account_settings;

    @FindBy(how = How.ID, using = "email")
    private WebElement accont_name;

    @FindBy(how = How.XPATH, using = "//div[@class='header-account-holder']/div[contains(text(),'Contul')]")
    private WebElement my_acoount_button;
    @FindBy(how = How.ID, using = "logout-button")
    private WebElement logout_button;
    @FindBy(how = How.XPATH, using = "//div[@class='col-sm-10 col-sm-offset-1 col-md-10 col-md-offset-1 errors']")
    private WebElement unsucces_message;

    String expectName;

    public void navigateTo() {
//        String loginPageURL = "http://www.elefant.ro/autentificare";
        super.navigateTo(loginPageURL);

    }

    public void fillUserAndPwd(String username, String password) {
        functions.fillWebElement(user_box, username);
        functions.fillWebElement(password_box, password);
    }

    public void loginBaseWithSubmit(String username, String password) {
        functions.fillWebElement(user_box, username);
        functions.fillWebElement(password_box, password);
        functions.clickWebElement(submit_button);

    }

    public void loginWithButton() {
        functions.clickWebElement(submit_button);
    }


    public String getAccontName() {

        functions.clickWebElement(my_acoount_button);
        functions.clickWebElement(my_account_settings);
        expectName=accont_name.getAttribute("value");
        return expectName;
    }

    public void logout() {
        functions.waitExplicit(my_acoount_button, wbs);
        functions.clickWebElement(my_acoount_button);
        functions.clickWebElement(logout_button);

    }

    //  check confirmation submit  checks username span is not empty///  assertion in test Page!!!
    public void checkUserNameIsNotEmpty() {
        //TODO: change so that it check if empty but not null, empty could also mean a few spaces

        //        assertThat(first_name_text.getText(), isEmptyString());
        assertThat(expectName, not(isEmptyString()));
    }

    //  check error message

    public String getLoginGeneralErrors() {
        return functions.getTextJs(err_message_email_and_pwd);
    }

    public String getLoginUserAndPasswordErrors() {
        String errMsg;
        errMsg = err_message_email.getText() + err_message_pwd.getText();
        return errMsg;
    }

    public String getUsernameErrorsMessage(){
        return err_message_email.getText();
    }
    public String getPasswordErrorsMessage(){
        return err_message_pwd.getText();
    }

//    public int   getListSize(){
//        int size=0;
//        List<WebElement>elements = wbs.getDriver().findElements(By.xpath("//div[@class='form-box']/div[2]/div/div"));
//                return elements.size();
//    }


}

