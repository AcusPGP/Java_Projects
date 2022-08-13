package leetcode;

import java.util.*;

public class _3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set <List<Integer>> triplets = new HashSet<>();
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

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        _3Sum temp = new _3Sum();
        List<List<Integer>> result = temp.threeSum(nums);
        System.out.println(result);
    }
}
