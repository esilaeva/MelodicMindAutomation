package com.melodicmind.tests;

import com.melodicmind.pages.LoginPage;
import com.melodicmind.pages.components.HeaderComponent;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class LoginTests extends TestBase {

    LoginPage loginPage = new LoginPage();
    HeaderComponent headerComponent = new HeaderComponent();
    String url = "https://melodic-mind.com/login";

    @Test
    @Tag("login")
    @DisplayName("Positive login with email")
    @Feature("Login test")
    void loginSuccessWithEmail() {
        loginPage
                .openPage(url)
                .acceptCookie()
                .clickElement("button 'Continue With Email'", loginPage.getBtnContinueWithEmail())
                .clickElement("tab 'Sign in'", loginPage.getTabSignIn())
                .checkTheElementDisappear("button 'Sign Up'", loginPage.getBtnSignUp())
                .setValue("input email", loginPage.getInputEmail(), "ilana.qa@proton.me")
                .setValue("input password", loginPage.getInputPassword(), "Ii12345$")
                .clickElement("button 'Sign in'", loginPage.getBtnSignIn())

                .checkTheElementAppear("button 'Profile'", headerComponent.getBtnProfile());
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email without '@'")
    @Feature("Login test")
    void loginNegativeWrongEmailWithoutAt() {
        loginPage
                .openPage(url)
                .acceptCookie()
                .clickElement("button 'Continue With Email'", loginPage.getBtnContinueWithEmail())
                .clickElement("tab 'Sign in'", loginPage.getTabSignIn())
                .checkTheElementDisappear("button 'Sign Up'", loginPage.getBtnSignUp())
                .setValue("input email", loginPage.getInputEmail(), "ilana.qaproton.me")
                .setValue("input password", loginPage.getInputPassword(), "Ii12345$")
                .clickElement("button 'Sign in'", loginPage.getBtnSignIn())

                .checkTheElementAppear("message 'Error signing in, please try again.'", loginPage.getErrorSignInWrongEmail());
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email with '@@'")
    @Feature("Login test")
    void loginNegativeWrongEmailWithTwoAt() {
        loginPage
                .openPage(url)
                .acceptCookie()
                .clickElement("button 'Continue With Email'", loginPage.getBtnContinueWithEmail())
                .clickElement("tab 'Sign in'", loginPage.getTabSignIn())
                .checkTheElementDisappear("button 'Sign Up'", loginPage.getBtnSignUp())
                .setValue("input email", loginPage.getInputEmail(), "ilana.qa@@proton.me")
                .setValue("input password", loginPage.getInputPassword(), "Ii12345$")
                .clickElement("button 'Sign in'", loginPage.getBtnSignIn())

                .checkTheElementAppear("message 'Error signing in, please try again.'", loginPage.getErrorSignInWrongEmail());
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email without userName")
    @Feature("Login test")
    void loginNegativeWrongEmailWithoutNameMail() {
        loginPage
                .openPage(url)
                .acceptCookie()
                .clickElement("button 'Continue With Email'", loginPage.getBtnContinueWithEmail())
                .clickElement("tab 'Sign in'", loginPage.getTabSignIn())
                .checkTheElementDisappear("button 'Sign Up'", loginPage.getBtnSignUp())
                .setValue("input email", loginPage.getInputEmail(), "@proton.me")
                .setValue("input password", loginPage.getInputPassword(), "Ii12345$")
                .clickElement("button 'Sign in'", loginPage.getBtnSignIn())

                .checkTheElementAppear("message 'Error signing in, please try again.'", loginPage.getErrorSignInWrongEmail());
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email without domain")
    @Feature("Login test")
    void loginNegativeWrongEmailWithoutDomain() {
        loginPage
                .openPage(url)
                .acceptCookie()
                .clickElement("button 'Continue With Email'", loginPage.getBtnContinueWithEmail())
                .clickElement("tab 'Sign in'", loginPage.getTabSignIn())
                .checkTheElementDisappear("button 'Sign Up'", loginPage.getBtnSignUp())
                .setValue("input email", loginPage.getInputEmail(), "ilana.qa@")
                .setValue("input password", loginPage.getInputPassword(), "Ii12345$")
                .clickElement("button 'Sign in'", loginPage.getBtnSignIn())

                .checkTheElementAppear("message 'Error signing in, please try again.'", loginPage.getErrorSignInWrongEmail());
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email with wrong domain")
    @Feature("Login test")
    void loginNegativeWrongEmailWithWrongDomain() {
        loginPage
                .openPage(url)
                .acceptCookie()
                .clickElement("button 'Continue With Email'", loginPage.getBtnContinueWithEmail())
                .clickElement("tab 'Sign in'", loginPage.getTabSignIn())
                .checkTheElementDisappear("button 'Sign Up'", loginPage.getBtnSignUp())
                .setValue("input email", loginPage.getInputEmail(), "ilana.qa@.me")
                .setValue("input password", loginPage.getInputPassword(), "Ii12345$")
                .clickElement("button 'Sign in'", loginPage.getBtnSignIn())

                .checkTheElementAppear("message 'Error signing in, please try again.'", loginPage.getErrorSignInWrongEmail());
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email with '..' in domain")
    @Feature("Login test")
    void loginNegativeWrongEmailWithTwoDots() {
        loginPage
                .openPage(url)
                .acceptCookie()
                .clickElement("button 'Continue With Email'", loginPage.getBtnContinueWithEmail())
                .clickElement("tab 'Sign in'", loginPage.getTabSignIn())
                .checkTheElementDisappear("button 'Sign Up'", loginPage.getBtnSignUp())
                .setValue("input email", loginPage.getInputEmail(), "ilana.qa@proton..me")
                .setValue("input password", loginPage.getInputPassword(), "Ii12345$")
                .clickElement("button 'Sign in'", loginPage.getBtnSignIn())

                .checkTheElementAppear("message 'Error signing in, please try again.'", loginPage.getErrorSignInWrongEmail());
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email with rus symbol")
    @Feature("Login test")
    void loginNegativeWrongEmailWithRusSymbols() {
        loginPage
                .openPage(url)
                .acceptCookie()
                .clickElement("button 'Continue With Email'", loginPage.getBtnContinueWithEmail())
                .clickElement("tab 'Sign in'", loginPage.getTabSignIn())
                .checkTheElementDisappear("button 'Sign Up'", loginPage.getBtnSignUp())
                .setValue("input email", loginPage.getInputEmail(), "ilanа.qa@proton.me")
                .setValue("input password", loginPage.getInputPassword(), "Ii12345$")
                .clickElement("button 'Sign in'", loginPage.getBtnSignIn())

                .checkTheElementAppear("message 'No user found with this email'", loginPage.getErrorSignInUnregisteredUser());
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email, spaced user name")
    @Feature("Login test")
    void loginNegativeWrongEmailWithSpace() {
        loginPage
                .openPage(url)
                .acceptCookie()
                .clickElement("button 'Continue With Email'", loginPage.getBtnContinueWithEmail())
                .clickElement("tab 'Sign in'", loginPage.getTabSignIn())
                .checkTheElementDisappear("button 'Sign Up'", loginPage.getBtnSignUp())
                .setValue("input email", loginPage.getInputEmail(), " ")
                .setValue("input password", loginPage.getInputPassword(), "Ii12345$")
                .clickElement("button 'Sign in'", loginPage.getBtnSignIn())

                .checkTheElementAppear("message 'Error signing in, please try again.'", loginPage.getErrorSignInWrongEmail());
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @Disabled("The test off")
    @DisplayName("Negative login, wrong email, user name is empty")
    @Feature("Login test")
    void loginNegativeEmptyEmail() {
        loginPage
                .openPage(url)
                .acceptCookie()
                .clickElement("button 'Continue With Email'", loginPage.getBtnContinueWithEmail())
                .clickElement("tab 'Sign in'", loginPage.getTabSignIn())
                .checkTheElementDisappear("button 'Sign Up'", loginPage.getBtnSignUp())
                .setValue("input email", loginPage.getInputEmail(), "")
                .setValue("input password", loginPage.getInputPassword(), "Ii12345$")
                .clickElement("button 'Sign in'", loginPage.getBtnSignIn())

                .checkTheElementAppear("message 'Invalid email address'", loginPage.getErrorSignInInvalidEmail());
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @Disabled("The test off")
    @DisplayName("Negative login, wrong email, user name is null")
    @Feature("Login test")
    void loginNegativeNullEmail() {
        loginPage
                .openPage(url)
                .acceptCookie()
                .clickElement("button 'Continue With Email'", loginPage.getBtnContinueWithEmail())
                .clickElement("tab 'Sign in'", loginPage.getTabSignIn())
                .checkTheElementDisappear("button 'Sign Up'", loginPage.getBtnSignUp())
                .setValue("input email", loginPage.getInputEmail(), null)
                .setValue("input password", loginPage.getInputPassword(), "Ii12345$")
                .clickElement("button 'Sign in'", loginPage.getBtnSignIn())

                .checkTheElementAppear("message 'Invalid email address'", loginPage.getErrorSignInInvalidEmail());
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @Disabled("The test off")
    @DisplayName("Negative login, wrong password")
    @Feature("Login test")
    void loginNegativeWithEmailWrongPassword() {
        loginPage
                .openPage(url)
                .acceptCookie()
                .clickElement("button 'Continue With Email'", loginPage.getBtnContinueWithEmail())
                .clickElement("tab 'Sign in'", loginPage.getTabSignIn())
                .checkTheElementDisappear("button 'Sign Up'", loginPage.getBtnSignUp())
                .setValue("input email", loginPage.getInputEmail(), "ilana.qa@proton.me")
                .setValue("input password", loginPage.getInputPassword(), "Ii12345")
                .clickElement("button 'Sign in'", loginPage.getBtnSignIn())

                .checkTheElementAppear("message 'Wrong password'", loginPage.getErrorSignInWrongPassword());
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @Disabled("The test off")
    @DisplayName("Negative login, unregistered user")
    @Feature("Login test")
    void loginNegativeUnregisteredUser() {
        loginPage
                .openPage(url)
                .acceptCookie()
                .clickElement("button 'Continue With Email'", loginPage.getBtnContinueWithEmail())
                .clickElement("tab 'Sign in'", loginPage.getTabSignIn())
                .checkTheElementDisappear("button 'Sign Up'", loginPage.getBtnSignUp())
                .setValue("input email", loginPage.getInputEmail(), "ilana.qa+1@proton.me")
                .setValue("input password", loginPage.getInputPassword(), "Ii12345$")
                .clickElement("button 'Sign in'", loginPage.getBtnSignIn())

                .checkTheElementAppear("message 'No user found with this email'", loginPage.getErrorSignInUnregisteredUser());
    }
}
