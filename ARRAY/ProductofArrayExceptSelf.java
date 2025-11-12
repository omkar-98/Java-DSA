public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int ans[] = productExceptSelf(arr);
        System.out.println(java.util.Arrays.toString(ans));
    }

    // OPTIMAl Approach

    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        ans[0] = 1;

        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * arr[i - 1];
        }

        int suffix = 1;

        for (int i = n - 2; i >= 0; i--) {
            suffix *= arr[i + 1];
            ans[i] *= suffix;
        }
        return ans;
    }

    // ****************** BETTER APPROACH **********

    // public static int[] productExceptSelf(int[] arr) {
    // int n = arr.length;
    // int ans[] = new int[n];

    // int prefix[] = new int[n];
    // prefix[0] = 1;
    // int suffix[] = new int[n];
    // suffix[n - 1] = 1;

    // for (int i = 1; i < n; i++) {
    // prefix[i] = prefix[i - 1] * arr[i - 1];
    // }

    // for (int i = n - 2; i >= 0; i--) {
    // suffix[i] = arr[i + 1] * suffix[i + 1];
    // }

    // for (int i = 0; i < suffix.length; i++) {
    // ans[i] = prefix[i] * suffix[i];
    // }
    // return ans;
    // }

    // **********Brute force Approach **********

    // public static int[] productExceptSelf(int arr[]){
    // int n = arr.length;
    // int ans[] = new int[n];

    // for (int i = 0; i < ans.length; i++) {
    // int product = 1;
    // for (int j = 0; j < ans.length; j++) {

    // if( i != j){
    // product *= arr[j];
    // }
    // }
    // ans[i] = product;
    // }
    // return ans;
    // }
}
