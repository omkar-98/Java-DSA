public class ContainerWithMostWater {
    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int result = getMostWater(height);
        System.out.println(result);

    }
// ************* Brute force Approach ****************

    // public static int getMostWater(int[] height) {
    //     int maxWater = 0;
    //     for (int i = 0; i < height.length; i++) {

    //         for (int j = i + 1; j < height.length; j++) {

    //             // we are taking this for finding the width ;
    //             int width = j - i;

    //             // the height is the value of the element at that index , and we want minimum
    //             // value index
    //             // cause if we take a max value element our water can overflow so find the low
    //             // index

    //             int ht = height[i] < height[j] ? height[i] : height[j];

    //             // we are calculating the area , beacause the minimum " height element * longest
    //             // width " generate area
    //             int currWater = width * ht;

    //             // we are comparing our previous maxWater level withh the currWater , if currWater
    //             // is greater
    //             // our maxWater will take it .
    //             maxWater = maxWater > currWater ? maxWater : currWater;
    //         }
    //     }
    //     return maxWater;
    // }



    // ********* Optimal Apprach ----> TWO pOinter ******************


    public static int getMostWater(int height[]){
        int maxWater = 0;



        return maxWater;
    }
}
