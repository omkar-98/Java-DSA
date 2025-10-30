import java.util.ArrayList;
import java.util.List;

public class ReturnMaxSumArray_Kadanes {
    static List<Integer> returnMaxSubArray(int[] nums) {

        List<Integer> list = new ArrayList<>(); 
        int maxSum = nums[0];
        int sum = 0;

        // these index are for te subarray of max sum
        int startIndex = -1;
        int endIndex = -1;

        // this is the starting point for subArray 
        int start = 0;


        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            // check for negative element
            sum = sum < 0 ? 0 : sum;

            // check if sum ==0 , if yes then start index must greater than current 
            if (sum == 0) {
                start = i+1;
            }


            // update the maxSum

            if (maxSum < sum) {
                maxSum = sum;

                // this is the start point for the subArray
                startIndex = start;
                // our current index is end index
                endIndex = i;
            }
        }

        // itrtate throgh that index
        for (int i = startIndex; i <= endIndex; i++) {
            list.add(nums[i]);
        }


        // if no positive number present return empty or 0 in list 
        if(list.isEmpty()){
            list.add(0);
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { -2,1,-1,5,6,3,-24, 34};
        List<Integer> list = returnMaxSubArray(arr);
        System.out.println(list);
    }
}
