import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
        sc.close();
    }

    static void mergeSort(int[] arr, int st, int end) {
        if (st < end) {
            int mid = st + (end - st) / 2;
            mergeSort(arr, st, mid); // left part
            mergeSort(arr, mid + 1, end); // right part
            merge(arr, st, mid, end);
        }
    }

    static void merge(int arr[], int st, int mid, int end) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = st, j = mid + 1;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                list.add(arr[i]);
                i++;
            } else {
                list.add(arr[j]);
                j++;
            }
        }
        while (i <= mid) {
            list.add(arr[i]);
            i++;
        }
        while (j <= end) {
            list.add(arr[j]);
            j++;
        }

        for (int k = 0; k < list.size(); k++) {
            arr[st + k] = list.get(k);
        }
    }
}
