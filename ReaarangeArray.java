public class ReaarangeArray {
    public static void main(String[] args) {

    }

    static int[] rearrangeArr(int[] nums) {

        int ans[] = new int[nums.length];
        int pos = 0;
        int neg = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
                ans[pos] = nums[i];  // if the number is positive then the even index 
                pos += 2;
            } else {
                ans[neg] = nums[i]; // if element is negative odd index
                neg += 2;
            }
        }
        return ans;
    }
}
