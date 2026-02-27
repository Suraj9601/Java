import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enetr array element :" );
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array : "+ Arrays.toString(arr));
        int left = 0;
        int right = arr.length - 1;

        while (left<right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed array : "+Arrays.toString(arr));
        sc.close();
    }
}