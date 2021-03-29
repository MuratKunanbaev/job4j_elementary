package array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;

        for (int i = 0; i < array.length - 1; i++) {
            int t = 0;
            if (array[i] > array[i + 1]) {
                t = array[i];
                array[i] = array[i + 1];
                array[i + 1] = t;
            }
        }

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
