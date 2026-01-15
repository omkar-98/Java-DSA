import java.util.ArrayList;
import java.util.List;

public class FIZZBUZZ {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = fizzBuzz(15);
        System.out.println(list);
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add(i, "FizzBuzz");
            }
            else if (i % 3 == 0) {
                list.add(i, "Fizz");
            } else if (i % 5 == 0) {
                list.add(i, "Buzz");
            } else {
                list.add(i, "" + i);
            }
        }

        return list;
    }
}
