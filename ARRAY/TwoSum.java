import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 9, 6, 10, 21 };
        int target = 13;
        int ans[] = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }


    // ****************** BRUTE FORCE APPROACH ****************
    // public static int[] twoSum(int arr[], int target) {
    //     int ans[] = new int[2];

    //     for (int i = 0; i < arr.length; i++) {
    //         int num = arr[i];

    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (num + arr[j] == target) {
    //                 ans[0] = i;
    //                 ans[1] = j;
    //             }
    //         }
    //     }
    //     return ans;
    // }



    public static int[] twoSum(int nums[], int target){
        int ans[] = new int[2];
        Map<Integer,Integer>map = new HashMap<Integer,Integer>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            
            int required = target - num;

            if(map.containsKey(required)){
                ans[0] = map.get(required);
                ans[1] = i;
            }

            map.put(nums[i], i);
        }
        return ans;
    }
}
