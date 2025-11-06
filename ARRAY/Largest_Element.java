import java.util.Arrays;

public class Largest_Element {

    // BRUTE FOrce Approach
    static int largeEl(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    // Optimal APPRACH 

    static int returnMAx(int[]arr){

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
                if(arr[i] > max){
                    max = arr[i];
                }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,32,43,12};
        // System.out.println(largeEl(arr));

        System.out.println(returnMAx(arr));
        
    }
}
