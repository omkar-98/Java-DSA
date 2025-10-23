// import java.util.Arrays;

// class SortArr {

//     static int[] sortArr(int[] arr) {

//         int[] sortedArr = new int[arr.length];

//         int zeroCount = 0, oneCnt = 0, twocnt = 0;
//         for (int i = 0; i < sortedArr.length; i++) {
//             if (arr[i] == 0)
//                 zeroCount++;
//             else if (arr[i] == 1)
//                 oneCnt++;
//             else
//                 twocnt++;
//         }

//         for (int i = 0; i < zeroCount; i++) {
//             sortedArr[i] = 0;
//         }

//         for (int i = zeroCount; i < (zeroCount + oneCnt); i++) {
//             sortedArr[i] = 1;
//         }
//         for (int i = (zeroCount + oneCnt); i < sortedArr.length; i++) {
//             sortedArr[i] = 2;
//         }
//         System.out.println("zero : " +zeroCount + "  one count: " +oneCnt + "  two: " + twocnt);

//         return sortedArr;
//     }

//     public static void main(String[] args) {
//         int ansArr[] = sortArr(new int[]{0,1,2,2,0,2,1,1,0,0});
//         System.out.println(Arrays.toString(ansArr));

//     }
// }

import java.util.Arrays;

class Sort_0_1_2 {
    // public static int[] sortColors(int[] nums) {
    // int zero = 0, one = 0, two = 0;

    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] == 0) {
    // zero++;
    // } else if (nums[i] == 1) {
    // one++;
    // } else {
    // two++;
    // }
    // }

    // int index = 0;
    // for (int i = 0; i < zero; i++) {
    // nums[index++] = 0;
    // }

    // for (int i = 0; i < one; i++) {
    // nums[index++] = 1;
    // }

    // for (int i = (zero + one); i < nums.length; i++) {
    // nums[index++] = 2;
    // }
    // return nums;
    // }


// ************************************** Dutch National flag ***********************
    static void swapNum(int nums[], int low, int mid) {
        int temp = nums[low] ;
        nums[low] = nums[mid];
        nums[mid] = temp;
    }

    static int[] sortArr(int[] nums) {

        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                swapNum(nums,low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swapNum(nums,mid, high);
                high--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int []arr = sortArr(new int[]{1,2,0,0,2,1,1,0});
        System.out.println(Arrays.toString(arr));
     }
}


