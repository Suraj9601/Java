import java.util.Arrays;

public class LargestElement2 {
    public static void main(String[] args) {
        int[] arr = {4,2,7,5,9,2,4,8};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
