package array;

import java.util.Arrays;

public class NumberToArray {
    public static int[] resolve(int number) {
        int size = 0;
        int[] numbers = new int[number];
        if (number == 1) {
            size = number + 1;
            numbers[0] = number;
        } else {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = number % 10;
                number = number / 10;
                size++;
                if (numbers[i] < 1) {
                    break;
                }

            }
        }
        return Arrays.copyOf(numbers, size - 1);
    }
}
