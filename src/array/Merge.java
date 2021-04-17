package array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        if (left == null && right == null) {
            rsl = null;
        }
        if (left == null) {
            System.arraycopy(right, 0, rsl, 0, right.length);
        }
        if (right == null) {
            System.arraycopy(left, 0, rsl, 0, left.length);
        }
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                rsl[k] = left[i];
                i++;
            } else {
                rsl[k] = right[j];
                j++;
            }
            k++;
        }
        if (i <  left.length) {
            System.arraycopy(left, i, rsl, k, (left.length - i));
        }
        if (j < right.length) {
            System.arraycopy(right, j, rsl, k, (right.length - j));
        }
        return rsl;
    }
}
