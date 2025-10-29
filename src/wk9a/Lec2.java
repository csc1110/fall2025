package wk9a;

import java.util.ArrayList;

public class Lec2 {
    public static void main(String[] args) {

    }

    public int[] fix34(int[] nums) {
        ArrayList<Integer> list = convert(nums);
        for (int indThree = 0; indThree < list.size(); indThree++) {
            if (list.get(indThree) == 3) {
                int indFour = 0;
                while (list.get(indFour) != 4) {
                    indFour++;
                }
                swap(list, indThree + 1, indFour);
            }
        }
        return convert(list);
    }

    public void swap(ArrayList<Integer> list, int first, int second) {
        int temp = list.remove(first);
        int temp2 = list.remove(second - 1);
        list.add(first, temp2);
        list.add(second, temp);
    }

    public int[] convert(ArrayList<Integer> list) {
        int[] nums = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }

    public ArrayList<Integer> convert(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums) {
            list.add(num);
        }
        return list;
    }
}
