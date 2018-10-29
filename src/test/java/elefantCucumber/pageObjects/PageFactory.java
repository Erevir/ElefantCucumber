package elefantCucumber.pageObjects;

import elefantCucumber.pageObjects.loghinFlow.LoginPage;
import elefantCucumber.pageObjects.settingsFlow.SettingsPage;
import elefantCucumber.pageObjects.userCartFlow.CartPage;

public class PageFactory {

    public HomePage getHomePage() {
        return new HomePage();
    }

    public LoginPage getLoginPage() {
        return new LoginPage();
    }

    public SettingsPage getSettingsPage() {
        return new SettingsPage();
    }

    public CartPage getCartPage() {
        return new CartPage();
    }


}
