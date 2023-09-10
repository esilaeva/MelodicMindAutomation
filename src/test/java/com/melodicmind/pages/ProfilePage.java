package com.melodicmind.pages;

import com.codeborne.selenide.SelenideElement;
import com.melodicmind.tests.TestBase;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage extends TestBase {

    SelenideElement
            continueWithGoogle = $("div.btn-container"),
            btnDeleteAccount = $("href='/delete-user'");
}
