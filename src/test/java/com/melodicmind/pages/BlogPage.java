package com.melodicmind.pages;

import com.codeborne.selenide.SelenideElement;
import com.melodicmind.tests.TestBase;
import lombok.Getter;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@Getter
public class BlogPage extends TestBase {

    SelenideElement titleBlogPage = $("h1 span").$(byText("Melodic Mind Blog"));
}
