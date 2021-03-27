package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void when1year() {
        double amount = 1000;
        double salary = 1200;
        double percent = 1;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when2year() {
        double amount = 100;
        double salary = 120;
        double percent = 50;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when4year() {
        double amount = 100;
        double salary = 70;
        double percent = 50;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }
}