package com.melodicmind.tests;

import com.melodicmind.pages.*;
import com.melodicmind.pages.components.HeaderComponent;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class HomepageTests extends TestBase {

    HomePage homePage = new HomePage();
    TheStoryPage theStoryPage = new TheStoryPage();
    LearnPage learnPage = new LearnPage();
    BlogPage blogPage = new BlogPage();
    ContactPage contactPage = new ContactPage();
    QandAPage qAndAPage = new QandAPage();
    LoginPage loginPage = new LoginPage();

    HeaderComponent headerComponent = new HeaderComponent();
    String urlLogin = "https://melodic-mind.com/login";

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'The Story' button")
    @Feature("Homepage buttons test")
    public void verificateTheStoryButton() {
        homePage
                .openPage(urlMain)
                .clickElement("button 'The Story'", headerComponent.getBtnTheStory())

                .checkThePageOpened("The Story", theStoryPage.getTitleTheStoryPage());
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Learn' button")
    @Feature("Homepage buttons test")
    public void verificateLearnButton() {
        homePage
                .openPage(urlMain)
                .clickElement("button 'Learn'", headerComponent.getBtnLearn())

                .checkThePageOpened("Learn", learnPage.getTitleLearnPage());
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Blog' button")
    @Feature("Homepage buttons test")
    public void verificateBlogButton() {
        homePage
                .openPage(urlMain)
                .clickElement("button 'Blog'", headerComponent.getBtnBlog())

                .checkThePageOpened("Blog", blogPage.getTitleBlogPage());
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Contact' button")
    @Feature("Homepage buttons test")
    public void verificateContactButton() {
        homePage
                .openPage(urlMain)
                .clickElement("button 'Contact'", headerComponent.getBtnContact())

                .checkThePageOpened("Contact", contactPage.getTitleContactPage());
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Q and A' button")
    @Feature("Homepage buttons test")
    public void verificateQandAButton() {
        homePage
                .openPage(urlMain)
                .clickElement("button 'Q and A'", headerComponent.getBtnQa())

                .checkThePageOpened("Q and A", qAndAPage.getTitleQAPage());
    }

    @Test
    @Tag("homepage")
    @Disabled("The test off")
    @DisplayName("Verification 'Profile' button")
    @Feature("Homepage buttons test")
    public void verificateProfileButton() {
        homePage
                .openPage(urlLogin)
                .clickElement("button 'Continue With Email'", loginPage.getBtnContinueWithEmail())
                .clickElement("tab 'Sign in'", loginPage.getTabSignIn())
                .checkTheElementDisappear("button 'Sign Up'", loginPage.getBtnSignUp())
                .setValue("input email", loginPage.getInputEmail(), "ilana.qa@proton.me")
                .setValue("input password", loginPage.getInputPassword(), "Ii12345$")
                .clickElement("button 'Sign in'", loginPage.getBtnSignIn())

                .checkTheElementAppear("button Profile", headerComponent.getBtnProfile());
    }

    @Test
    @Tag("homepage")
    @Disabled("The test off")
    @DisplayName("Verification 'Login' button")
    @Feature("Homepage buttons test")
    public void verificateLoginButton() {
        homePage
                .openPage(urlMain)
                .clickElement("button 'Login'", headerComponent.getBtnLogin())

                .checkTheElementAppear("button 'Continue with Email'", loginPage.getBtnContinueWithEmail());
    }

    @Test
    @Tag("homepage")
    @Disabled("The test off")
    @DisplayName("Verification 'Home' button")
    @Feature("Homepage buttons test")
    public void verificateHomeButton() {
        homePage.openPage(urlLogin)
                .clickElement("button 'Home'", headerComponent.getBtnHome())

                .checkContainsText(homePage.getTitleHomePage(), "Melodic Mind");
    }

    @Test
    @Tag("homepage")
    @Disabled("The test off")
    @DisplayName("Verification 'Favicon' button")
    @Feature("Homepage buttons test")
    public void verificateFaviconButton() {
        homePage.openPage(urlLogin)
                .clickElement("button 'Favicon'", headerComponent.getBtnFavicon())

                .checkContainsText(homePage.getTitleHomePage(), "Melodic Mind");
    }
}
