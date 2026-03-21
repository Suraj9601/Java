import java.util.Arrays;

public class RotationByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotate(arr, 1);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int left,int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        // [1,2,3,4,5] -> Right Rpotate by 2
        // 1. -> [5,1,2,3,4]
        // 2. -> [4,5,1,2,3]
        reverse(arr, k, n-1);
        reverse(arr, 0, k);
        reverse(arr, 0, n-1);
    }
}
