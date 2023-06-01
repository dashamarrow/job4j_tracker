package ru.job4j.oop;

public class Max {
    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        return max(
                a,
                max(b, c)
        );
    }

    public int max(int a, int b, int c, int d) {

        return max(
                a,
                max(b, c, d)
        );
    }

    public static void main(String[] args) {
        Max max = new Max();
        int rsl = max.max(33, 3, 5);
        System.out.println(rsl);
    }
}
