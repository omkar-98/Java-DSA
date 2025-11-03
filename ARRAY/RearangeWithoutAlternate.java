import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearangeWithoutAlternate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, -5, -7, 99, 76 };
        int ans[] = reArrage(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] reArrage(int[] nums) {
        int[] ans = new int[nums.length];
        List<Integer> posList = new ArrayList<>();
        List<Integer> negList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                posList.add(nums[i]);
            } else {
                negList.add(nums[i]);
            }
        }

        if (posList.size() > negList.size()) {
            for (int i = 0; i < negList.size(); i++) {
                ans[i * 2] = posList.get(i);
                ans[i * 2 + 1] = negList.get(i);
            }

            int index = negList.size() * 2;

            for (int i = negList.size(); i < posList.size(); i++) {
                ans[index++] = posList.get(i);
            }
        } else {
            if (negList.size() > posList.size()) {
                for (int j = 0; j < posList.size(); j++) {
                    ans[2 * j] = posList.get(j);
                    ans[2 * j + 1] = negList.get(j);
                }
                int index = posList.size() * 2;

                for (int i = posList.size(); i < negList.size(); i++) {
                    ans[index++] = negList.get(i);
                }
            }
        }
        return ans;
    }

}
