import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element "+ (i+1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array (before swap): " + Arrays.toString(arr));
        swap(arr, 0, 3);
        System.out.println("Array (after swap): " + Arrays.toString(arr));
        sc.close();
    }

    static void swap(int[] arr, int idx1, int idx2) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = temp;
        }
    }
}