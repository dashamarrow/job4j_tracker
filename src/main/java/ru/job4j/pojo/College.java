package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan Ivanovich");
        student.setGroup("5");
        student.setStart(new Date(2021, 10, 10));
        System.out.println("Name: " + student.getFullName() + ", group: " + student.getGroup() + ", start date: " + student.getStart());
    }
}
