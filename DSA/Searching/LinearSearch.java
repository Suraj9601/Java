import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array : "+Arrays.toString(arr));
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        System.out.println("index of target : "+linearSearch(arr,target));
        sc.close();
    }

    static int linearSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
