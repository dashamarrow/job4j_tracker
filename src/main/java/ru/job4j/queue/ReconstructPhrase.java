package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder rsl = new StringBuilder();
        for (int i = 0; 0 < evenElements.size(); i++) {
            char element = evenElements.pollFirst();
            if (i % 2 == 0) {
                rsl.append(element);
            }
        }
        return rsl.toString();
    }

    private String getDescendingElements() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; 0 < descendingElements.size(); i++) {
            result.append(descendingElements.pollLast());
        }
        return result.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}