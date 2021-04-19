package array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                rsl[k] = left[i];
                i++;
                k++;
            } else {
                rsl[k] = right[j];
                j++;
                k++;
            }
        }

        if (i < left.length) {
            while (i < left.length) {
                rsl[k] = left[i];
                i++;
                k++;
            }
        } else {
            while (j < right.length) {
                rsl[k] = right[j];
                j++;
                k++;
            }
        }
        return rsl;
    }
}
