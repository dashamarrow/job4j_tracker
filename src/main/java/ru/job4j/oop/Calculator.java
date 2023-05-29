package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return Calculator.sum(y) + multiply(y) + Calculator.minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int sum = sum(10);
        System.out.println(sum);
        Calculator calculator = new Calculator();
        int multiply = calculator.multiply(5);
        System.out.println(multiply);
        int minus = minus(10);
        System.out.println(minus);
        int divide = calculator.divide(5);
        System.out.println(divide);
        int result = calculator.sumAllOperation(5);
        System.out.println(result);

    }
}
