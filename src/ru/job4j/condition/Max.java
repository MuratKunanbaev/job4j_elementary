package ru.job4j.condition;

public class Max {
    private int first;
    private int second;
    private int third;
    private int four;

    public Max(int a, int b) {
        this.first = a;
        this.second = b;
    }

    public Max(int a, int b, int c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    public Max(int a, int b, int c, int d) {
        this.first = a;
        this.second = b;
        this.third = c;
        this.four = d;
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
