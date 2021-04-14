package array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        outputOfArrayElements(numbers);
        int[][] numbers1 = {
                {1},
                {1, 2},
                {1, 2, 3},
                {1, 2, 3, 4}
        };
        outputOfArrayElements(numbers1);
    }
    public static void outputOfArrayElements(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Размер вложенного массива равен: " + array[i].length);
        }
    }
}
