import java.util.*;

public class InterSectionOfArray {
    // public static List<Integer> findArrayIntersection(List<Integer> list1, int n,
    // List<Integer>list2, int m) {
    // List<Integer> ans = new ArrayList<>();
    // int[] vis = new int[m];

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // if (list1.get(i).equals(list2.get(j)) && vis[j] == 0) {
    // ans.add(list1.get(i));
    // vis[j] = 1;
    // break;
    // }
    // if (list2.get(j) > list1.get(i)) break ;
    // }
    // }

    // return ans;
    // }








    // ******************************* OPTIMAL SOLUTION ************************


    static List<Integer> interection(List<Integer> list1, List<Integer> list2) {

        int n = list1.size();
        int m = list2.size();

        List<Integer> answer = new ArrayList<>();

        int ptr1 = 0;
        int ptr2 = 0;

        if (n == 0 || m == 0)
            return answer;

        while (ptr1 < n && ptr2 < m) { // if any ptr get end of the array then exit cause no use of check intersection

            int a = list1.get(ptr1); // store list index value into a integer variable
            int b = list1.get(ptr2);
            if (a <= b) {

                if (a == b) { // if a=4 b=4 --->
                    answer.add(a); // add (a)
                    ptr1++; // move next place
                    ptr2++;// move to next place
                } else if (a < b) { // if a=4 and b=5 then ptr1++     , here a and b  stores value not index
                    ptr1++;// move a ptr next place
                }
            } else {
                ptr2++; // if a=5 and b=3 then move ptr forward
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 6);
        List<Integer> B = Arrays.asList(2, 2, 3, 3, 4, 5, 6);

        List<Integer> result = interection(A, B);

        System.out.println(result); // Output: [2, 2, 4]
    }
}
