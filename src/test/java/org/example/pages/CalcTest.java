package org.example.pages;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeAll
    public static void DoRaz(){
        System.out.println("Before 1 raz");
    }
    @BeforeEach
    public void DoVsegda(){
        System.out.println("Before mnogo raz");
    }
    @AfterAll
    public static void PosleRaz(){
        System.out.println("After 1 raz");
    }
    @AfterEach
    public void PosleVsegda(){
        System.out.println("After mnogo raz");
    }

    @Test
    @DisplayName("Проверка плюса")
    @Tag("Plus")
    void summ() {
        Calc calc = new Calc();
        int result_test = calc.summ(1,10);
        assertEquals(11, result_test, "Не верная сумма ");
    }

    @Test
    @DisplayName("Проверка минуса")
    @Tag("Minus")
    void minus() {
        Calc calc = new Calc();
        int result_test = calc.minus(1,10);
        assertEquals(-9, result_test, "Не верная сумма ");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1,2,3", "-1,2,1", "0,0,0"})
    @DisplayName("Проверка плюса (параметры)")
    @Tag("Plus")
    void summ2(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result_test = calc.summ(a,b);
        assertEquals(expectedResult, result_test, "Не верная сумма ");
    }

    @ParameterizedTest(name = "#{index} - вычитание {0} и {1}, ожидаем {2}")
    @CsvSource({"4, 2, 2", "-1, 2, -3", "0, 0, 0"})
    @DisplayName("Проверка минуса(параметры)")
    @Tag("Minus")
    void minus2(int c, int d, int expectedResult) {
        Calc calc = new Calc();
        int result_test = calc.minus(c,d);
        assertEquals(expectedResult, result_test, "Не верная сумма ");
    }
}
