package leetcode.array;

import java.util.*;

public class _3Sum {
    public List<List<Integer>> threeSum_1(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> triplets = new HashSet<>();
        for (int left = 0; left < nums.length - 2; left++) {
            int mid = left + 1;
            int right = nums.length - 1;
            while (mid < right) {
                int sum = nums[left] + nums[mid] + nums[right];
                if (sum < 0) {
                    mid++;
                } else if (sum > 0) {
                    right--;
                } else {
                    List<Integer> triplet = Arrays.asList(nums[left], nums[mid], nums[right]);
                    triplets.add(triplet);
                    mid++;
                }
            }
        }
        return new ArrayList<>(triplets);
    }

    public List<List<Integer>> threeSum_2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSumII(nums, i, result);
            }
        }
        return result;
    }

    static void twoSumII(int[] nums, int i, List<List<Integer>> result) {
        int lower = i + 1, high = nums.length - 1;
        while (lower < high) {
            int sum = nums[i] + nums[lower] + nums[high];
            if (sum < 0) {
                ++lower;
            } else if (sum > 0) {
                --high;
            } else {
                result.add(Arrays.asList(nums[i], nums[lower++], nums[high--]));
                while (lower < high && nums[lower] == nums[lower - 1])
                    ++lower;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        _3Sum temp = new _3Sum();
        List<List<Integer>> result_1 = temp.threeSum_1(nums);
        System.out.println(result_1);
        List<List<Integer>> result_2 = temp.threeSum_2(nums);
        System.out.println(result_2);
    }
}
