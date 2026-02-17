
import java.util.Arrays;
import java.util.Scanner;

public class PositiveNegativeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter num " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array : " + Arrays.toString(arr));

        int pCount = 0;
        int nCount = 0;
        for (int num : arr) {
            if (num > 0) {
                pCount++;
            } else if (num < 0) {
                nCount++;
            }
        }
        System.out.println("Positive No. count : " + pCount);
        System.out.println("Negative No. count : " + nCount);

        sc.close();
    }
}
