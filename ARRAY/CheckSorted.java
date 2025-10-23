public class CheckSorted {
    static boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,0,78,84,300};
        boolean result = isSorted(arr);
        System.out.println(result);
    }
}
