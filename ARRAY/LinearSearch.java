// Given an array of integers nums and an integer target, 
// find the smallest index (0 based indexing) where the target appears in the array.
//  If the target is not found in the array, return -1.


public class LinearSearch {

    static int findIndex(int arr[], int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target ){
                return i; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,3};
        System.out.println(findIndex(arr, 3));
    }
}
