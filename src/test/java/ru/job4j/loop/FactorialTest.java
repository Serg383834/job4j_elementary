package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int num = 5;
        int result = Factorial.calc(num);
        int expected = 120;
        Assert.assertEquals(expected, result);
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
       int num = 0;
        int result = Factorial.calc(num);
        int expected = 1;
        Assert.assertEquals(expected, result);

    }
}