package com.melodicmind.pages;

import com.codeborne.selenide.SelenideElement;
import com.melodicmind.tests.TestBase;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TheStoryPage extends TestBase {

    SelenideElement titleTheStoryPage = $("h1 span").$(byText("The Story"));


}
