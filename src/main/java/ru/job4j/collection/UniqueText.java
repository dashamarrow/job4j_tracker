package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String temp : origin) {
            check.add(temp);
        }
        for (String tempo : text) {
            if (!check.contains(tempo)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}