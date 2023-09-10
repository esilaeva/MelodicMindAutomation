package com.melodicmind.tests;

import com.melodicmind.pages.HomePage;
import org.junit.jupiter.api.Test;

public class HomeTests extends TestBase {

    HomePage home = new HomePage();

    @Test
    public void verificationButtons() {
        home
                .openHomePage()
                .verifficationTheStoryButton()
                .checkTheStoryPageOpened()
                .verifficationLearnButton()
                .checkLearnPageOpened()
                .verifficationBlogButton()
                .checkBlogPageOpened()
                .verifficationContactButton()
                .checkContactPageOpened()
                .verifficationQandAButton()
                .checkQandAPageOpened()
                .verifficationLoginOrProfileButton()
                .checkLoginOrProfilePageOpened()
                .verifficationSettingsButton()
                .checkSettingsModalWindowOpened();
    }


}
