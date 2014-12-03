package Joust.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import other_resources.Utils;

@DefaultUrl("https://qa.test.joust.com/person")
public class UserHomePage extends PageObject {

    @FindBy(className="user-profile-display-name")
    private WebElementFacade userName;

    public String get_user_name( ) {
        Utils.waitUntilElementIsVisible(getDriver(),userName);
        return userName.getText();
    }


}