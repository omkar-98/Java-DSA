public class ConsecutiveOnes {

    static int consecutiveones(int[] arr) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++; // if we found 1 then we increase counter by 1

                if (max <= count) { // if our counter >= max 
                    max = count; // our max will take count 
                }
            } 
            else {
                count = 0;  // if we found the 0 while iterating count initializes to 0 , and mmax has the previous count value
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1,1,1,1,1,1 };
        System.out.println(consecutiveones(arr));
    }
}
