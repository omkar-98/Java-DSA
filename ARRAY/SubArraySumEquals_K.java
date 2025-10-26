import java.util.*;

public class SubArraySumEquals_K {

    // brute force
    // static int countSubArray(int[] arr, int target) {

    // int count = 0;
    // for (int i = 0; i < arr.length; i++) {

    // for (int j = i; j < arr.length; j++) {
    // int sum = 0;

    // for (int k = i; k <= j; k++) {
    // sum = sum + arr[k];
    // }

    // if (sum == target) {
    // count++;
    // }
    // }
    // }
    // return count;
    // }

    // **********************************************************
    // Slightly better

    // static int countSubArray(int[] arr, int target) {
    // int count = 0;

    // for (int i = 0; i < arr.length; i++) {

    // int sum = 0;
    // for (int j = i; j < arr.length; j++) {
    // sum += arr[j];

    // if (sum == target) {
    // count++;
    // }
    // }
    // }
    // return count;
    // }

    static int countSubArray(int arr[], int target) {

        int count = 0;
        int prefSum = 0;
        Map<Integer, Integer> map = new HashMap();

        // setting up the 0 in the map
        map.put(0, 1);

        for (int el : arr) {
            //add current element to prefix sum
            prefSum = prefSum + el;

            // calculate x - target 
            int remove = prefSum - target;

            // Add the no. of subarray to be removed
            count = count + map.getOrDefault(remove, 0);

            // update count of prefix sum in map
            map.put(prefSum, map.getOrDefault(prefSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 4, 0, 20, 3, 10, 5 };

        int result = countSubArray(arr, 33);
        System.out.println(result);
    }
}
