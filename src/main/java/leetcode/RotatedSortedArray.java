package leetcode;

import java.util.HashMap;

public class RotatedSortedArray {
    public static int search(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, 1);
            if(nums[i] == target) {
                return 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5};
        int target = 4;
        int outPut = search(nums, target);
        System.out.println("Output: " + outPut);
    }
}
