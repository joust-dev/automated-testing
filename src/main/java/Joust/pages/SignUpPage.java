package Joust.pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import other_resources.Utils;

@DefaultUrl("https://qa.test.joust.com")
public class SignUpPage extends PageObject {

    //splash page
    @FindBy(className="signup-guest-link")
    private WebElementFacade guestModeLink;

    @FindBy(xpath="//*[.=' Continue with Facebook']")
    private WebElementFacade signUpWithFacebook;

    //  email
    @FindBy(css="[name='emailAddress']")
    private WebElementFacade emailField;

    @FindBy(css="[name='password']")
    private WebElementFacade emailPassField;

    @FindBy(xpath="//*[.='Continue with email']")
    private WebElementFacade continueWithEmailButton;

    @FindBy(id="firstName222")
    private WebElementFacade firstNameField;

    @FindBy(id="lastName225")
    private WebElementFacade lastNameField;

    @FindBy(xpath="//*[contains(@class,'signup-default-button')]")
    private WebElementFacade letsDoThisButton;

    // Facebook popup
    @FindBy(id="email")
    private WebElementFacade facebookLoginField;

    @FindBy(id="pass")
    private WebElementFacade fbPasswordField;

    @FindBy(css="[name='login']")
    private WebElementFacade enterToFbButton;


//guest
    public void click_on_guest_mode_link() {
        guestModeLink.click();
    }
//FB popup
    public void click_on_continue_with_fb_button() {
        signUpWithFacebook.click();
    }
    public void enter_fb_user_login(String fbLogin) {
        Utils utils = new Utils();
        utils.switch_to(getDriver(),"facebook.com");
        facebookLoginField.type(fbLogin);
    }
    public void enter_fb_pass(String pass) {
        fbPasswordField.type(pass);
    }

    public void click_on_enter_to_Fb_button() {
        enterToFbButton.click();
        Utils utils = new Utils();
        utils.switch_to(getDriver(),"qa.test.joust.com");
    }

//email methods
    public void enter_email(String email ) {
        emailField.type(email);
    }

    public void enter_email_password(String emailPassword ) {
        emailPassField.type(emailPassword);
    }

    public void click_on_continue_with_email() {
       continueWithEmailButton.click();
    }

    public void enter_first_name(String name) {
        firstNameField.type(name);
    }

    public void enter_last_name(String name) {
        lastNameField.type(name);
    }

    public void click_on_lets_do_this_button() {
        letsDoThisButton.click();
    }



}




