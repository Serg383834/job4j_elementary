package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void exist() {
            boolean result = Triangle.exist(2.0, 2.0, 2.0);
            Assert.assertTrue(result);
    }

    @Test
    public void notExist() {
        boolean result = Triangle.exist(8.0, 2.0, 2.0);
        Assert.assertFalse(result);
    }

}