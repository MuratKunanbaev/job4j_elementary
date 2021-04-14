package array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }
    public static String[] swap(String[] array, int source, int dest) {
        String temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }
    public static int[] swampBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }
    public static void main(String[] args) {
        int count = 4;
        int x = 1;
        int[][] triangle = new int[count][];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i+1];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = x;
                x++;
            }
        }
        for (int index = 0; index < triangle.length; index++) {
            for (int index2 = 0; index2 < triangle[index].length; index2++) {
                System.out.print(triangle[index][index2]);
            }
            System.out.println();
        }
    }
}

