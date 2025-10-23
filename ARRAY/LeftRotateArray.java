import java.util.*;

public class LeftRotateArray {

    // Brute force Approach
    /*
     * static int[] leftRotatedArray(int arr[] , int k){
     * int result[] = new int[arr.length];
     * int index = 0;
     * 
     * for (int i = k; i < arr.length; i++) { // O(n)
     * result[index] = arr[i];
     * index++;
     * }
     * 
     * for (int i = 0; i < k; i++) { // O(k) -- > worst O(n) if k == arr.length
     * result[index] = arr[i];
     * index++;
     * }
     * return result; // O(n)
     * }
     */

    // Better
    // space complexity --> O(k)
    // time complexity --> O(k + (n-k) + k) = O(n + k)

    static int[] leftRotatedArray(int arr[], int k) {

        k = k % arr.length;   //  if k = 7  and length == 7 
        // after 7 rotation we will get same array 
        // 15 roataion ---> 7 + 7 +1  , beacause every time we get 7 or multiple of it we get original array 
        // hence , K = K % arr.length    -----> k = 17 and length = 6
        // ----> you have to just rotate 5 times 
 

        int temp[] = new int[k]; // O(k) --> here we took temp array to store first (K elements)
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i]; // store that elements into the temp array
        }

        int index = 0; // took a iterator index , this will help to put temp array elements to original
                       // array
        for (int i = k; i < arr.length; i++) { // O (n-k)
            arr[index++] = arr[i]; // we put k index element at 0 position for starting
        }

        for (int i = 0; i < temp.length; i++) { // O(k) ----> now we put the temp array elements to the original array
            arr[index++] = temp[i]; // the index we got
            // here we place the remaining elents at back side
        }
        return arr; // original array

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int result[] = leftRotatedArray(arr, 4); // [3,4,5,6,7,8,9,1,2]
        System.out.println(Arrays.toString(result));
    }
}
