/* 
 * 
 * Given an integer array nums sorted in non-decreasing order, remove all duplicates in-place so that each unique element appears only once.



Return the number of unique elements in the array.



If the number of unique elements be k, then,

Change the array nums such that the first k elements of nums contain the unique values in the order that they were present originally.
The remaining elements, as well as the size of the array does not matter in terms of correctness.
The driver code will assess correctness by printing and checking only the first k elements of the modified array.


An array sorted in non-decreasing order is an array where every element to the right of an element is either equal to or greater in value than that element.


Examples:
Input: nums = [0, 0, 3, 3, 5, 6]

Output: 4

Explanation:

Resulting array = [0, 3, 5, 6, _, _]

There are 4 distinct elements in nums and the elements marked as _ can have any value.

Input: nums = [-2, 2, 4, 4, 4, 4, 5, 5]

Output: 4

Explanation:

Resulting array = [-2, 2, 4, 5, _, _, _, _]

There are 4 distinct elements in nums and the elements marked as _ can have any value.

Input: nums = [-30, -30, 0, 0, 10, 20, 30, 30]

Select the possible resulting array.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {

    static int removeDup(int[] arr) {
        Set<Integer> set = new LinkedHashSet();
        for (Integer el : arr) {
            set.add(el);
        }

        int index = 0;
        for (Integer element : set) {
            arr[index] = element;
            index++;
        }
        return index ;
    }

    // static int removeDup(int[] arr) {
    // int index = 0;
    // for (int j = 1; j < arr.length; j++) {
    // if (arr[j] != arr[index]) {
    // arr[index + 1] = arr[j];
    // index++;
    // }
    // }
    // return index + 1;
    // }

    public static void main(String[] args) {
        int arr[] = { 9, 9, 87, 6, 5, 43, 43 };
        int result = removeDup(arr);
        System.out.println(result);
    }
}
