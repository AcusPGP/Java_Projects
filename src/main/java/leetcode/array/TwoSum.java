package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] TwoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    System.out.println("[" + i + ", " + j + "]");
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int[] TwoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp) && map.get(temp) != i) {
                System.out.println("[" + i + ", " + map.get(temp) + "]");
                return new int[] {i, map.get(temp)};
            }
        }
        return null;
    }

    public static int[] TwoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if(map.containsKey(temp)) {
                System.out.println("[" + map.get(temp) + ", " + i + "]");
                return new int[] {map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;
        TwoSum1(nums, target);
        TwoSum2(nums, target);
        TwoSum3(nums, target);
    }
}

