package Joust;

        import net.thucydides.core.annotations.Issue;
        import net.thucydides.core.annotations.ManagedPages;
        import net.thucydides.core.annotations.Pending;
        import net.thucydides.core.annotations.Steps;
        import net.thucydides.core.annotations.Story;
        import net.thucydides.core.pages.Pages;
        import net.thucydides.core.annotations.Managed;
        import net.thucydides.junit.runners.ThucydidesRunner;

        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.openqa.selenium.WebDriver;

        import Joust.requirements.Application;
        import Joust.steps.EndUserSteps;
        import other_resources.Utils;

@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
public class AuthorizationTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "https://qa.test.joust.com")
    public Pages pages;

    @Steps
    public EndUserSteps endUser;

    String timestamp = Utils.get_timestamp();

    @Test
    public void log_in_via_email() {
        endUser.is_the_login_page();
        endUser.logs_in("testjoust@mailinator.com", "kristinka1");
        endUser.should_be_logged_in("Zhanna mailinator");

    }

    @Test
    public void sign_up_as_guest() {
        endUser.is_the_sign_up_page();
        endUser.signs_up_as_guest();
        endUser.should_be_logged_in("Guest");
    }

    @Test
    public void sign_up_via_facebook() {
        endUser.is_the_sign_up_page();
        endUser.signs_up_with_facebook("zvasilevskaya@cogniance.com", "qwas12345678");

        endUser.should_be_logged_in("Jane");
    }

    @Test
    public void sign_up_via_fb_from_banner() {
        endUser.is_the_sign_up_page();
        endUser.signs_up_as_guest();
        endUser.signs_up_with_facebook_from_banner("zvasilevskaya@cogniance.com", "qwas12345678");
        endUser.should_be_logged_in("jane");
    }

    @Test
    public void sign_up_with_email() {
        endUser.is_the_sign_up_page();
        endUser.enters_users_credentials("email" + timestamp + "@gmail.com", "password123");
        endUser.enters_first_last_names("test" + timestamp, "test" + timestamp);
        endUser.should_be_logged_in("test" + timestamp);
    }

    @Test
    public void sign_up_with_email_from_banner() {
        endUser.is_the_sign_up_page();
        endUser.enters_users_credentials("email" + timestamp + "@gmail.com", "password123");
        endUser.enters_first_last_names("test" + timestamp, "test" + timestamp);
        endUser.should_be_logged_in("test" + timestamp);
    }


}