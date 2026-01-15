import java.util.*;

// public class ConsecutiveLOngestSequennce {

//     public int longestConsecutive(int[] nums) {
//         int sequence = -1;

//         Map<Integer, Boolean> map = new HashMap<>();

//         for (int val : nums) {
//             map.put(val, true);
//         }

//         for (int val : nums) {
//             if (map.containsKey(val - 1)) {
//                 map.put(val, false);
//             }
//         }

//         int maxStartPoint = 0;
//         int maxLength = 0;

//         for (int val : nums) {
//             if (map.get(val) == true) {
//                 int tempLength = 1;
//                 int tempStartPoint = val;

//                 while (map.containsKey(val + tempLength)) {
//                     tempLength++;
//                 }

//                 if (tempLength > maxLength) {
//                     maxLength = tempLength;
//                 }
//             }
//         }
//         return maxLength;
//     }
// }

class ConsecutiveLOngestSequennce {

    public int longestConsecutive(int[] nums) {

        if (nums.length == 0)
            return 0;

        Set<Integer> set = new HashSet<>();

        for (int value : nums) {
            set.add(value);
        }
        int maxLength = 1;

        for (int value : nums) {
            if (!set.contains(value - 1)) {

                int currentStart = value;
                int count = 1;

                while (set.contains(value + 1)) {
                    currentStart += 1;
                    count += 1;
                }

                maxLength = Math.max(count, maxLength);
            }
        }
        return maxLength;
    }
}