import java.util.*;

public class MisingElementsArr {

    /// ********************** find single missing element *****************

    // * *********************** BRUTE FORCE APPROACH

    static int missingElements(int arr[], int n) {

        for (int i = 1; i <= n; i++) { // traverse to 1 to n not on array

            int flag = 0;

            for (int j = 0; j < n - 1; j++) { // here j < n-1 because n= 5 and 1 element
                // is missing we have to traverse
                // till 4 and array indexing start from 0
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                return i;
            }
        }
        return -1;
    }

    // ********************** using hashing **********

    // better approach
    static int missingElement(int[] arr, int n) {

        int ans[] = new int[n + 1];

        // for (int i =0; i < n-1; i++) {
        // ans[arr[i]] = 1;
        // }

        for (int num : arr) {
            ans[num] = 1;
        }

        for (int i = 1; i <= n; i++) {
            if (ans[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    // *********************** Optimal *******************************
    static int findMissing(int arr[], int n) { // if n is big then need long data type
        int result = n * (n + 1) / 2; // if n = 10^5
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum = sum + arr[i];
        }
        return result - sum;
    }

    // Using Xor operation

    static int singleMissingElement(int[] arr, int n) {
        int xOr1 = 0 , xOr2 = 0;

        for (int i = 0; i < n-1 ; i++) {
            xOr2 = xOr2 ^ arr[i];
            xOr1 = xOr1 ^ (i+1);
        }

        xOr1 = xOr1 ^ n;

        return xOr1 ^ xOr2;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 8, 7, 9, 10 };
        // int result = missingElement(arr, 10);
        // System.out.println(result);

        // System.out.println(missingEl(arr, 10));

        System.out.println(missingElement(arr, 10));
    }
}
