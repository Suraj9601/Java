import java.util.Arrays;

public class LargestElement2 {
    public static void main(String[] args) {
        int[] arr = {4,2,7,5,9,12,4,10};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
