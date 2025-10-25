public class SubArraySumEquals_K {

    // brute force
    static int countSubArray(int[] arr, int target) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                
                if (sum == target) {
                    count++;
                }
            }
        }
        return count;
    }

    // **********************************************************
    // Slightly better

    // static int countSubArray(int[] arr, int target) {
    // int count = 0;

    // for (int i = 0; i < arr.length; i++) {

    // int sum = 0;
    // for (int j = i; j < arr.length; j++) {
    // sum += arr[j];

    // if (sum == target) {
    // count++;
    // }
    // }
    // }
    // return count;
    // }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1 };

        int result = countSubArray(arr, 2);
        System.out.println(result);
    }
}
