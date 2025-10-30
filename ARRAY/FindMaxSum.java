import java.util.*;

public class FindMaxSum {

    // ****************** Brute Force Approach ***********
    // static int maxtSum(int arr[]){
    // int maxSum = arr[0];
    // if( maxSum < 0 ){
    // maxSum = 0;
    // }
    // int n = arr.length;

    // for (int i = 0; i < n; i++) {

    // for (int j = i; j < arr.length; j++) {

    // int sum = 0;
    // for (int k = i; k <=j; k++) {
    // sum += arr[k];
    // maxSum = sum > maxSum ? sum : maxSum ;
    // }
    // if(sum < 0) sum = 0;
    // }
    // }
    // return maxSum;
    // }

    // ********************************Better Approach ************************
    // static int maxSum(int arr[]) {
    // int n = arr.length;
    // int maxSum = 0;
    // for (int i = 0; i < n; i++) {
    // int sum = 0;

    // for (int j = i; j < n; j++) {
    // sum += arr[j];

    // // update the maxSum value
    // maxSum = Math.max(maxSum, sum);

    // // if sum is negative np use to carry it , so keep it as 0
    // if (sum < 0) {
    // sum = 0;
    // }
    // }
    // }
    // return maxSum;
    // }

    // ***********Best Arrprach KADANE's ALgorithm *************

    static int maxSum(int arr[]) {

        int maxSum = arr[0];
        // if array is empty  or containing the negative values ---> keep maxSum = 0;
        if (maxSum < 0) {
            maxSum = 0;
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if( maxSum < sum ){
                maxSum = sum;
            }
    //   ---> above line can be written line that 
            //maxSum = maxSum < sum ? sum : maxSum;

            if(sum < 0){
                sum = 0;
            }

            // OR 
            // sum = sum < 0 ? 0 : sum;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 2,-1,3,-4,5,3,-3 };
        int result = maxSum(arr);
        System.out.println(result);
    }
}
