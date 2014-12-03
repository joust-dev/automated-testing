package Joust.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

/**
 * Created by zhanna on 12/2/2014.
 */
@DefaultUrl("https://joust.com/person/140473")
public class GuestHomePage extends PageObject {

// buttons in banner
    @FindBy(xpath="//*[.=' Continue with Facebook']")
    private WebElementFacade continueWithFacebookButton;

    @FindBy(xpath="//*[.='Continue with email']")
    private WebElementFacade continueWithEmailButton;


    public void click_on_continue_with_fb_button() {
        continueWithFacebookButton.click();
    }

    public void click_on_continue_with_email_button() {
        continueWithEmailButton.click();
    }


    }

