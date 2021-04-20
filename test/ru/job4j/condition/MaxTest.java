package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenTwoNumbers() {
        int expected = 2;
        int result = Max.max(1, 2);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFourNumbers() {
        int expected = 10;
        int result = Max.max(2, 5, 4, 10);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTreeNumbers() {
        int expected = 53;
        int result = Max.max(53, 16, 3);
        Assert.assertEquals(expected, result);
    }
}