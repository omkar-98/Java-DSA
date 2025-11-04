import java.util.*;

public class SUbArraySumEqualsK {
    public static void main(String[] args) {
        int arr[] = { 9, 4, 20, 3, 10, 5 };
        int target = 33;
        int result = countSubArr(arr, target);
        System.out.println(result);
    }

    // public static int countSubArr(int arr[], int target) {

    // int count = 0;
    // int n = arr.length;
    // for (int i = 0; i < n; i++) {
    // int sum = 0;
    // for (int j = i; j < n; j++) {
    // sum += arr[j];
    // if (sum == target) {
    // count++;
    // }
    // }
    // }
    // return count;
    // }


    // ************ optimal Approach *************

    public static int countSubArr(int nums[], int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int prefSum = nums[0]; // first element is the starting of the prefix sum
        int count = 0;// we are counting the subarray equals K

        for (int i = 0; i < nums.length; i++) {

            if (prefSum == target) { // if ourget found equals prefsum the n count++
                count++;
            }

            prefSum += nums[i]; // we're adding current element to the prefSum

            int required = prefSum - target;// here we are finding the " i-1 " element such that
            // if we remove thatelement we get the target
            // for that we took " i " as a starting index and prefSum at that point we get
            // the subarray

            if (map.containsKey(required)) { // if the required value are available
                // the times it appears in the map gets added to count
                count = count + map.get(required);
            }

            // we are storing the prefSum to the map
            // if same prefix sum appears multiple times we increment it count using
            // getOrDefault method
            map.put(prefSum, map.getOrDefault(prefSum, 0) + 1);
        }
        System.out.println(map);
        return count;
    }
}
