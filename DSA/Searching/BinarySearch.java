import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 10, 15, 20, 28, 37, 51, 74, 88, 91 };
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        sc.close();
        System.out.println("Index : " + binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                st = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
