import java.util.ArrayList;
import java.util.Arrays;

public class AddMissingNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 6, 10));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == i + 1) {
                System.out.println((list.get(i)) + " = " + (i + 1));
            } else {
                list.add(i, i + 1);
                i--;
            }
        }
    }
}
