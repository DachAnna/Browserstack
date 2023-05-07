package com.annadach.tests;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.containExactTextsCaseSensitive;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class WikiTests extends TestBase{

    @Test
    void searchTest() {
            back();

            step("Type search", () -> {
                $(MobileBy.AccessibilityId("Search Wikipedia")).click();
                $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).val("BrowserStack");
            });
            step("Verify content found", () ->
                    $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                            .shouldHave(sizeGreaterThan(0)));
        }

    @Test
    void savedTest() {
        back();

        step("Type saved", () -> {
            $(MobileBy.AccessibilityId("Saved")).click();
        });
        step("Open add list", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/menu_overflow_button")).click();
            $(MobileBy.id("org.wikipedia.alpha:id/reading_lists_overflow_create_new_list")).click();
        });
        step("Verify popup", () -> {
            $$(MobileBy.id("org.wikipedia.alpha:id/text_input"))
                    .should(containExactTextsCaseSensitive("My reading list"));
            $$(MobileBy.id("org.wikipedia.alpha:id/secondary_text_input"))
                    .should(containExactTextsCaseSensitive("Description (optional)"));
        });
    }

    @Test
    void editsTest() {
        back();

        step("Type edits", () -> {
            $(MobileBy.AccessibilityId("Edits")).click();
        });
        step("Verify page content", () -> {
            $$(MobileBy.id("org.wikipedia.alpha:id/messageTitleView"))
                    .should(containExactTextsCaseSensitive("Did you know that everyone can edit Wikipedia?"));
        });
    }

    @Test
    void moreTest() {
        back();

        step("Type more", () -> {
            $(MobileBy.AccessibilityId("More")).click();
        });
        step("Verify popup content", () -> {
            $$(MobileBy.id("org.wikipedia.alpha:id/main_drawer_login_button"))
                    .should(containExactTextsCaseSensitive("LOG IN / JOIN WIKIPEDIA"));
            $$(MobileBy.id("org.wikipedia.alpha:id/main_drawer_login_button"));
        });
    }
}
