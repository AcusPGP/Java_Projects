package leetcode.array;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    /**
     * Run time = 10ms
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays_01(int[] nums1, int[] nums2) {
        double median;
        int nums1_length = nums1.length;
        int nums2_length = nums2.length;
        double nums0_length = nums1_length + nums2_length;
        double[] nums0 = new double[(int) nums0_length];
        int i = 0, j = 0, k = 0;
        while (i < nums1_length) {
            nums0[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2_length) {
            nums0[k] = nums2[j];
            j++;
            k++;
        }
        Arrays.sort(nums0);
        if (nums0_length % 2 == 0) {
            double middle = nums0_length / 2;
            median = (nums0[(int) (middle - 1)] + nums0[(int) middle]) / 2;
            return median;
        } else {
            median = nums0[(int) (nums0_length / 2)];
            return median;
        }
    }

    /**
     * Run time = 4ms
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays_02(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int lower = 0;
        int high = nums1.length;
        int combineLength = nums1.length + nums2.length;

        while (lower <= high) {
            int partX = (lower + high) / 2;
            int partY = (combineLength + 1) / 2 - partX;

            int leftX = getMax (nums1, partX);
            int rightX = getMin (nums1, partX);

            int leftY = getMax (nums2, partX);
            int rightY = getMin (nums2, partX);

            if (leftX <= rightY && leftY <= rightX) {
                if (combineLength % 2 == 0) {
                    return (Math.max(leftX, leftY) + Math.min(rightX, rightY)) / 2.0;
                }
                return Math.max(leftX, leftY);
            }
            if(leftX > rightY) {
                high = partX - 1;
            } else {
                lower = partX - 1;
            }
        }
        return -1;
    }

    private int getMax(int[] nums, int partion) {
        if (partion == 0) {
            return (int)Double.NEGATIVE_INFINITY;
        } else {
            return nums[partion - 1];
        }
    }

    private int getMin(int[] nums, int partion) {
        if (partion == nums.length) {
            return (int)Double.POSITIVE_INFINITY;
        } else {
            return nums[partion];
        }
    }

    /**
     * Run time = 2ms
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays_03(int[] nums1, int[] nums2) {
        int[] sum = Arrays.copyOf(nums1, nums1.length+nums2.length);
        int m = nums1.length - 1;
        int n = nums2.length - 1;
        int index = sum.length - 1;
        while (m >= 0 && n >= 0) {
            if(nums1[m] < nums2[n]){
                sum[index--] = nums2[n--];
            }else {
                sum[index--] = nums1[m--];
            }
        }
        while(n >= 0){
            sum[index--] = nums2[n--];
        }
        if(sum.length % 2 == 0){
            return (double) (sum[(sum.length-1)/2] + sum[(sum.length)/2])/2;
        }else {
            return sum[(sum.length)/2];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double median = findMedianSortedArrays_01(nums1, nums2);
        MedianOfTwoSortedArrays result = new MedianOfTwoSortedArrays();
        result.findMedianSortedArrays_02(nums1, nums2);
        result.findMedianSortedArrays_03(nums1, nums2);
    }
}
