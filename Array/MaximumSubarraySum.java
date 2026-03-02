import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 3, 2, 6,3 };
        maxSum(arr);
    }

    static void maxSum(int[] arr) {
        int f = 0;
        int s = 1;
        List<Integer> list = new ArrayList<>();
        while (s<arr.length) {
            int sum = arr[f]+arr[s];
            list.add(sum);
            f+=2;
            s+=2;
        }
        System.out.println(Collections.max(list));
        
    }
}
