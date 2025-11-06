import java.util.*;

public class LongestSubArray_SUm {
    public static void main(String[] args) {
        int arr[] = new int[] {10,0,5,2,7,0,1,-10 };
        int target = 15;
        int result = getLongestSubArray(arr, target);
        System.out.println(result);
    }

    // ******* Brute force Approach ***************

    // public static int longestSubArrSum(int nums[], int target) {
    // int len = 0;

    // for (int i = 0; i < nums.length; i++) {
    // int summ = 0;
    // for (int j = i; j < nums.length; j++) {
    // summ += nums[j];
    // if (summ == target) {
    // // len = len > j - i + 1 ? len : j - i + 1;

    // if (len < j - i + 1) {
    // // if our length of previous subArray
    // // is less than "j-i+1" then our subArray length will be "j-i+1"
    // len = j - i + 1;
    // }
    // }
    // }
    // }
    // return len;
    // }

    public static int getLongestSubArray(int arr[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = 0, prefSum = 0;

        for (int i = 0; i < arr.length; i++) {  // 10,0,5,2,7,0,1,-10 
            prefSum += arr[i];

            if (prefSum == target) {
                len = i + 1;
            }

            int required = prefSum - target;

            if (map.containsKey(required)) {
                int size = i - map.get(required);
                len = len < size ? size : len;
            }

            if (!map.containsKey(prefSum)) {
                map.put(prefSum, i);
            }
        }
        return len;
    }

}
