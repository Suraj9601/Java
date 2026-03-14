import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 5, 7 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int si = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[si]) {
                    si = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[si];
            arr[si] = temp;
        }
    }
}
