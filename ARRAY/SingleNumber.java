
// Given an array of nums of n integers. Every integer in the array appears twice except one integer.
//  Find the number that appeared once in the array.
// Examples:
// Input : nums = [1, 2, 2, 4, 3, 1, 4]
// Output : 3
// Explanation : The integer 3 has appeared only once

import java.util.*;

public class SingleNumber {

    // < ----------------BRUTE FORCE APPROACH ----->

    
    // static int singleNum(int arr[]) {
    //     for (int i = 0; i < arr.length; i++) {
    //         int num = arr[i];
    //         int count = 0;

    //         for (int j = 0; j < arr.length; j++) {
    //             if (arr[j] == num) {
    //                 count++;
    //             }
    //         }
    //         if (count == 1) {
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }


    // <---------- Better Approacch using hashmap ----> 

    // static int singleNum(int[] arr){
    // Map<Integer,Integer> map = new HashMap<>();
    // for (int num : arr) {
    // map.put(num, map.getOrDefault(num , 0) +1);
    // }
    // for (int num : map.keySet()) {
    // if(map.get(num) == 1){
    // return num;
    // }
    // }
    // return -1;
    // }



    // <-----Optimal Approach ---->
    static int singlenumber(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i]; // here we perform xor operation

            // a ^ a = 0
            // 0 ^ 0 = 0
            // 0 ^ a = a
            // if same number perform xor operation with the same number -> output will be 0
            // if number is perform xor with 0 = then that number is the answer .
        }
        return xor;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 3, 4, 5, 4, 5 };
        int result = singlenumber(arr);
        System.out.println(result);
    }
}
