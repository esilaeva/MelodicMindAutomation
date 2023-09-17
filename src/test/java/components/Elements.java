package components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Elements {

    public static final SelenideElement
            BTN_HOMEPAGE = $("a[href='/'"),
            BTN_THE_STORY = $("a[href='/the-story']"),
            BTN_LEARN = $("a[href='/learn']"),
            BTN_BLOG = $("a[href='/blog']"),
            BTN_CONTACT = $("a[href='/contact']"),
            BTN_QA = $("a[href='/qa']"),
            BTN_LOGIN = $("a[href='/login']"),
            BTN_PROFILE = $("a[href='/account']"),
            BTN_SETTINGS = $("header div div div div button"),
            BTN_CLOSE = $("button[aria-label='close']"),
            BTN_DELETE_ACCOUNT = $("href='/delete-user'"),
            BTN_SIGN_IN = $("form.login-form").lastChild(),
            BTN_COOKIES_ACCEPT = $("button.cookie__floating__buttons__button--accept"),
            BTN_COOKIES_DECLINE = $("button.cookie__floating__buttons__button--decline"),
            BTN_ACCEPT = $("div.app-btn__content").$(byText("Accept")),
            BTN_USE_OUR_APPS_FOR_FREE = $("h1 h1 button");

    public static final SelenideElement
            CONTINUE_WITH_GOOGLE = $("div.btn-container"),
            CONTINUE_WITH_EMAIL = $("div.btn-container").lastChild(),
            TAB_SIGN_IN = $("div.email-auth-container").$(byText("Sign in")),
            EMAIL_INPUT = $("form.q-form.login-form input[aria-label='Email']"),
            PASSWORD_INPUT = $("form.q-form.login-form input[aria-label='Password'");

    public static final SelenideElement
            TITLE_HOME_PAGE = $("h1.title span"),
            TITLE_THE_STORY_PAGE = $("h1 span").$(byText("The Story")),
            TITLE_LEARN_PAGE = $("h1 span").$(byText("Learn")),
            TITLE_BLOG_PAGE = $("h1 span").$(byText("Melodic Mind Blog")),
            TITLE_CONTACT_PAGE = $("h1 span").$(byText("Contact Us")),
            TITLE_QA_PAGE = $("h1 span").$(byText("Question and answers"));

    public static final SelenideElement
            ERROR_SIGN_IN_WRONG_EMAIL = $(byText("Error signing in, please try again.")),
            ERROR_SIGN_IN_WRONG_PASSWORD = $("#q-notify").$(byText("Wrong password")),
            ERROR_SIGN_IN_UNREGISTERED_USER = $("#q-notify").$(byText("No user found with this email")),
            ERROR_SIGN_IN_INVALID_EMAIL = $(byText("Invalid email address"));

    public static final String
            EMAIL = "ilana.qa@proton.me",
            PASSWORD = "Ii12345$";

}
