package com.melodicmind.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class HeaderComponent {

    SelenideElement
            btnFavicon = $("a[href='/'"),
            btnHome = $("a[href='/'"),
            btnTheStory = $("a[href='/the-story']"),
            btnLearn = $("a[href='/learn']"),
            btnBlog = $("a[href='/blog']"),
            btnContact = $("a[href='/contact']"),
            btnQA = $("a[href='/qa']"),
            btnLogin = $("a[href='/login']"),
            btnProfile = $("a[href='/account']"),
            btnSettings = $("header div div div div button");

    public SelenideElement getBtnFavicon() {
        return btnFavicon;
    }

    public SelenideElement getBtnHome() {
        return btnHome;
    }

    public SelenideElement getBtnTheStory() {
        return btnTheStory;
    }

    public SelenideElement getBtnLearn() {
        return btnLearn;
    }

    public SelenideElement getBtnBlog() {
        return btnBlog;
    }

    public SelenideElement getBtnContact() {
        return btnContact;
    }

    public SelenideElement getBtnQA() {
        return btnQA;
    }

    public SelenideElement getBtnLogin() {
        return btnLogin;
    }

    public SelenideElement getBtnProfile() {
        return btnProfile;
    }

    public SelenideElement getBtnSettings() {
        return btnSettings;
    }

    public void clickFavicon() {
        btnFavicon.click();
    }

    public void clickHome() {
        btnHome.click();
    }

    public void clickTheStory() {
        btnTheStory.click();
    }

    public void clickLearn() {
        btnLearn.click();
    }

    public void clickBlog() {
        btnBlog.click();
    }

    public void clickContact() {
        btnContact.click();
    }

    public void clickQandA() {
        btnQA.click();
    }

    public void clickLoginOrProfile() {
        if (btnLogin.isDisplayed()) {
            btnLogin.click();
        } else {
            btnProfile.click();
        }
    }

    public void clickLogin() {
        btnLogin.click();
    }

    public void clickSettings() {
        btnSettings.click();
    }

    public void sleepSpec() {
        sleep(2000);
    }

}
