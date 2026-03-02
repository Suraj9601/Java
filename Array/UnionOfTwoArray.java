import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,4,2,5,7,3,6};
        int[] arr2 = {3,1,6,3,9,5};
        union(arr1, arr2);
    }

    static void union(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        for (int j : arr2) {
            set.add(j);
        }
        System.out.println(set);
    }
}
