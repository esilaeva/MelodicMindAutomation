package com.melodicmind.pages;

import com.codeborne.selenide.SelenideElement;
import com.melodicmind.tests.TestBase;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends TestBase {

    SelenideElement
            profile = $("a[href='/account']"),
            continueWithEmail = $("div.btn-container").lastChild(),
            tabSignIn = $("div.email-auth-container").$(byText("Sign in")),
            emailInput = $("form.q-form.login-form input[aria-label='Email']"),
            passwordInput = $("form.q-form.login-form input[aria-label='Password'"),
            btnSignIn = $("form.login-form").lastChild(),
            errSignInWrongEmail = $("#q-notify").$(byText("Error signing in, please try again.")),
            errSignInWrongPassword = $("#q-notify").$(byText("Wrong password")),
            errSignInUnregUser = $("#q-notify").$(byText("No user found with this email")),
            errSignInEmptyEmail = $(byText("Invalid email address"));

    public LoginPage openLoginPage() {
        open("/login");

        return this;
    }

    public LoginPage checkLoginPageOpened() {
        continueWithEmail.should(appear);

        return this;
    }

    public LoginPage continueWithEmail() {
        continueWithEmail.lastChild().click();

        return this;
    }

    public LoginPage chooseTabSignIn() {
        tabSignIn.click();
        sleep(1000);

        return this;
    }

    public LoginPage setEmail(String email) {
        emailInput.setValue(email);

        return this;
    }

    public LoginPage setPassword(String password) {
        passwordInput.setValue(password);

        return this;
    }

    public void clickSighIn() {
        btnSignIn.click();

    }

    public void checkProfile() {
        profile.should(appear);
    }

    public void checkErrorSignInWrongEmail() {
        errSignInWrongEmail.should(appear);
    }

    public void checkErrorSignInWrongPassword() {
        errSignInWrongPassword.should(appear);
    }

    public void checkErrorSignInUnregUser(String value) {
        errSignInUnregUser.shouldHave(text(value));
    }

    public void checkErrorEmptyEmail(String value) {
        errSignInEmptyEmail.shouldHave(text(value));
    }


}


