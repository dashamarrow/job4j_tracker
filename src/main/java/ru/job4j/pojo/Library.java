package ru.job4j.pojo;

import java.util.Objects;

public class Library {

    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 1214);
        Book cleanArchitecture = new Book("Clean Architecture", 431);
        Book cleanAgile = new Book("Clean Agile", 288);
        Book theCleanCoder = new Book("The Clean Coder", 241);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = cleanArchitecture;
        books[2] = cleanAgile;
        books[3] = theCleanCoder;
        for (int i = 0; i < books.length; i++) {
            Book reading = books[i];
            System.out.println(reading.getName() + " - " + reading.getPageCount());
        }
        System.out.println("After replacement:");
        Book[] temp = {books[3]};
        books[3] = books[0];
        books[0] = temp[0];
        for (int i = 0; i < books.length; i++) {
            Book reading = books[i];
            System.out.println(reading.getName() + " - " + reading.getPageCount());
        }
        System.out.println("Shown only Clean Code");
        for (int i = 0; i < books.length; i++) {
            Book reading = books[i];
            if (Objects.equals(reading.getName(), "Clean Code")) {
                System.out.println(reading.getName() + " - " + reading.getPageCount());
            }
        }
    }
}
