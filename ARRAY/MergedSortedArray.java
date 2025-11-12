import java.util.Arrays;

public class MergedSortedArray {
    // public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
    // int ans[] = new int[m + n];
    // int index = 0;
    // int num1Size = nums1.length - n;
    // for (int i = 0; i < num1Size; i++) {
    // ans[index++] = nums1[i];
    // }

    // for (int i = 0; i < nums2.length; i++) {
    // ans[index++] = nums2[i];
    // }
    // Arrays.sort(ans);
    // index = 0;
    // for (int i = 0; i < ans.length; i++) {
    // nums1[index++] = ans[i];
    // }
    // return nums1;
    // }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = 0;
        int ptr2 = 0;
        // int num1Size = nums1.length - n;
        int index = 0;
        int ans[] = new int[m+n];

        while (ptr1 < m && ptr2 <n) {
            int num1 = nums1[ptr1];
            int num2 = nums2[ptr2];

            if (num1 == num2) {
                ans[index++] = num1;
                ans[index++] = num2;
                ptr1++;
                ptr2++;
            } else if (num2 >= num1) {
                ans[index++] = num1;
                ptr1++;
            }
            else  {
                ans[index++] = num2;
                ptr2++;
            }
        }

        while (ptr1< m) {
                    ans[index++] = nums1[ptr1];
                    ptr1++;
            }

         while (ptr2 < n){
            ans[index++] = nums2[ptr2++];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1,4,7,8,  0, 0 };
        int[] arr2 = { 2, 5, 6 };

        int ans[] = merge(arr1, 4, arr2, 3);
        System.out.println(Arrays.toString(ans));
    }
}
