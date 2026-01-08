public class FindFirstAndLastElementIndex {
    public static void main(String[] args) {
        int arr[] = {3,1};
        int ans[] = searchRange(arr, 1);
        System.out.println(java.util.Arrays.toString(ans));
    }

     public static int[] searchRange(int[] arr, int target) {
        int ans[] = new int[2];
        if (arr.length == 0) {
            ans[0] = -1;
            ans[1]=-1;
            return ans;
        }
         else if (arr.length == 1 && arr[0] == target) {
            ans[0] = 0;
            ans[1] = 0;
            return ans;
        }

        // if(arr.length == 2){
        //     if(arr[0] == target ){
        //         ans[0]=arr[];
        //         ans[1]=
        //     }
        // }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
            if (count == 1) {
                ans[0] = i;
                ans[1]=i;
            }
            if (count == 2) {
                ans[1] = i;
                break;
            }
        }
        if (count == 0 ) {
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        return ans;
    }
}
