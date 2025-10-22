package wk8b;

public class Lec2 {
    public static void main(String[] args) {
        System.out.println("hi");
        {
            int[] integers;
            integers = new int[20];
            fillArray(integers);
            printArray(integers);
        }
        Integer[] integers;
        integers = new Integer[20];
        Integer favorite = integers[0];
        integers[0] = 8;
        System.out.println("top of the morning");
        System.out.println(integers.length);
    }

    private static void fillArray(int[] array) {
        int value = 1000;
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            value -= 5;
        }
    }

    private static void printArray(int[] nums) {
        for(int num : nums) {
            num = 0;
            System.out.println(num);
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            nums[i] = 0;
            System.out.println(num);
        }
    }
}
