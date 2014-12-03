package Joust.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.thucydides.core.pages.WebElementFacade;

import net.thucydides.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("https://qa.test.joust.com/login")
public class LoginPage extends PageObject {

    @FindBy(css="[name='emailAddress']")
    private WebElementFacade loginField;

    @FindBy(css="[name='password']")
    private WebElementFacade passwordField;

    @FindBy(css="[name='submit']")
    private WebElementFacade loginButton;


    public void enter_username(String name) {
        loginField.type(name);
    }

    public void enter_password(String pass) {
        passwordField.type(pass);
    }

    public void click_on_login_button() {
        loginButton.click();
    }

}