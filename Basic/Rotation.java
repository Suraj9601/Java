import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 0, 5, 0 };
        int d = 2;
        d = d % arr.length;

        // reverse(arr, 0,d-1);
        // reverse(arr, d, arr.length-1);  // left rotation
        // reverse(arr, 0, arr.length - 1);

        reverse(arr,arr.length-d,arr.length-1);
        reverse(arr, 0, d);  // right rotation
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
