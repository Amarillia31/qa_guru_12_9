package com.elena;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class homework {
//    Task1
//    $("h1").$("div"), сначала будет первый искаться h1 и в нём будет искаться div.
//    $("h1 div") - h1 и div будут искаться вместе, найдётся первый h1 у которого будет div.


    @Test
    @DisplayName("Task2 Find Soft Assertions")
    void SelenideTask2() {
        open("https://github.com/selenide/selenide");
        $("h2").shouldHave(text("selenide / selenide"));
        $("ul.UnderlineNav-body").$("#wiki-tab").click();
        $("ul.m-0.p-0.list-style-none").$("li.Box-row.wiki-more-pages-link").$("button.f6").click();
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));
    }

    @Test
    @DisplayName("Task3 Drag and Drop")
    void DragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").shouldHave(text("A"));
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
        sleep(5000);
    }
}
