package com.melodicmind.tests;

import com.melodicmind.pages.LoginPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class LoginTests extends TestBase {

    LoginPage login = new LoginPage();

    @Test
    @Tag("login")
    @DisplayName("Positive login with email")
    void loginSuccessWithEmail() {

        login
                .openLoginPage()
                .continueWithEmail()
                .chooseTabSignIn()
                .setEmail("ilana.qa@proton.me")
                .setPassword("Ii12345$")
                .clickSighIn();

        login.checkProfile();
        closeWebDriver();
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email without '@'")
    void loginNegativeWrongEmailWithoutAt() {
        login
                .openLoginPage()
                .continueWithEmail()
                .chooseTabSignIn()
                .setEmail("ilana.qaproton.me")
                .setPassword("Ii12345$")
                .clickSighIn();

        login.checkErrorSignInWrongEmail();
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email with '@@'")
    void loginNegativeWrongEmailWithTwoAt() {
        login
                .openLoginPage()
                .continueWithEmail()
                .chooseTabSignIn()
                .setEmail("ilana.qa@@proton.me")
                .setPassword("Ii12345$")
                .clickSighIn();

        login.checkErrorSignInWrongEmail();
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email without userName")
    void loginNegativeWrongEmailWithoutNameMail() {
        login
                .openLoginPage()
                .continueWithEmail()
                .chooseTabSignIn()
                .setEmail("@proton.me")
                .setPassword("Ii12345$")
                .clickSighIn();

        login.checkErrorSignInWrongEmail();
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email without domain")
    void loginNegativeWrongEmailWithoutDomain() {
        login
                .openLoginPage()
                .continueWithEmail()
                .chooseTabSignIn()
                .setEmail("ilana.qa@")
                .setPassword("Ii12345$")
                .clickSighIn();

        login.checkErrorSignInWrongEmail();
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email with wrong domain")
    void loginNegativeWrongEmailWithWrongDomain() {
        login
                .openLoginPage()
                .continueWithEmail()
                .chooseTabSignIn()
                .setEmail("ilana.qa@.me")
                .setPassword("Ii12345$")
                .clickSighIn();

        login.checkErrorSignInWrongEmail();
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email with '..' in domain")
    void loginNegativeWrongEmailWithTwoDots() {
        login
                .openLoginPage()
                .continueWithEmail()
                .chooseTabSignIn()
                .setEmail("ilana.qa@proton..me")
                .setPassword("Ii12345$")
                .clickSighIn();

        login.checkErrorSignInWrongEmail();
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email with rus symbols")
    void loginNegativeWrongEmailWithRusSymbols() {
        login
                .openLoginPage()
                .continueWithEmail()
                .chooseTabSignIn()
                .setEmail("илана.qa@proton..me")
                .setPassword("Ii12345$")
                .clickSighIn();

        login.checkErrorSignInWrongEmail();
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email, spaced user name")
    void loginNegativeWrongEmailWithSpace() {
        login
                .openLoginPage()
                .continueWithEmail()
                .chooseTabSignIn()
                .setEmail(" ")
                .setPassword("Ii12345$")
                .clickSighIn();

        login.checkErrorSignInWrongEmail();
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email, user name is empty")
    void loginNegativeEmptyEmail() {
        login
                .openLoginPage()
                .continueWithEmail()
                .chooseTabSignIn()
                .setEmail("")
                .setPassword("Ii12345$")
                .clickSighIn();

        login.checkErrorEmptyEmail("Invalid email address");
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email, user name is null")
    void loginNegativeNullEmail() {
        login
                .openLoginPage()
                .continueWithEmail()
                .chooseTabSignIn()
                .setEmail(null)
                .setPassword("Ii12345$")
                .clickSighIn();

        login.checkErrorEmptyEmail("Invalid email address");
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong password")
    void loginNegativeWithEmailWrongPassword() {
        login
                .openLoginPage()
                .checkLoginPageOpened()
                .continueWithEmail()
                .chooseTabSignIn()
                .setEmail("ilana.qa@proton.me")
                .setPassword("Ii12345")
                .clickSighIn();

        login.checkErrorSignInWrongPassword();
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, unregistered user")
    void loginNegativeUnregisteredUser() {
        login
                .openLoginPage()
                .continueWithEmail()
                .chooseTabSignIn()
                .setEmail("ilana.qa+1@proton.me")
                .setPassword("Ii12345$")
                .clickSighIn();

        login.checkErrorSignInUnregUser("No user found with this email");
    }
}
