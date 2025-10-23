import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FindDuplicates {

    // USING EXTRA ARRAY

    // static int[] findDuplicate(int arr[]) {
    // int index = 0;
    // int nArr[] = new int[arr.length];
    // for (int i = 0; i < arr.length; i++) {

    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] == arr[j]) {
    // nArr[index++] = arr[i];
    // break;

    // }
    // }
    // }
    // return nArr;
    // }

    /*
     * // using Arraylist
     * 
     * static ArrayList<Integer> findDuplicate(int arr[]) {
     * int n = arr.length;
     * ArrayList<Integer> list = new ArrayList<>();
     * 
     * for (int i = 0; i < n; i++) {
     * int index = arr[i] % n;
     * arr[index] += n;
     * }
     * 
     * for (int i = 0; i < n; i++) {
     * if ((arr[i] / n) >= 2) {
     * list.add(i);
     * }
     * }
     * if (list.size() == 0) {
     * list.add(-1);
     * return list;
     * }
     * return list;
     * }
     * 
     * 
     */

    // USing TreeMap

    // public static ArrayList<Integer> findDuplicate(int arr[]){

    // ArrayList <Integer> list = new ArrayList<>();
    // Map<Integer,Integer>map = new TreeMap<>();

    // for (int i : arr) {
    // if(map.containsKey(i)){
    // map.put(i,map.get(i)+1);
    // }else{
    // map.put(i,i);
    // }
    // }

    // for(Map.Entry<Integer,Integer> entry : map.entrySet()){
    // if(entry.getValue() > 1){
    // list.add(entry.getKey());
    // }
    // }
    // if(list.isEmpty()){
    // list.add(-1);
    // }
    // return list;
    // }

    public static ArrayList<Integer> findDuplicate(int arr[]) {
        Map<Integer, Integer> map = new TreeMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() > 1) {
                list.add(entry.getKey());
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
            return list;
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = findDuplicate(new int[] { 1, 2, 1, 3, 3, 4, 5, 5, 4 });
        System.out.println(list + " arr comes more than 1 times");
    }
}
