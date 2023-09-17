package components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.lang.reflect.Field;
import java.util.Arrays;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    public String getConstantName(SelenideElement element) {
        return Arrays.stream(Elements.class.getDeclaredFields())
                .filter(field -> {
                    try {
                        return field.get(null).equals(element);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                })
                .map(Field::getName)
                .findAny().orElse("");
    }

    @Step("Open {url}")
    public void openPage(String url) {
        open(url);
    }

    @Step("Click on the {element}")
    public void clickElement(SelenideElement element) {

        element.click();
    }

    @Step("Checking that {element} has been opened")
    public void checkThePageOpened(SelenideElement element) {
        element.should(appear);
    }

    @Step("Checking that {element} exists")
    public void checkTheElementExists(SelenideElement element) {
        element.should(appear);
    }

    @Step("Set value into {element}")
    public void setValue(SelenideElement element, String value) {
        element.setValue(value);
    }

    @Step("Checking contains text")
    public void checkContainsText(SelenideElement element, String value) {
        element.shouldHave(text(value));
    }
}
