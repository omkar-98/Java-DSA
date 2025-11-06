public class SecondSmallest {
    static int smallest(int[] arr) {
        int small = Integer.MAX_VALUE;
        int sSmall = Integer.MAX_VALUE + 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                sSmall = small;
                small = arr[i];
            } else if (arr[i] != small && arr[i] < sSmall){
                sSmall = arr[i];
            }
        }
        return sSmall;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 41, 23, 9, 43, 53, 3, -13, -12 };// -13
        int result = smallest(arr);
        System.out.println(result);
    }
}
