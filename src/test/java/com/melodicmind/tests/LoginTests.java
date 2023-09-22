package com.melodicmind.tests;

import com.melodicmind.components.WebSteps;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class LoginTests extends TestBase {

    WebSteps step = new WebSteps();

    @Test
    @Tag("login")
    @DisplayName("Positive login with email")
    @Story("Login test")
    void loginSuccessWithEmail() {
        step.openPage(URL_LOGIN);
        step.clickElement("CONTINUE_WITH_EMAIL", CONTINUE_WITH_EMAIL);
        step.clickElement("TAB_SIGN_IN", TAB_SIGN_IN);
        sleep(500);
        step.setValue("EMAIL", EMAIL_INPUT, EMAIL);
        step.setValue("PASSWORD", PASSWORD_INPUT, PASSWORD);
        step.clickElement("BTN_SIGN_IN", BTN_SIGN_IN);

        step.checkTheElementExists(BTN_PROFILE);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email without '@'")
    @Story("Login test")
    void loginNegativeWrongEmailWithoutAt() {
        step.openPage(URL_LOGIN);
        step.clickElement("CONTINUE_WITH_EMAIL", CONTINUE_WITH_EMAIL);
        step.clickElement("TAB_SIGN_IN", TAB_SIGN_IN);
        sleep(500);
        step.setValue("EMAIL", EMAIL_INPUT, "ilana.qaproton.me");
        step.setValue("PASSWORD", PASSWORD_INPUT, PASSWORD);
        step.clickElement("BTN_SIGN_IN", BTN_SIGN_IN);

        step.checkTheElementExists(ERROR_SIGN_IN_WRONG_EMAIL);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email with '@@'")
    @Story("Login test")
    void loginNegativeWrongEmailWithTwoAt() {
        step.openPage(URL_LOGIN);
        step.clickElement("CONTINUE_WITH_EMAIL", CONTINUE_WITH_EMAIL);
        step.clickElement("TAB_SIGN_IN", TAB_SIGN_IN);
        sleep(500);
        step.setValue("EMAIL", EMAIL_INPUT, "ilana.qa@@proton.me");
        step.setValue("PASSWORD", PASSWORD_INPUT, PASSWORD);
        step.clickElement("BTN_SIGN_IN", BTN_SIGN_IN);

        step.checkTheElementExists(ERROR_SIGN_IN_WRONG_EMAIL);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email without userName")
    @Story("Login test")
    void loginNegativeWrongEmailWithoutNameMail() {
        step.openPage(URL_LOGIN);
        step.clickElement("CONTINUE_WITH_EMAIL", CONTINUE_WITH_EMAIL);
        step.clickElement("TAB_SIGN_IN", TAB_SIGN_IN);
        sleep(500);
        step.setValue("EMAIL", EMAIL_INPUT, "@proton.me");
        step.setValue("PASSWORD", PASSWORD_INPUT, PASSWORD);
        step.clickElement("BTN_SIGN_IN", BTN_SIGN_IN);

        step.checkTheElementExists(ERROR_SIGN_IN_WRONG_EMAIL);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @DisplayName("Negative login, wrong email without domain")
    @Story("Login test")
    void loginNegativeWrongEmailWithoutDomain() {
        step.openPage(URL_LOGIN);
        step.clickElement("CONTINUE_WITH_EMAIL", CONTINUE_WITH_EMAIL);
        step.clickElement("TAB_SIGN_IN", TAB_SIGN_IN);
        sleep(500);
        step.setValue("EMAIL", EMAIL_INPUT, "ilana.qa@");
        step.setValue("PASSWORD", PASSWORD_INPUT, PASSWORD);
        step.clickElement("BTN_SIGN_IN", BTN_SIGN_IN);

        step.checkTheElementExists(ERROR_SIGN_IN_WRONG_EMAIL);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @Disabled("The test off")
    @DisplayName("Negative login, wrong email with wrong domain")
    @Story("Login test")
    void loginNegativeWrongEmailWithWrongDomain() {
        step.openPage(URL_LOGIN);
        step.clickElement("CONTINUE_WITH_EMAIL", CONTINUE_WITH_EMAIL);
        step.clickElement("TAB_SIGN_IN", TAB_SIGN_IN);
        sleep(500);
        step.setValue("EMAIL", EMAIL_INPUT, "ilana.qa@.me");
        step.setValue("PASSWORD", PASSWORD_INPUT, PASSWORD);
        step.clickElement("BTN_SIGN_IN", BTN_SIGN_IN);

        step.checkTheElementExists(ERROR_SIGN_IN_WRONG_EMAIL);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @Disabled("The test off")
    @DisplayName("Negative login, wrong email with '..' in domain")
    @Story("Login test")
    void loginNegativeWrongEmailWithTwoDots() {
        step.openPage(URL_LOGIN);
        step.clickElement("CONTINUE_WITH_EMAIL", CONTINUE_WITH_EMAIL);
        step.clickElement("TAB_SIGN_IN", TAB_SIGN_IN);
        sleep(500);
        step.setValue("EMAIL", EMAIL_INPUT, "ilana.qa@proton..me");
        step.setValue("PASSWORD", PASSWORD_INPUT, PASSWORD);
        step.clickElement("BTN_SIGN_IN", BTN_SIGN_IN);

        step.checkTheElementExists(ERROR_SIGN_IN_WRONG_EMAIL);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @Disabled("The test off")
    @DisplayName("Negative login, wrong email with rus symbol")
    @Story("Login test")
    void loginNegativeWrongEmailWithRusSymbols() {
        step.openPage(URL_LOGIN);
        step.clickElement("CONTINUE_WITH_EMAIL", CONTINUE_WITH_EMAIL);
        step.clickElement("TAB_SIGN_IN", TAB_SIGN_IN);
        sleep(500);
        step.setValue("EMAIL", EMAIL_INPUT, "ilanа.qa@proton.me");
        step.setValue("PASSWORD", PASSWORD_INPUT, PASSWORD);
        step.clickElement("BTN_SIGN_IN", BTN_SIGN_IN);

        step.checkTheElementExists(ERROR_SIGN_IN_UNREGISTERED_USER);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @Disabled("The test off")
    @DisplayName("Negative login, wrong email, spaced user name")
    @Story("Login test")
    void loginNegativeWrongEmailWithSpace() {
        step.openPage(URL_LOGIN);
        step.clickElement("CONTINUE_WITH_EMAIL", CONTINUE_WITH_EMAIL);
        step.clickElement("TAB_SIGN_IN", TAB_SIGN_IN);
        sleep(500);
        step.setValue("EMAIL", EMAIL_INPUT, " ");
        step.setValue("PASSWORD", PASSWORD_INPUT, PASSWORD);
        step.clickElement("BTN_SIGN_IN", BTN_SIGN_IN);

        step.checkTheElementExists(ERROR_SIGN_IN_WRONG_EMAIL);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @Disabled("The test off")
    @DisplayName("Negative login, wrong email, user name is empty")
    @Story("Login test")
    void loginNegativeEmptyEmail() {
        step.openPage(URL_LOGIN);
        step.clickElement("CONTINUE_WITH_EMAIL", CONTINUE_WITH_EMAIL);
        step.clickElement("TAB_SIGN_IN", TAB_SIGN_IN);
        sleep(500);
        step.setValue("EMAIL", EMAIL_INPUT, "");
        step.setValue("PASSWORD", PASSWORD_INPUT, PASSWORD);
        step.clickElement("BTN_SIGN_IN", BTN_SIGN_IN);

        step.checkTheElementExists(ERROR_SIGN_IN_INVALID_EMAIL);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @Disabled("The test off")
    @DisplayName("Negative login, wrong email, user name is null")
    @Story("Login test")
    void loginNegativeNullEmail() {
        step.openPage(URL_LOGIN);
        step.clickElement("CONTINUE_WITH_EMAIL", CONTINUE_WITH_EMAIL);
        step.clickElement("TAB_SIGN_IN", TAB_SIGN_IN);
        sleep(500);
        step.setValue("EMAIL", EMAIL_INPUT, null);
        step.setValue("PASSWORD", PASSWORD_INPUT, PASSWORD);
        step.clickElement("BTN_SIGN_IN", BTN_SIGN_IN);

        step.checkTheElementExists(ERROR_SIGN_IN_INVALID_EMAIL);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @Disabled("The test off")
    @DisplayName("Negative login, wrong password")
    @Story("Login test")
    void loginNegativeWithEmailWrongPassword() {
        step.openPage(URL_LOGIN);
        step.clickElement("CONTINUE_WITH_EMAIL", CONTINUE_WITH_EMAIL);
        step.clickElement("TAB_SIGN_IN", TAB_SIGN_IN);
        sleep(500);
        step.setValue("EMAIL", EMAIL_INPUT, EMAIL);
        step.setValue("PASSWORD", PASSWORD_INPUT, "Ii12345");
        step.clickElement("BTN_SIGN_IN", BTN_SIGN_IN);

        step.checkTheElementExists(ERROR_SIGN_IN_WRONG_PASSWORD);
    }

    @Test
    @Tag("login")
    @Tag("negative")
    @Disabled("The test off")
    @DisplayName("Negative login, unregistered user")
    @Story("Login test")
    void loginNegativeUnregisteredUser() {
        step.openPage(URL_LOGIN);
        step.clickElement("CONTINUE_WITH_EMAIL", CONTINUE_WITH_EMAIL);
        step.clickElement("TAB_SIGN_IN", TAB_SIGN_IN);
        sleep(500);
        step.setValue("EMAIL", EMAIL_INPUT, "ilana.qa+1@proton.me");
        step.setValue("PASSWORD", PASSWORD_INPUT, PASSWORD);
        step.clickElement("BTN_SIGN_IN", BTN_SIGN_IN);

        step.checkTheElementExists(ERROR_SIGN_IN_UNREGISTERED_USER);
    }
}
