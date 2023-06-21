package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Поехали");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Кол-во пассажиров: " + passengers);
    }

    @Override
    public int refuel(int volume) {
        int cost = 12;
        return volume * cost;
    }
}
