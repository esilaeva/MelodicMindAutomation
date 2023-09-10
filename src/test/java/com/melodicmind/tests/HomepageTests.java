package com.melodicmind.tests;

import com.melodicmind.pages.HomePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class HomepageTests extends TestBase {

    HomePage home = new HomePage();

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'The Story' Button")
    public void verificationTheStoryButtons() {
        home
                .openHomePage()
                .clickTheStoryButton()
                .checkTheStoryPageOpened();
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Learn' Button")
    public void verificationLearnButtons() {
        home
                .openHomePage()
                .clickLearnButton()
                .checkLearnPageOpened();
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Blog' Button")
    public void verificationBlogButtons() {
        home
                .openHomePage()
                .clickBlogButton()
                .checkBlogPageOpened();
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Contact' Button")
    public void verificationContactButtons() {
        home
                .openHomePage()
                .clickContactButton()
                .checkContactPageOpened();
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Q and A' Button")
    public void verificationQandAButtons() {
        home
                .openHomePage()
                .clickQandAButton()
                .checkQandAPageOpened();
    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Login or Profile' Button")
    public void verificationLoginButtons() {
        home
                .openHomePage()
                .clickLoginButton()
                .checkLoginOrProfilePageOpened();
    }
//TODO
//    @Test
//    @Tag("homepage")
//    @DisplayName("Verification 'Profile' Button")
//    public void verificationProfileButtons() {
//        home
//                .openHomePage()
//                .openLoginPage()
//                .continueWithEmail()
//                .chooseTabSignIn()
//                .setEmail("ilana.qa@proton.me")
//                .setPassword("Ii12345$")
//                .clickSighIn();
//                .clickProfileButton()
//                .checkLoginOrProfilePageOpened();
//    }

    @Test
    @Tag("homepage")
    @DisplayName("Verification 'Settings' Button")
    public void verificationButtons() {
        home
                .openHomePage()
                .clickSettingsButton()
                .checkSettingsModalWindowOpened();
    }
}
