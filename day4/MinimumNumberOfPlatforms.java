package day4;

import java.util.Arrays;

public class MinimumNumberOfPlatforms {
    public static void main(String[] args) {
        int[] arr = {900, 915, 1100};
        int[] dep = {1000, 1105, 1200};
        int ans = findPlatform(arr, dep);
        System.out.println(ans);
    }

    private static int findPlatform(int[] arr, int[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int result = 1;
        int arrivalndex = 1;
        int departureIndex = 0;
        int platform = 1;

        while(arrivalndex < arr.length && departureIndex < dep.length) {
            int currentArrivalTime = arr[arrivalndex];
            int currentDepartureTime = dep[departureIndex];

            if(currentArrivalTime <= currentDepartureTime) {
                platform++;
                arrivalndex++;
            } else {
                platform--;
                departureIndex++;
            }
            if(platform > result) {
                result = platform;
            }
        }
        return result;
    }
}
