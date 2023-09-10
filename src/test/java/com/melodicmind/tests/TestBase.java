package com.melodicmind.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.*;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://melodic-mind.com/";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 5000;
        Configuration.pageLoadStrategy = "eager";

    }

    public static void clearCookie() {
        clearBrowserCookies();
        clearBrowserLocalStorage();

    }

    @AfterEach
    void afterEach() {
        //  clearCookie();
        open("/");
        //  closeWebDriver();

    }

    public void successCookieShort() {
        $("button.cookie__floating__buttons__button--accept").click();
    }

    public void successCookieLong() {
        $("button.cookie__floating__buttons__button--decline").click();
        $("div.text-center.q-pb-md button").click();
    }


}
