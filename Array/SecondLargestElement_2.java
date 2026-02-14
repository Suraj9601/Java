import java.util.Arrays;

public class SecondLargestElement_2 {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 6, 3, 5, 1, 8 };
        Arrays.sort(arr);
        System.out.println("Second Largest element : " + arr[arr.length-2]);
    }
}
