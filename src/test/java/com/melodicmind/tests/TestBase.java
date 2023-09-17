package com.melodicmind.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import components.Attach;
import components.Elements;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Selenide.*;

public class TestBase extends Elements {

    public static final String
            URL_MAIN = "https://melodic-mind.com/",
            URL_LOGIN = "https://melodic-mind.com/login";

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = System.getProperty(URL_MAIN);
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        //Configuration.pageLoadStrategy = "eager";

        Configuration.remote = System.getProperty("wbhost", "https://user1:1234@selenoid.autotests.cloud/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;
    }

    public static void clearCookies() {
        clearBrowserCookies();
        clearBrowserLocalStorage();
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

        closeWebDriver();
    }

    public void successCookieShort() {
        if (BTN_COOKIES_ACCEPT.isDisplayed())
            BTN_COOKIES_ACCEPT.click();
    }

    public void successCookieLong() {
        if (BTN_COOKIES_ACCEPT.isDisplayed()) {
            BTN_COOKIES_DECLINE.click();
            BTN_ACCEPT.click();
        }
    }
}
