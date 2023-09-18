package com.melodicmind.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.lang.reflect.Field;
import java.util.Arrays;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps extends Elements {

    @Step("Open {url}")
    public void openPage(String url) {
        open(url);
    }

    @Step("Click on the {elementName}")
    public void clickElement(String elementName, SelenideElement element) {
        element.click();
    }

    @Step("Verification: the page has been opened")
    public void checkThePageOpened(SelenideElement element) {
        element.should(appear);
    }

    @Step("Verification: the element exists")
    public void checkTheElementExists(SelenideElement element) {
        element.should(appear);
    }

    @Step("Set value into {elementName}")
    public void setValue(String elementName, SelenideElement element, String value) {
        element.setValue(value);
    }

    @Step("Verification: page contains text")
    public void checkContainsText(SelenideElement element, String value) {
        element.shouldHave(text(value));
    }

    @Step("Find element name")
    public String getConstantElement(SelenideElement element) {
        return Arrays.stream(Elements.class.getDeclaredFields())
                .filter(f -> {
                    try {
                        return f.get(Elements.class).equals(element);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                })
                .map(Field::getName)
                .findAny().orElse(EMPTY_STRING);
    }
}
