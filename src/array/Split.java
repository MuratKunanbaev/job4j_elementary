package array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        int k = 0;
        int commonCount = 1;
        int size = 0;
        char[][] result = new char[str.length / 2][];
        for (int i = 0; i < str.length; i++) {
            if (str[i] != c) {
                size++;
            } else if (str[i] == c || str[i] == str[str.length - 1]) {
                result[k] = new char[size];
                k++;
                size = 0;
            }
        }
        result[k] = new char[size];
        int g = 0;
        int h = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] != c) {
                result[g][h] = str[i];
                h++;
            } else {
                g++;
                h = 0;
                commonCount++;
            }
        }
        char[][] copyResult = Arrays.copyOf(result, commonCount);
        return copyResult;
    }
}
