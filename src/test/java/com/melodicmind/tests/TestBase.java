package com.melodicmind.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.*;

public class TestBase {

    public static final String URL = "https://melodic-mind.com/";

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = URL;
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
        if ($("button.cookie__floating__buttons__button--accept").isDisplayed())
            if($("button.cookie__floating__buttons__button--accept").isDisplayed())
                $("button.cookie__floating__buttons__button--accept").click();
    }

    public void successCookieLong() {
        if ($("button.cookie__floating__buttons__button--accept").isDisplayed()) {
            $("button.cookie__floating__buttons__button--decline").click();
            $("div.text-center.q-pb-md button").click();
        }
    }
}
