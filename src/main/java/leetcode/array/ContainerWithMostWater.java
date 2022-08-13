package leetcode.array;

public class ContainerWithMostWater {
    public int maxArea_1(int[] height) {
        int maxContainer = 0;
        int area;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (height[i] <= height[j]) {
                    area = height[i] * (j - i);
                } else {
                    area = height[j] * (j - i);
                }
                if (area > maxContainer) {
                    maxContainer = area;
                }
            }
        }
        return maxContainer;
    }

    public int maxArea_2(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxContainer = 0;
        int i_height;
        int j_height;
        int area;
        while (i < j) {
            i_height = height[i];
            j_height = height[j];
            if (i_height <= j_height) {
                area = i_height * (j - i);
                i++;
            } else {
                area = j_height * (j - i);
                j--;
            }
            if(area > maxContainer) {
                maxContainer = area;
            }
        }
        return maxContainer;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        ContainerWithMostWater attempt = new ContainerWithMostWater();
        int maxArea_1, maxArea_2;
        maxArea_1 = attempt.maxArea_1(height);
        maxArea_2 = attempt.maxArea_2(height);
        System.out.println(maxArea_1);
        System.out.println(maxArea_2);
    }
}
