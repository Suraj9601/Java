import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        //Common/Same elements from both arrays
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,6};
        intersection(arr1, arr2);
    }

    static void intersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        for (int j : arr2) {
            if (set.contains(j)) {
                result.add(j);
            }
        }
        System.out.println(result);
    }
}
