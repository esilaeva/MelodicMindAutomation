package com.melodicmind.tests;

import components.WebSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.sleep;

public class HomepageTests extends TestBase {

    WebSteps step = new WebSteps();

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'The Story' Button")
    public void verificationTheStoryButtons() {
        step.openPage(URL_MAIN);
        step.clickElement(BTN_THE_STORY);
        step.checkThePageOpened(TITLE_THE_STORY_PAGE);
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Learn' Button")
    public void verificationLearnButton() {
        step.openPage(URL_MAIN);
        step.clickElement(BTN_LEARN);
        step.checkThePageOpened(TITLE_LEARN_PAGE);
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Blog' Button")
    public void verificationBlogButton() {
        step.openPage(URL_MAIN);
        step.clickElement(BTN_BLOG);
        step.checkThePageOpened(TITLE_BLOG_PAGE);
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Contact' Button")
    public void verificationContactButton() {
        step.openPage(URL_MAIN);
        step.clickElement(BTN_CONTACT);
        step.checkThePageOpened(TITLE_CONTACT_PAGE);
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Q and A' Button")
    public void verificationQandAButton() {
        step.openPage(URL_MAIN);
        step.clickElement(BTN_QA);
        step.checkThePageOpened(TITLE_QA_PAGE);
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Profile' Button")
    public void verificationProfileButton() {
        step.openPage(URL_LOGIN);
        step.clickElement(CONTINUE_WITH_EMAIL);
        step.clickElement(TAB_SIGN_IN);
        sleep(500);
        step.setValue(EMAIL_INPUT, EMAIL);
        step.setValue(PASSWORD_INPUT, PASSWORD);
        step.clickElement(BTN_SIGN_IN);
        step.checkTheElementExists(BTN_PROFILE);
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Login' Button")
    public void verificationLoginButton() {
        closeWebDriver();

        step.openPage(URL_MAIN);
        step.clickElement(BTN_LOGIN);
        step.checkTheElementExists(CONTINUE_WITH_EMAIL);
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Settings' Button")
    public void verificationButton() {
        step.openPage(URL_MAIN);
        step.clickElement(BTN_SETTINGS);
        step.checkTheElementExists(BTN_CLOSE);
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Homepage' Button")
    public void verificationHomeButton() {
        step.openPage(URL_LOGIN);
        step.clickElement(BTN_HOMEPAGE);
        step.checkContainsText(TITLE_HOME_PAGE, "Melodic Mind");
    }
}
