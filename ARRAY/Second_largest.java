import java.util.Arrays;

public class Second_largest {
    /*
    static int secondLargestEl(int[] arr) {
        // Brute force
    
        Arrays.sort(arr);
        int n = arr.length;
        int large = arr[n - 1];
        int sLarge = Integer.MIN_VALUE;
        for (int i = n-2; i>=0; i--) {
            if(arr[i] != large){
                sLarge = arr[i];
                break;
            }
        }
        return sLarge;
    }
     */


     // BETTER 
/* 
     static int secondLargestEl(int arr[]){
        int large = Integer.MIN_VALUE+1;
        int sLarge = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > large){
                large = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(sLarge < arr[i] && arr[i] != large){
                sLarge = arr[i];
            }
        }
        return sLarge;
     }
*/
  

// best 

    static int secondLargestEl(int[] arr){
        int large = Integer.MIN_VALUE+1;
        int sLarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
                if(arr[i] > large){
                    sLarge =large;
                    large =  arr[i];
                }
                else if(arr[i] <large && arr[i]>sLarge){
                    sLarge= arr[i];
                }
        }
        return sLarge;
    }


    

        
    public static void main(String[] args) {
        int arr[] = { 1, 2, 34, 23, 23 };
        System.out.println(secondLargestEl(arr));
    }
}
