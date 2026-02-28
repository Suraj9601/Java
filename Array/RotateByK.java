import java.util.Arrays;

public class RotateByK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(arr, 4);
        System.out.println(Arrays.toString(arr));
    }


    static void rotate(int[] arr, int k){
        reverse(arr);
        int left = k;
        int right = arr.length-1;

        while (left<right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length -1;

        while (left<right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}



    // static int rotate(int[] arr, int k) {
    //     int left = 0;
    //     int right = arr.length - 1;

    //     for (int i = 0; i < k; i++) {
    //         int temp = arr[left];
    //         arr[left] = arr[right];
    //         arr[right] = temp;
    //         left++;
    //         right--;
    //     }
    //     return arr.length - k;
    // }