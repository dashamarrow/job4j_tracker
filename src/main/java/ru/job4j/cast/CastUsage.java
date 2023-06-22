package ru.job4j.cast;

public class CastUsage {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle plane = new Plane();
        Vehicle[] vehicles = new Vehicle[]{bus, train, plane};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}
