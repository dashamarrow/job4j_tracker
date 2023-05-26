package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        String choice = switch (position) {
            case 1 -> "Пусть бегут неуклюже";
            case 2 -> "Спокойной ночи";
            default -> "Песня не найдена";
        };
        System.out.println(choice);
    }

    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        song.music(1);
        song.music(2);
        song.music(3);
    }
}
