package com.melodicmind.pages.components;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import lombok.Setter;

import static com.codeborne.selenide.Selenide.$;

@Setter
@Getter
public class HeaderComponent {

    public SelenideElement
            btnFavicon = $("a[href='/'"),
            btnHome = $("a[href='/'"),
            btnTheStory = $("a[href='/the-story']"),
            btnLearn = $("a[href='/learn']"),
            btnBlog = $("a[href='/blog']"),
            btnContact = $("a[href='/contact']"),
            btnQa = $("a[href='/qa']"),
            btnLogin = $("a[href='/login']"),
            btnProfile = $("a[href='/account']"),
            btnSettings = $("header div div div div button");
}
