package array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int index1 = point; index1 < array.length; index1++) {
                    if (array[index1] != null) {
                        int point1 = index1;
                        SwitchArray.swap(array, point, point1);
                        break;
                    }

                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

}
