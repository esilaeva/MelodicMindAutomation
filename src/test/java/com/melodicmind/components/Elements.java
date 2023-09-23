package com.melodicmind.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Elements {
    public SelenideElement
            btnHomepage = $("a[href='/'"),
            btnTheStory = $("a[href='/the-story']"),
            btnLearn = $("a[href='/learn']"),
            btnBlog = $("a[href='/blog']"),
            btnContact = $("a[href='/contact']"),
            btnQa = $("a[href='/qa']"),
            btnLogin = $("a[href='/login']"),
            btnProfile = $("a[href='/account']"),
            btnSettings = $("header div div div div button"),
            btnClose = $("button[aria-label='close']"),
            btnSignIn = $("form.login-form").lastChild(),
            btnSignUp = $("form.login-form button").$(byText("Sign up")),
            btnCookiesAccept = $("button.cookie__floating__buttons__button--accept"),
            btnCookiesDecline = $("button.cookie__floating__buttons__button--decline"),
            btnAccept = $("div.app-btn__content").$(byText("Accept"));

    public static final SelenideElement
            continueWithEmail = $("div.btn-container").lastChild(),
            tabSignIn = $("div.email-auth-container").$(byText("Sign in")),
            inputEmail = $("form.q-form.login-form input[aria-label='Email']"),
            inputPassword = $("form.q-form.login-form input[aria-label='Password'");

    public SelenideElement
            titleHomePage = $("h1.title span"),
            titleTheStoryPage = $("h1 span").$(byText("The Story")),
            titleLearnPage = $("h1 span").$(byText("Learn")),
            titleBlogPage = $("h1 span").$(byText("Melodic Mind Blog")),
            titleContactPage = $("h1 span").$(byText("Contact Us")),
            titleQaPage = $("h1 span").$(byText("Question and answers"));

    public SelenideElement
            errorSignInWrongEmail = $(byText("Error signing in, please try again.")),
            errorSignInWrongPassword = $("#q-notify").$(byText("Wrong password")),
            errorSignInUnregisteredUser = $("#q-notify").$(byText("No user found with this email")),
            errorSignInInvalidEmail = $(byText("Invalid email address"));

    public String
            urlMain = "https://melodic-mind.com/",
            urlLogin = "https://melodic-mind.com/login",
            email = "ilana.qa@proton.me",
            password = "Ii12345$",
            emptyString = "";
}
