import java.util.*;

public class TWOSUM {

    // Brute Froce Approach
    // public static int[] twoSum(int[] nums, int target) {
    //     int arr[] = new int[2];
    //     for (int i = 0; i < nums.length; i++) {

    //         for (int j = i + 1; j < nums.length - 1; j++) {

    //             if (nums[i] + nums[j] == target) {
    //                 arr[0] = i;
    //                 arr[1] = j;
    //             }
    //         }
    //     }
    //     return arr;
    // }


  



    public static void main(String[] args) {
        int arr[] = { 2, 2, 11, 7, 15 };
        int ans[] = twoSum(arr, 18);
        System.out.println(Arrays.toString(ans));
    }
}
