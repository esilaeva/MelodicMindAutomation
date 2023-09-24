package com.melodicmind.pages;

import com.codeborne.selenide.SelenideElement;
import com.melodicmind.pages.components.HeaderComponent;
import com.melodicmind.tests.TestBase;
import io.qameta.allure.Step;
import lombok.Getter;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Getter
public class LoginPage extends TestBase {

    HeaderComponent header = new HeaderComponent();
    HomePage homePage = new HomePage();

    SelenideElement
            btnContinueWithEmail = $("div.btn-container").lastChild(),
            tabSignIn = $("div.email-auth-container").$(byText("Sign in")),
            btnSignUp = $("form.login-form button").$(byText("Sign up")),
            btnSignIn = $("form.login-form").lastChild(),
            inputEmail = $("form.q-form.login-form input[aria-label='Email']"),
            inputPassword = $("form.q-form.login-form input[aria-label='Password'"),
            errorSignInWrongEmail = $("#q-notify").$(byText("Error signing in, please try again.")),
            errorSignInWrongPassword = $("#q-notify").$(byText("Wrong password")),
            errorSignInUnregisteredUser = $("#q-notify").$(byText("No user found with this email")),
            errorSignInInvalidEmail = $(byText("Invalid email address"));

    @Step("Open {url}")
    public LoginPage openPage(String url) {
        open(url);

        return this;
    }

    @Step("Click on the {elementName}")
    public LoginPage clickElement(String elementName, SelenideElement element) {
        element.click();

        return this;
    }

    @Step("Set value into {elementName}")
    public LoginPage setValue(String elementName, SelenideElement element, String value) {
        element.setValue(value);

        return this;
    }

    @Step("Verification: {elementName} appeared")
    public void checkTheElementAppear(String elementName, SelenideElement element) {
        element.should(appear);
    }

    @Step("Verification: {elementName} disappeared")
    public LoginPage checkTheElementDisappear(String elementName, SelenideElement element) {
        element.should(disappear);

        return this;
    }

    @Step("Delete cookies")
    public LoginPage acceptCookie() {
        homePage.btnAcceptCookies.click();

        return this;
    }
}
