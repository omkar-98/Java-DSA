import java.util.*;

public class RotateToLeftArray {
    static void reverse(int[] arr, int start, int end) {

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateElmentToRight(int arr[] , int n, int k){

        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr,0,n-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println( "Before the rotation :" +  Arrays.toString(arr));
        rotateElmentToRight(arr, arr.length, 3);

        System.out.println( "after the rotation :" +  Arrays.toString(arr));
    }
}
