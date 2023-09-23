package com.melodicmind.tests;

import com.melodicmind.components.WebSteps;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selenide.$;

public class LoginTests extends TestBase {

    WebSteps step = new WebSteps();

    @Test
    @Tag("login")
    @DisplayName("Positive login with email")
    @Feature("Login test")
    void loginSuccessWithEmail() {
        step.openPage(urlLogin);
        step.clickElement("CONTINUE_WITH_EMAIL", continueWithEmail);
        step.clickElement("TAB_SIGN_IN", tabSignIn);
        $(btnSignUp).should(disappear);
        step.setValue("EMAIL", inputEmail, email);
        step.setValue("PASSWORD", inputPassword, password);
        step.clickElement("BTN_SIGN_IN", btnSignIn);

        step.checkTheElementExists(btnProfile);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email without '@'")
    @Feature("Login test")
    void loginNegativeWrongEmailWithoutAt() {
        step.openPage(urlLogin);
        step.clickElement("CONTINUE_WITH_EMAIL", continueWithEmail);
        step.clickElement("TAB_SIGN_IN", tabSignIn);
        $(btnSignUp).should(disappear);
        step.setValue("EMAIL", inputEmail, "ilana.qaproton.me");
        step.setValue("PASSWORD", inputPassword, password);
        step.clickElement("BTN_SIGN_IN", btnSignIn);

        step.checkTheElementExists(errorSignInWrongEmail);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email with '@@'")
    @Feature("Login test")
    void loginNegativeWrongEmailWithTwoAt() {
        step.openPage(urlLogin);
        step.clickElement("CONTINUE_WITH_EMAIL", continueWithEmail);
        step.clickElement("TAB_SIGN_IN", tabSignIn);
        $(btnSignUp).should(disappear);
        step.setValue("EMAIL", inputEmail, "ilana.qa@@proton.me");
        step.setValue("PASSWORD", inputPassword, password);
        step.clickElement("BTN_SIGN_IN", btnSignIn);

        step.checkTheElementExists(errorSignInWrongEmail);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email without userName")
    @Feature("Login test")
    void loginNegativeWrongEmailWithoutNameMail() {
        step.openPage(urlLogin);
        step.clickElement("CONTINUE_WITH_EMAIL", continueWithEmail);
        step.clickElement("TAB_SIGN_IN", tabSignIn);
        $(btnSignUp).should(disappear);
        step.setValue("EMAIL", inputEmail, "@proton.me");
        step.setValue("PASSWORD", inputPassword, password);
        step.clickElement("BTN_SIGN_IN", btnSignIn);

        step.checkTheElementExists(errorSignInWrongEmail);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email without domain")
    @Feature("Login test")
    void loginNegativeWrongEmailWithoutDomain() {
        step.openPage(urlLogin);
        step.clickElement("CONTINUE_WITH_EMAIL", continueWithEmail);
        step.clickElement("TAB_SIGN_IN", tabSignIn);
        $(btnSignUp).should(disappear);
        step.setValue("EMAIL", inputEmail, "ilana.qa@");
        step.setValue("PASSWORD", inputPassword, password);
        step.clickElement("BTN_SIGN_IN", btnSignIn);

        step.checkTheElementExists(errorSignInWrongEmail);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email with wrong domain")
    @Feature("Login test")
    void loginNegativeWrongEmailWithWrongDomain() {
        step.openPage(urlLogin);
        step.clickElement("CONTINUE_WITH_EMAIL", continueWithEmail);
        step.clickElement("TAB_SIGN_IN", tabSignIn);
        $(btnSignUp).should(disappear);
        step.setValue("EMAIL", inputEmail, "ilana.qa@.me");
        step.setValue("PASSWORD", inputPassword, password);
        step.clickElement("BTN_SIGN_IN", btnSignIn);

        step.checkTheElementExists(errorSignInWrongEmail);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email with '..' in domain")
    @Feature("Login test")
    void loginNegativeWrongEmailWithTwoDots() {
        step.openPage(urlLogin);
        step.clickElement("CONTINUE_WITH_EMAIL", continueWithEmail);
        step.clickElement("TAB_SIGN_IN", tabSignIn);
        $(btnSignUp).should(disappear);
        step.setValue("EMAIL", inputEmail, "ilana.qa@proton..me");
        step.setValue("PASSWORD", inputPassword, password);
        step.clickElement("BTN_SIGN_IN", btnSignIn);

        step.checkTheElementExists(errorSignInWrongEmail);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email with rus symbol")
    @Feature("Login test")
    void loginNegativeWrongEmailWithRusSymbols() {
        step.openPage(urlLogin);
        step.clickElement("CONTINUE_WITH_EMAIL", continueWithEmail);
        step.clickElement("TAB_SIGN_IN", tabSignIn);
        $(btnSignUp).should(disappear);
        step.setValue("EMAIL", inputEmail, "ilanа.qa@proton.me");
        step.setValue("PASSWORD", inputPassword, password);
        step.clickElement("BTN_SIGN_IN", btnSignIn);

        step.checkTheElementExists(errorSignInUnregisteredUser);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email, spaced user name")
    @Feature("Login test")
    void loginNegativeWrongEmailWithSpace() {
        step.openPage(urlLogin);
        step.clickElement("CONTINUE_WITH_EMAIL", continueWithEmail);
        step.clickElement("TAB_SIGN_IN", tabSignIn);
        $(btnSignUp).should(disappear);
        step.setValue("EMAIL", inputEmail, " ");
        step.setValue("PASSWORD", inputPassword, password);
        step.clickElement("BTN_SIGN_IN", btnSignIn);

        step.checkTheElementExists(errorSignInWrongEmail);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @Disabled("The test off")
    @DisplayName("Negative login, wrong email, user name is empty")
    @Feature("Login test")
    void loginNegativeEmptyEmail() {
        step.openPage(urlLogin);
        step.clickElement("CONTINUE_WITH_EMAIL", continueWithEmail);
        step.clickElement("TAB_SIGN_IN", tabSignIn);
        $(btnSignUp).should(disappear);
        step.setValue("EMAIL", inputEmail, "");
        step.setValue("PASSWORD", inputPassword, password);
        step.clickElement("BTN_SIGN_IN", btnSignIn);

        step.checkTheElementExists(errorSignInInvalidEmail);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @Disabled("The test off")
    @DisplayName("Negative login, wrong email, user name is null")
    @Feature("Login test")
    void loginNegativeNullEmail() {
        step.openPage(urlLogin);
        step.clickElement("CONTINUE_WITH_EMAIL", continueWithEmail);
        step.clickElement("TAB_SIGN_IN", tabSignIn);
        $(btnSignUp).should(disappear);
        step.setValue("EMAIL", inputEmail, null);
        step.setValue("PASSWORD", inputPassword, password);
        step.clickElement("BTN_SIGN_IN", btnSignIn);

        step.checkTheElementExists(errorSignInInvalidEmail);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @Disabled("The test off")
    @DisplayName("Negative login, wrong password")
    @Feature("Login test")
    void loginNegativeWithEmailWrongPassword() {
        step.openPage(urlLogin);
        step.clickElement("CONTINUE_WITH_EMAIL", continueWithEmail);
        step.clickElement("TAB_SIGN_IN", tabSignIn);
        $(btnSignUp).should(disappear);
        step.setValue("EMAIL", inputEmail, email);
        step.setValue("PASSWORD", inputPassword, "Ii12345");
        step.clickElement("BTN_SIGN_IN", btnSignIn);

        step.checkTheElementExists(errorSignInWrongPassword);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @Disabled("The test off")
    @DisplayName("Negative login, unregistered user")
    @Feature("Login test")
    void loginNegativeUnregisteredUser() {
        step.openPage(urlLogin);
        step.clickElement("CONTINUE_WITH_EMAIL", continueWithEmail);
        step.clickElement("TAB_SIGN_IN", tabSignIn);
        $(btnSignUp).should(disappear);
        step.setValue("EMAIL", inputEmail, "ilana.qa+1@proton.me");
        step.setValue("PASSWORD", inputPassword, password);
        step.clickElement("BTN_SIGN_IN", btnSignIn);

        step.checkTheElementExists(errorSignInUnregisteredUser);
    }
}
