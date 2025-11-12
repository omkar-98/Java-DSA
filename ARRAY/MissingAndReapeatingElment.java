import java.util.*;

public class MissingAndReapeatingElment {
    public static void main(String[] args) {
        int arr[][] = { { 9, 7, 1 }, { 8, 9, 2 }, { 3, 4, 6 } };

        int[] ans = missingReapeatedEl(arr);
        System.out.println(Arrays.toString(ans));
    }

    // public static int[] missingReapeatedEl(int[][] arr) {
    //     Map<Integer, Integer> map = new HashMap<>();
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr[i].length; j++) {
    //             map.put(arr[i][j], map.getOrDefault(arr[i][j], 0) + 1);
    //         }
    //     }

    //     for (int key : map.keySet()) {
    //         if (map.get(key) > 1) {
    //             arr[0][0] = key;
    //         }
    //     }

    //     for (int i = 1; i <= 9; i++) {
    //         if (!map.containsKey(i)) {
    //             arr[0][1] = i;
    //         }
    //     }
    //     return new int[] { arr[0][0], arr[0][1] };
    // }



    public static int[] missingReapeatedEl(int grid[][]){
        int n = grid.length;
        int freq [] =new int[n*n +1];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int num = grid[i][j];
                if(freq[num] ==0){
                    freq[num] = num;
                }else{
                    grid[0][0] = num;
                }
            }
        }

        for (int i = 1; i < freq.length; i++) {
            if(freq[i] == 0){
                grid[0][1] = i;
            }
        }
        return new int[] {grid[0][0] , grid[0][1]};
    }
}
