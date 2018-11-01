package elefantCucumber.stepsDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import elefantCucumber.entity.Password;
import elefantCucumber.entity.UserName;
import elefantCucumber.pageObjects.PageFactory;

public class LoginSteps {

    public UserName userName;
    public Password pwd;

    PageFactory factory = new PageFactory();

    public LoginSteps(UserName userName, Password pwd )  {
        this.userName=userName;
        this.pwd=pwd;
    }

    @And("^I enter username as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterUsernameAsAnd(String arg0, String arg1) throws Throwable {
        userName.setUserName(arg0);
        pwd.setPwd(arg1);
        factory.getLoginPage().fillUserAndPwd(userName.getUserName(), pwd.getPwd());
    }

    @And("^I submit$")
    public void iSubmit() throws Throwable {
        factory.getLoginPage().loginWithButton();

    }
    @Then("^I should be successfully authenticated$")
    //todo: modify so that it checks username span is not empty
    public void iShouldBeSuccessfullyAuthenticated() throws Throwable {

        factory.getLoginPage().checkUserNameIsNotEmpty();}


    @And("^I logout from account$")
    public void iLogoutFromAccount() throws Throwable {
       factory.getLoginPage().logout();

    }


}
