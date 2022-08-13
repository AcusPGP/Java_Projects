package leetcode;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxContainer = 0;
        int temp;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (height[i] <= height[j]) {
                    temp = height[i] * j;
                } else {
                    temp = height[j] * j;
                }
                if (temp > maxContainer) {
                    maxContainer = temp;
                }
            }
        }
        return maxContainer;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        ContainerWithMostWater attempt = new ContainerWithMostWater();
        int maxArea = attempt.maxArea(height);
        System.out.println(maxArea);
    }
}
