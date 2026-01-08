import java.util.*;

class Array_Leaders {

    public static ArrayList<Integer> findLeader(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();

        int n = arr.length;

        int soFarmax = arr[n - 1];
        list.add(soFarmax);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= soFarmax) {
                soFarmax = arr[i];
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        return list;
    }
}