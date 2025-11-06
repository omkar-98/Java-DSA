import java.util.HashMap;
import java.util.Map;

public class LongestSubArraySUm {

    static int maxEl(int len, int index) {
        if (len < index) {
            len = index;
        } else {
            return len;
        }
        return len;
    }

    static int longestSubArray(int[] nums, int k) {
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum == k) {
                    maxLen = maxEl(maxLen, j - i + 1);
                }
            }
        }
        System.out.println(maxLen + "");

        return maxLen;
    }

    // static int longestSubArray(int[] arr, int target) {
    // int maxLen = 0;
    // int prefSum = 0;

    // Map<Integer, Integer> map = new HashMap<>();

    // map.put(0, 0);

    // for (int i = 0; i < arr.length; i++) {

    // prefSum = prefSum + arr[i];

    // long remove = target - prefSum;
    // map.getOrDefault(remove, 0);
    // map.put(prefSum, map.getOrDefault(prefSum, 0) + 1);

    // if(map.containsValue(prefSum - target))
    // if (prefSum == target) {
    // maxLen = maxEl(maxLen, i + 1);
    // }
    // }
    // return maxLen;
    // }

    public static void main(String[] args) {
        int nums[] = { 10, 5, 0, 0, 2,2,0,0 , 7, 1 };
        int target = 15;
        int result = longestSubArray(nums, target);
        System.out.println(result);
    }
}
