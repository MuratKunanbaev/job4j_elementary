package ru.job4j.loop;

public class Factorial {
    public static int calc(int i) {
        int result = 1;
        for (int index = 1; index <= i; index++) {
            result *= index;
        }
        return result;
    }

}
