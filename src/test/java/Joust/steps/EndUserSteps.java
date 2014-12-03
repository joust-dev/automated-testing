package Joust.steps;

import Joust.pages.GuestHomePage;
import Joust.pages.LoginPage;
import Joust.pages.SignUpPage;
import Joust.pages.UserHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static ch.lambdaj.Lambda.join;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.core.Is.is;

public class EndUserSteps extends ScenarioSteps {

    LoginPage loginPage;
    UserHomePage userHomePage;
    SignUpPage signUpPage;
    GuestHomePage guestHomePage;

    // Login page steps
    @Step
    public void is_the_login_page() {
        loginPage.open();
    }

    @Step
    public void logs_in(String userName, String pass) {
        loginPage.enter_username(userName);
        loginPage.enter_password(pass);
        loginPage.click_on_login_button();
    }

    //Home page steps
    @Step
    public void should_be_logged_in(String username) {
        assertThat(userHomePage.get_user_name(), is(username));
    }

    //Guest Home page steps
    public void is_the_guest_home_page() {
        guestHomePage.open();
    }


    @Step
    public void is_the_sign_up_page() {
        signUpPage.open();
    }


    @Step
    public void signs_up_as_guest() {
        signUpPage.click_on_guest_mode_link();
    }


    @Step
    public void signs_up_with_facebook(String fbLogin, String pass) {
        signUpPage.click_on_continue_with_fb_button();
        signUpPage.enter_fb_user_login(fbLogin);
        signUpPage.enter_fb_pass(pass);
        signUpPage.click_on_enter_to_Fb_button();
    }

    @Step
    public void signs_up_with_facebook_from_banner(String fbLogin, String pass) {
        guestHomePage.click_on_continue_with_fb_button();
        signUpPage.enter_fb_user_login(fbLogin);
        signUpPage.enter_fb_pass(pass);
        signUpPage.click_on_enter_to_Fb_button();
    }

    @Step
    public void enters_users_credentials(String email, String pass) {
        signUpPage.enter_email(email);
        signUpPage.enter_email_password(pass);
        signUpPage.click_on_continue_with_email();
    }

    @Step
    public void enters_first_last_names(String firstName, String lastName) {
        signUpPage.enter_first_name(firstName);
        signUpPage.enter_last_name(lastName);
        signUpPage.click_on_lets_do_this_button();

    }

}