import java.util.*;

public class MAjorityElement {
    public static void main(String[] args) {

        int arr[] = { 1, 1, 1, 1, 1, 11, 1, 1, 111, 1, 111, 6, 2, 2 };
        int result = majorityElement(arr);
        System.out.println(result);
    }

    // ********* Brute force aprrroach ******

    // static int majorityElement(int nums[]) {
    // int n = nums.length;
    // for (int i = 0; i < nums.length; i++) {
    // int num = nums[i];
    // int count = 0;

    // for (int j = i; j < nums.length; j++) {
    // if (num == nums[j]) {
    // count++;
    // }
    // }
    // if (count > n / 2) {
    // return num;
    // }
    // }
    // return -1;
    // }



    
    // ***** better approach by checking frequency ******

    public static int majorityElement(int nums[]) {

        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 2) {
                return key;
            }
        }
        return -1;
    }
}
