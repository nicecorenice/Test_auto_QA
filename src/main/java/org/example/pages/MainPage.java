package org.example.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

/**
 * page_url = <a href="https://www.jetbrains.com/">...</a>
 */
public class MainPage {
    public static void main(String[] args) {
        Calc calculator = new Calc();
        calculator.summ(1, 10);
        calculator.minus(5, 2);
    }
}