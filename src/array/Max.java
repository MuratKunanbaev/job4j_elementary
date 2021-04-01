package array;

public class Max {
    public static int[] findMax(int[] array) {
        int max = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] > max) {
                max = array[index];
            }
        }
        return array;
    }
}
