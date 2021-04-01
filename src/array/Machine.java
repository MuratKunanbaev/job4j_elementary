package array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        int[] sortCoins = Max.findMax(coins);

        for (int i = 0; i < sortCoins.length; i++) {
            while (sortCoins[i] <= change) {
                change -= sortCoins[i];
                rsl[size] = sortCoins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
