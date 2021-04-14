package array;

public class RightShift {
    public static void shift(int[] nums, int count) {
        while (count != 0) {
            shift(nums);
            count--;
        }
    }
    private static void shift(int[] nums) {
        int temp = nums[nums.length - 1];
        int size = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                nums[nums.length - 1 - i] = nums[nums.length - 2 - i];
                size--;
            } else {
                nums[0] = temp;
            }
        }
    }
}
