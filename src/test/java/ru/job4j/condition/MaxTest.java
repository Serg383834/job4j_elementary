package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To1Then3() {
        int result = Max.max(3, 1);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenNoMax() {
        int result = Max.max(2, 2);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1or2or3Then3() {
        int result = Max.max(1, 2, 3);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1or2or3or4Then4() {

        int result = Max.max(1, 2, 3, 4);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}