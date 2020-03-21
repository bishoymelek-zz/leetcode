import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        Solution.fizzBuzz(15);
    }

    static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 == 0 && i % 5 == 0) {
                    list.add("FizzBuzz");
                } else if (i % 3 == 0) {
                    list.add("Fizz");
                } else if (i % 5 == 0) {
                    list.add("Buzz");
                }
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
