package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class PointTest {

    @Test
    public void when001To111Then1dot414() {
        Point a = new Point(0, 0, 1);
        Point b = new Point(1, 1, 1);
        double rsl = a.distance3d(b);
        double expected = 1.414;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when12111To13158Then8dot124() {
        Point a = new Point(12, 11, 1);
        Point b = new Point(13, 15, 8);
        double rsl = a.distance3d(b);
        double expected = 8.124;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when0100To0030Then31dot623() {
        Point a = new Point(0, 10, 0);
        Point b = new Point(0, 0, 30);
        double rsl = a.distance3d(b);
        double expected = 31.623;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }
}