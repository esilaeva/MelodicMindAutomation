package com.melodicmind.pages;

import com.codeborne.selenide.SelenideElement;
import com.melodicmind.pages.components.HeaderComponent;
import io.qameta.allure.Step;
import lombok.Getter;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Getter
public class HomePage {

    HeaderComponent header = new HeaderComponent();

    SelenideElement
            titleHomePage = $("h1.title"),
            btnAcceptCookies = $("button.cookie__floating__buttons__button--accept");

    String url = "https://melodic-mind.com";

    @Step("Open {url}")
    public HomePage openPage(String url) {
        open(url);

        return this;
    }

    @Step("Click on the {elementName}")
    public HomePage clickElement(String elementName, SelenideElement element) {
        element.click();

        return this;
    }

    @Step("Verification: {elementName} page was opened")
    public void checkThePageOpened(String elementName, SelenideElement element) {
        element.should(appear);
    }

    @Step("Verification: page was opened")
    public void checkContainsText(SelenideElement element, String value) {
        element.shouldHave(text(value));
    }

    @Step("Verification: {elementName} disappeared")
    public HomePage checkTheElementDisappear(String elementName, SelenideElement element) {
        element.should(disappear);

        return this;
    }

    @Step("Set value into {elementName}")
    public HomePage setValue(String elementName, SelenideElement element, String value) {
        element.setValue(value);

        return this;
    }

    @Step("Verification: {elementName} appeared")
    public void checkTheElementAppear(String elementName, SelenideElement element) {
        element.should(appear);
    }
}
