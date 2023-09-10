package com.melodicmind.tests;

import com.melodicmind.pages.LoginPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class LoginTests extends TestBase {

    LoginPage login = new LoginPage();

    @Test
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
    void loginNegativeWrongEmailWithRusSybols() {
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
