package day5;

/**
 *  calculate left and right max for every building
 *  get left max from left array and right from right
 */
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {5,0,5,3,2,1,4};
        int ans = getWater(arr);
        System.out.println(ans);
    }

    public static int getWater(int[] arr) {
        int[] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];
        leftMax[0] = arr[0];
        int waterUnits = 0;

        for(int leftIndex = 1; leftIndex < leftMax.length; leftIndex++) {
            leftMax[leftIndex] = Math.max(leftMax[leftIndex - 1], arr[leftIndex]);
        }
        rightMax[arr.length - 1] = arr[arr.length - 1];
        for(int rightIndex = arr.length - 2; rightIndex >=0; rightIndex--) {
            rightMax[rightIndex] = Math.max(rightMax[rightIndex + 1], arr[rightIndex]);
        }

        for(int currentIndex = 0; currentIndex < arr.length; currentIndex++) {
            waterUnits += Math.min(leftMax[currentIndex], rightMax[currentIndex]) - arr[currentIndex];
        }
        return waterUnits;
    }
}
