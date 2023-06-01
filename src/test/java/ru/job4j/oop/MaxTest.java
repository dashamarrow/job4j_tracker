package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax12To10To11Then12() {
        Max max = new Max();
        int rsl = max.max(12, 10, 11);
        int expected = 12;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenMax12To10To11To100Then100() {
        Max max = new Max();
        int rsl = max.max(12, 10, 11, 100);
        int expected = 100;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2To2To2Then2() {
        Max max = new Max();
        int rsl = max.max(2, 2, 2, 2);
        int expected = 2;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenMax22To5Then22() {
        Max max = new Max();
        int rsl = max.max(22, 5);
        int expected = 22;
        assertThat(rsl).isEqualTo(expected);
    }
}

