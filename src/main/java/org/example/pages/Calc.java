package org.example.pages;

public class Calc {
    public int summ(int a, int b) {
        int result_plus;
        result_plus = a + b;
        System.out.printf("Сумма %d + %d = %d", a, b, result_plus);
        System.out.println();
        return result_plus;
    }
    public int minus(int c, int d) {
        int result_minus;
        result_minus = c - d;
        System.out.printf("Сумма %d - %d = %d", c, d, result_minus);
        System.out.println();
        return result_minus;
    }
}
