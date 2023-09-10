package com.melodicmind.pages;

import com.codeborne.selenide.SelenideElement;
import com.melodicmind.pages.components.HeaderComponent;
import com.melodicmind.pages.components.SettingsModalWindowComponent;
import com.melodicmind.tests.TestBase;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage extends TestBase {

    HeaderComponent header = new HeaderComponent();
    SettingsModalWindowComponent modalWindow = new SettingsModalWindowComponent();
    TheStoryPage storyPage = new TheStoryPage();
    LearnPage learnPage = new LearnPage();
    BlogPage blogPage = new BlogPage();
    ContactPage contactPage = new ContactPage();
    QandAPage qaPage = new QandAPage();
    LoginPage loginPage = new LoginPage();
    ProfilePage profilePage = new ProfilePage();


    SelenideElement
            titleHome = $("h1 span").$(byText("Melodic Mind - ")),
            useOurAppsForFree = $("h1 h1 button");

    public HomePage openHomePage() {
        open("/home");

        return this;
    }

    public HomePage verifficationFaviconButton() {
        header.clickFavicon();

        return this;
    }

    public HomePage verifficationHomeButton() {
        header.clickHome();

        return this;
    }

    public HomePage checkHomePageOpened() {
        titleHome.should(appear);

        return this;
    }

    public HomePage verifficationTheStoryButton() {
        header.clickTheStory();

        return this;
    }

    public HomePage checkTheStoryPageOpened() {
        storyPage.titleTheStoryPage.should(appear);

        return this;
    }

    public HomePage verifficationLearnButton() {
        header.clickLearn();

        return this;
    }

    public HomePage checkLearnPageOpened() {
        learnPage.titleLearnPage.should(appear);

        return this;
    }

    public HomePage verifficationBlogButton() {
        header.clickBlog();

        return this;
    }

    public HomePage checkBlogPageOpened() {
        blogPage.titleBlogPage.should(appear);

        return this;
    }

    public HomePage verifficationContactButton() {
        header.clickContact();

        return this;
    }

    public HomePage checkContactPageOpened() {
        contactPage.titleContactPage.should(appear);

        return this;
    }

    public HomePage verifficationQandAButton() {
        header.clickQandA();

        return this;
    }

    public HomePage checkQandAPageOpened() {
        qaPage.titleQAPage.should(appear);

        return this;
    }

    public HomePage verifficationLoginOrProfileButton() {
        header.clickLoginOrProfile();

        return this;
    }

    public HomePage checkLoginOrProfilePageOpened() {
        if (header.getBtnLogin().isDisplayed()) {
            loginPage.continueWithEmail.should(appear);
        } else {
            profilePage.btnDeleteAccount.should(appear);
        }

        return this;
    }

    public HomePage verifficationSettingsButton() {
        header.clickSettings();

        return this;
    }

    public HomePage checkSettingsModalWindowOpened() {
        modalWindow.getBtnClose().should(appear);

        return this;
    }

    public HomePage verifficationButtonsAppForFree() {
        //don't understand what does this button
        useOurAppsForFree.click();

        return this;
    }

}
