import java.util.*;

public class ArrayUnioun {

    /*
     * static Set<Integer> returnUnion(int[] arr, int[] nums) {
     * 
     * Set<Integer> union = new HashSet<>();
     * for (int i = 0; i < arr.length; i++) {
     * if (!union.contains(arr[i])) {
     * union.add(arr[i]);
     * }
     * }
     * 
     * for (int i = 0; i < nums.length; i++) {
     * if (!union.contains(nums[i])) {
     * union.add(nums[i]);
     * }
     * }
     * 
     * return union;
     * }
     * 
     */
    // ***********************************************************************************************************

    // usig List

    /*
     * static List<Integer> returnUnion(int[] arr, int nums[]) {
     * 
     * List<Integer> union = new ArrayList<>();
     * for (int i = 0; i < arr.length; i++) {
     * if (!union.contains(arr[i])) {
     * union.add(arr[i]);
     * }
     * }
     * for (int i = 0; i < nums.length; i++) {
     * if (!union.contains(nums[i])) {
     * union.add(nums[i]);
     * }
     * }
     * Collections.sort(union);
     * return union;
     * }
     * 
     */

    // ***********************************************************************************************************

    // OPTIML APPRACH ----> TWO POINTER


    static List<Integer> returnUnion(int arr1[], int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int ptr1 = 0;
        int ptr2 = 0;
        List<Integer> unions = new ArrayList<>();

        while (ptr1 < n && ptr2 < m) {   // check if any one array gets exhaust break loop

            if (arr1[ptr1] <= arr2[ptr2]) {   // check arr1's element <= arr2's element 

                if (unions.size() == 0 || unions.get(unions.size() - 1) != arr1[ptr1]) {
                    unions.add(arr1[ptr1]);
                }
                ptr1++; // always increment even if condition false
            }  
 
            
            else {// if arr1's element > arr2's element
                if (unions.size() == 0 || unions.get(unions.size() - 1) != arr2[ptr2]) {   // check if list has only 1 element then add it to list
                    unions.add(arr2[ptr2]); // or  the last index element of the list != current element of arr2
                    // then add this unique element  too the list
                }

                ptr2++; // always increment even if condition false

            }
        }

        while (ptr1 < n) {   //  if 1 array get exhauusted then iterate the remaining whole array 
            if (unions.get(unions.size() - 1) != arr1[ptr1]) {   // check last element of list  != current element 
                unions.add(arr1[ptr1]);// if unique element found add it

            }
            ptr1++;  // always increment even if condition false

        }

        while (ptr2 < m) {
            if (unions.get(unions.size() - 1) != arr2[ptr2]) {
                unions.add(arr2[ptr2]);
            }
            ptr2++; // always increment even if condition false

        }

        return unions;  // list returned with unique sorted way
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 9 };
        int nums[] = { 1, 3, 5, 7, 9, 14 };

        // Set<Integer> result = returnUnion(arr, nums);
        // System.out.println(result);

        List<Integer> result = returnUnion(arr, nums);
        System.out.println(result);

    }
}
