package com.melodicmind.tests;

import com.melodicmind.components.WebSteps;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class HomepageTests extends TestBase {

    WebSteps step = new WebSteps();
    String elementName = null;

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'The Story' Button")
    public void verificationTheStoryButtons() {
        step.openPage(URL_MAIN);
        elementName = step.getConstantElement(BTN_THE_STORY);
        step.clickElement(elementName, BTN_THE_STORY);

        step.checkThePageOpened(TITLE_THE_STORY_PAGE);
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Learn' Button")
    public void verificationLearnButton() {
        step.openPage(URL_MAIN);
        elementName = step.getConstantElement(BTN_LEARN);
        step.clickElement(elementName, BTN_LEARN);

        step.checkThePageOpened(TITLE_LEARN_PAGE);
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Blog' Button")
    public void verificationBlogButton() {
        step.openPage(URL_MAIN);
        elementName = step.getConstantElement(BTN_BLOG);
        step.clickElement(elementName, BTN_BLOG);

        step.checkThePageOpened(TITLE_BLOG_PAGE);
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Contact' Button")
    public void verificationContactButton() {
        step.openPage(URL_MAIN);
        elementName = step.getConstantElement(BTN_CONTACT);
        step.clickElement(elementName, BTN_CONTACT);

        step.checkThePageOpened(TITLE_CONTACT_PAGE);
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Q and A' Button")
    public void verificationQandAButton() {
        step.openPage(URL_MAIN);
        elementName = step.getConstantElement(BTN_QA);
        step.clickElement(elementName, BTN_QA);

        step.checkThePageOpened(TITLE_QA_PAGE);
    }

    @Test
    @Tag("homepage")
    @Disabled("The test off")
    @DisplayName("Verification 'Profile' Button")
    public void verificationProfileButton() {
        step.openPage(URL_LOGIN);
        step.clickElement("CONTINUE_WITH_EMAIL", CONTINUE_WITH_EMAIL);
        step.clickElement("TAB_SIGN_IN", TAB_SIGN_IN);
        step.setValue("EMAIL", EMAIL_INPUT, EMAIL);
        step.setValue("PASSWORD", PASSWORD_INPUT, PASSWORD);
        step.clickElement("BTN_SIGN_IN", BTN_SIGN_IN);

        step.checkTheElementExists(BTN_PROFILE);
    }

    @Test
    @Tag("homepage")
    @Disabled("The test off")
    @DisplayName("Verification 'Login' Button")
    public void verificationLoginButton() {
        closeWebDriver();

        step.openPage(URL_MAIN);
        elementName = step.getConstantElement(BTN_LOGIN);
        step.clickElement(elementName, BTN_LOGIN);

        step.checkTheElementExists(CONTINUE_WITH_EMAIL);
    }

    @Test
    @Tag("homepage")
    @Disabled("The test off")
    @DisplayName("Verification 'Settings' Button")
    public void verificationButton() {
        step.openPage(URL_MAIN);
        step.clickElement("BTN_SETTINGS", BTN_SETTINGS);

        step.checkTheElementExists(BTN_CLOSE);
    }

    @Test
    @Tag("homepage")
    @Disabled("The test off")
    @DisplayName("Verification 'Homepage' Button")
    public void verificationHomeButton() {
        step.openPage(URL_LOGIN);
        elementName = step.getConstantElement(BTN_HOMEPAGE);
        step.clickElement(elementName, BTN_HOMEPAGE);

        step.checkContainsText(TITLE_HOME_PAGE, "Melodic Mind");
    }
}
