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

    public HomePage clickTheStoryButton() {
        header.clickTheStory();

        return this;
    }

    public void checkTheStoryPageOpened() {
        storyPage.titleTheStoryPage.should(appear);
    }

    public HomePage clickLearnButton() {
        header.clickLearn();

        return this;
    }

    public void checkLearnPageOpened() {
        learnPage.titleLearnPage.should(appear);
    }

    public HomePage clickBlogButton() {
        header.clickBlog();

        return this;
    }

    public void checkBlogPageOpened() {
        blogPage.titleBlogPage.should(appear);
    }

    public HomePage clickContactButton() {
        header.clickContact();

        return this;
    }

    public void checkContactPageOpened() {
        contactPage.titleContactPage.should(appear);
    }

    public HomePage clickQandAButton() {
        header.clickQandA();

        return this;
    }

    public void checkQandAPageOpened() {
        qaPage.titleQAPage.should(appear);
    }

    public HomePage clickLoginButton() {
        header.clickLogin();

        return this;
    }

    public void checkLoginOrProfilePageOpened() {
        if (header.getBtnLogin().isDisplayed()) {
            loginPage.continueWithEmail.should(appear);
        } else {
            profilePage.btnDeleteAccount.should(appear);
        }
    }

    public HomePage clickSettingsButton() {
        header.clickSettings();

        return this;
    }

    public void checkSettingsModalWindowOpened() {
        modalWindow.getBtnClose().should(appear);
    }

    public HomePage verifficationButtonsAppForFree() {
        //don't understand what does this button
        useOurAppsForFree.click();

        return this;
    }

}
