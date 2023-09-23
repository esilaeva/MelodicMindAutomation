package com.melodicmind.tests;

import com.melodicmind.components.WebSteps;
import io.qameta.allure.Feature;
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
    @Feature("Homepage buttons test")
    public void verificationTheStoryButtons() {
        step.openPage(urlMain);
        elementName = step.getConstantElement(btnTheStory);
        step.clickElement(elementName, btnTheStory);

        step.checkThePageOpened(titleTheStoryPage);
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Learn' Button")
    @Feature("Homepage buttons test")
    public void verificationLearnButton() {
        step.openPage(urlMain);
        elementName = step.getConstantElement(btnLearn);
        step.clickElement(elementName, btnLearn);

        step.checkThePageOpened(titleLearnPage);
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Blog' Button")
    @Feature("Homepage buttons test")
    public void verificationBlogButton() {
        step.openPage(urlMain);
        elementName = step.getConstantElement(btnBlog);
        step.clickElement(elementName, btnBlog);

        step.checkThePageOpened(titleBlogPage);
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Contact' Button")
    @Feature("Homepage buttons test")
    public void verificationContactButton() {
        step.openPage(urlMain);
        elementName = step.getConstantElement(btnContact);
        step.clickElement(elementName, btnContact);

        step.checkThePageOpened(titleContactPage);
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Q and A' Button")
    @Feature("Homepage buttons test")
    public void verificationQandAButton() {
        step.openPage(urlMain);
        elementName = step.getConstantElement(btnQa);
        step.clickElement(elementName, btnQa);

        step.checkThePageOpened(titleQaPage);
    }

    @Test
    @Tag("homepage")
    @Disabled("The test off")
    @DisplayName("Verification 'Profile' Button")
    @Feature("Homepage buttons test")
    public void verificationProfileButton() {
        step.openPage(urlLogin);
        step.clickElement("CONTINUE_WITH_EMAIL", continueWithEmail);
        step.clickElement("TAB_SIGN_IN", tabSignIn);
        step.setValue("EMAIL", inputEmail, email);
        step.setValue("PASSWORD", inputPassword, password);
        step.clickElement("BTN_SIGN_IN", btnSignIn);

        step.checkTheElementExists(btnProfile);
    }

    @Test
    @Tag("homepage")
    @Disabled("The test off")
    @DisplayName("Verification 'Login' Button")
    @Feature("Homepage buttons test")
    public void verificationLoginButton() {
        closeWebDriver();

        step.openPage(urlMain);
        elementName = step.getConstantElement(btnLogin);
        step.clickElement(elementName, btnLogin);

        step.checkTheElementExists(continueWithEmail);
    }

    @Test
    @Tag("homepage")
    @Disabled("The test off")
    @DisplayName("Verification 'Settings' Button")
    @Feature("Homepage buttons test")
    public void verificationButton() {
        step.openPage(urlMain);
        step.clickElement("BTN_SETTINGS", btnSettings);

        step.checkTheElementExists(btnClose);
    }

    @Test
    @Tag("homepage")
    @Disabled("The test off")
    @DisplayName("Verification 'Homepage' Button")
    @Feature("Homepage buttons test")
    public void verificationHomeButton() {
        step.openPage(urlLogin);
        elementName = step.getConstantElement(btnHomepage);
        step.clickElement(elementName, btnHomepage);

        step.checkContainsText(titleHomePage, "Melodic Mind");
    }
}
