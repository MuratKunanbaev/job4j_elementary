package ru.job4j.condition;

public class Max {


    public Max(int a, int b) {

    }

    public Max(int a, int b, int c) {

    }

    public Max(int a, int b, int c, int d) {

    }

    public int max(int  first, int second) {
        return first >= second ? first : second;
    }

    public int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }
}
