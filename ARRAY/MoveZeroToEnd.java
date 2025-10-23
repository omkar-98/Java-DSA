import java.util.Arrays;

public class MoveZeroToEnd {

    // Works only when elements position not matters

    /*
     * static void reverse(int arr[], int start, int end) {
     * while (start <= end) {
     * int temp = arr[start];
     * arr[start] = arr[end];
     * arr[end] = temp;
     * start++;
     * end--;
     * }
     * }
     * 
     * static void moveZeroToEnd(int arr[]) {
     * Arrays.sort(arr);
     * int countZero = 0;
     * for (int i = 0; i < arr.length; i++) {
     * if (arr[i] == 0) {
     * countZero++;
     * }
     * }
     * 
     * reverse(arr, 0, countZero - 1);
     * reverse(arr, countZero, arr.length - 1);
     * reverse(arr, 0, arr.length - 1);
     * }
     */

    /*
     * static void moveZerosToEnd(int arr[]){
     * 
     * int n = arr.length; // 9
     * int temp [] = new int[n];
     * 
     * int j=0;
     * for (int i = 0; i < n; i++) { // O(n)
     * if(arr[i] != 0){
     * temp[j++] = arr[i];
     * }
     * }
     * 
     * int index =0;
     * for (int i = 0; i < temp.length; i++) { // O(n-k)
     * arr[index++] = temp[i];
     * }
     * 
     * for (int i =0; i < n - temp.length; i++) { // O (k)
     * arr[index++] = 0;
     * }
     * 
     * // space complexity --> O(2n)
     * 
     * }
     * 
     */



     // Optimal Approach  --->  TWO POINTER

    static void moveZerosToEnd(int nums[]) {
        int n = nums.length;
        int j = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return ;
        }

        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
  

    public static void main(String[] args) {
        int arr[] = { 0,1,0,3,12};
      moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
