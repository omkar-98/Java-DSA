//Problem statement :--->

// Given an integer array sorted in non-decreasing order,remove the duplicates in place 
// such that each unique element appears only once.
// // The relative order of the elements should be kept the same.

// If there are k elements after removing the duplicates,then the first k elements of the array
//  should hold the final result.It does not matter what you leave beyond the first k elements.

// CODE -->

import java.util.*;

public class RemoveDuplicates_From_Sorted_Array {
    /*
     * static int findDupicates(int arr[]) {
     * 
     * Set<Integer> unique = new HashSet<>();
     * 
     * int index = 0;
     * 
     * for (Integer num : arr) { // iterate over the array
     * 
     * if (!unique.contains(num)) { // if element is not present in unique
     * unique.add(num); // add element to the set
     * arr[index] = num; // replace this element at index
     * index++; // increment the index
     * }
     * }
     * return index;
     * }
     * 
     */

    /* ************** OPTIMAL APPROACH ---> 2 POINTER *************** */

    static int findDupicates(int nums[]) {

        if (nums.length == 0)
            return 0;

        // Pointer for last unique element
        int i = 0;

        for (int j = 1; j < nums.length; j++) { // Start from second element

            if (nums[j] != nums[i]) { // If new unique element is found

                i++; // Move unique position forward because arr[0] = unique and we want next at next
                     // position

                nums[i] = nums[j];
            }
        }

        return i + 1; // i is last index of unique element, count = i + 1
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 5 };
        int ans = findDupicates(arr);

        for (int i = 0; i < ans; i++) {
            System.out.print(arr[i] + ",");
        }

        // System.out.println(findDupicates(arr));
        // System.out.println(Arrays.toString(ans));

    }
}
