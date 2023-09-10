package com.melodicmind.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SettingsModalWindowComponent {

    SelenideElement btnClose = $("button[aria-label='close']");

    public SelenideElement getBtnClose() {
        return btnClose;
    }
}
