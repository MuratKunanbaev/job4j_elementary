package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenTwoNumbers() {
        Max nums = new Max(1, 2);
        int expected = 2;
        int result = nums.max(1, 2);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFourNumbers() {
        Max nums = new Max(2, 5, 4, 10);
        int expected = 10;
        int result = nums.max(2, 5, 4, 10);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTreeNumbers() {
        Max nums = new Max(53, 16, 3);
        int expected = 53;
        int result = nums.max(53, 16, 3);
        Assert.assertEquals(expected, result);
    }
}