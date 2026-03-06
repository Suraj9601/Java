import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,2,1,4,7,3};
        duplicates(arr);
    }

    static void duplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int  i : arr) {
            set.add(i);
        }
        System.out.println(set);
    }
}
