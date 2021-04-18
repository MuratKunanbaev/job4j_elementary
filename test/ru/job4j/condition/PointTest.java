package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        int expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when50to100then5() {
        Point a = new Point(5, 0);
        Point b = new Point(10, 0);
        int expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when55to105then5() {
        Point a = new Point(5, 5);
        Point b = new Point(10, 5);
        int expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1010to105then5() {
        Point a = new Point(10, 10);
        Point b = new Point(10, 5);
        int expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}