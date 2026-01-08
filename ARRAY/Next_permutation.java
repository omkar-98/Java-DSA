public class Next_permutation {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int pivot = -1;

        // search pivot 
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i + 1] > nums[i]) {
                pivot = i;
                break;
            }
        }

        // check if its not last permutation , if its return reverse aray
        if (pivot == -1) {
                reverse(nums, 0, n - 1);
                return;
            }

        // find next big element and swap elemet 
        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }
        // reverse from pivot+1 to end 
        reverse(nums, pivot + 1, n - 1);
    }

    private static void reverse(int nums[], int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

