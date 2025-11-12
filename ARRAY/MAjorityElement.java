import java.util.*;

public class MAjorityElement {
    public static void main(String[] args) {

        int arr[] = { 3, 13, 43, 3, 3, 3, 3, 12, 3 };
        int result = majorityElement(arr);
        System.out.println(result);

        int x = 2; 
        int y= 15;

        if( y % 4 != 0){
            System.out.println("true int not divisible of 4");          
        }
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

    // public static int majorityElement(int nums[]) {

    // int n = nums.length;
    // Map<Integer, Integer> map = new HashMap<>();

    // for (int i = 0; i < nums.length; i++) {
    // map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    // }

    // for (int key : map.keySet()) {
    // if (map.get(key) > n / 2) {
    // return key;
    // }
    // }
    // return -1;
    // }

    // Better Approach***************************

    // public static int majorityElement(int[] arr) {
    // Arrays.sort(arr); // because same elements comes after each other
    // better for comarison

    // int freq = 1;
    // int ans = arr[0];

    // for (int i = 1; i < arr.length; i++) {

    // if (arr[i] == arr[i - 1]) {// checking with previous element , if both same
    // increase its occurance frequency
    // freq++;
    // }
    // other wise reset frequency to 1 , because we found new element and now we are
    // calculaing its frequency

    // else {
    // freq = 1;
    // ans = arr[i]; // we are assign ans as new element as we are checking its
    // frequency
    // }

    // if (freq > arr.length / 2){ // if frequency greater that half of lngth its
    // majority element
    // return ans;
    // }
    // }
    // return -1;
    // }

    // ********************** Moore's Voting AlgoRithm **********************


    public static int majorityElement(int[] nums) {

    int candidate = 0;
    int count = 0;

    // Phase 1: Find a potential candidate using cancellation logic
    for (int n : nums) {

        // If count dropped to zero, whatever candidate we had is useless now.
        // Assign current number as the new candidate.
        if (count == 0) {
            candidate = n;
        }

        // If n supports the candidate, increase count,
        // otherwise it cancels out one vote of the candidate.
        if (n == candidate) {
            count++;
        } else {
            count--;
        }
    }

    // Phase 2: Verify because phase-1 can produce a wrong candidate
    count = 0;
    for (int n : nums) {
        if (n == candidate) {
            count++;
        }
    }

    // If the candidate actually appears more than n/2 times, return it.
    // Otherwise there IS NO majority element.
    if (count > nums.length / 2) {
        return candidate;
    } else {
        return -1;
    }
}


}
