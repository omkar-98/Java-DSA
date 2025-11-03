import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {

        int nums[] = {-1,-4,2,3,-5,3};
        int ans[] = rearrangeArr(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] rearrangeArr(int[] nums) {
        int ans[] = new int[nums.length];

        int pos = 0;
        int neg = 1;

        for (int i = 0; i < ans.length; i++) {
            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        return ans;
    }
}
