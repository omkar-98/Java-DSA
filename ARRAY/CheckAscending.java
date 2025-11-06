public class CheckAscending {
    static boolean isSorted(int[] arr){
        // for (int i = 0; i < arr.length-1; i++) {
        //     if(arr[i] <= arr[i+1]){

        //     }else{
        //         return false;
        //     }
        // }


         for (int i = 1; i < arr.length; i++) {
                if(arr[i] >= arr[i-1]){

                }
                else{
                    return false;
                }
         }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 46 };
        boolean result = isSorted(arr);
        System.out.println(result);
    }
}
