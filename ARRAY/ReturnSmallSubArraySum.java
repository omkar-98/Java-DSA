import java.util.ArrayList;
import java.util.List;

public class ReturnSmallSubArraySum {

    // static int smallestSubArraySum(int nums[]){   // if only contains positive 
    // if(nums.length == 0){
    // return 0;
    // }
    // int small = nums[0];

    // for (int i = 0; i < nums.length; i++) {
    // if( nums[i] < small){
    // small = nums[i];
    // }
    // }
    // return small;
    // }

    

    /* *****  if contains +ve and -ve values ******** */

    static List<Integer> smallestSubArraySum(int nums[]) {

        List<Integer> list = new ArrayList<>();

        int smallestSum = nums[0];
        if (nums.length == 0) {
            return list;
        }

        int start = 0;
        int startIndex = -1;
        int endIndex = -1;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum < smallestSum) {
                smallestSum = sum;
                startIndex = start; // start of subarray
                endIndex = i; // end of subArray 
            }

            if (sum > 0) {   // if sum is positi ve 
                sum = 0; // reset sum = 0
                start = i + 1; // check from next index
            }
        }

        for (int i = startIndex; i <= endIndex; i++) {
            list.add(nums[i]);
        }

        System.out.println(smallestSum);
        return list;
    }

    public static void main(String[] args) {
        int arr[] = {-1, -3, 5, -7, 6, -13, 12, -34};
        // int result = smallestSubArraySum(arr);
        // System.out.println(result);

        List<Integer> list = smallestSubArraySum(arr);
        System.out.println(list);

    }
}
