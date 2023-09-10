package com.melodicmind.pages;

import com.codeborne.selenide.SelenideElement;
import com.melodicmind.tests.TestBase;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LearnPage extends TestBase {

    SelenideElement
            home = $("a[href='/'"),
            theStory = $("a[href='/the-story']"),
            learn = $("a[href='/learn']"),
            blog = $("a[href='/blog']"),
            contact = $("a[href='/contact']"),
            qa = $("a[href='/qa']"),
            login = $("a[href='/login']"),
            profile = $("a[href='/account']"),
            settings = $("header div div div div button"),
            continueWithGoogle = $("div.btn-container"),
            titleLearnPage = $("h1 span").$(byText("Learn"));
}
