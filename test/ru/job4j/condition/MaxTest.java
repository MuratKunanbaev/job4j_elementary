package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax10To5Then10() {
        int left = 10;
        int right = 5;
        int expected = 10;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenMax31To53Then53() {
        int left = 31;
        int right = 53;
        int expected = 53;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }
}