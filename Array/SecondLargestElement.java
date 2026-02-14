import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = { 8, 4, 6, 2, 3, 9, 5, 10 };
        int max = arr[0];
        int secMax = Integer.MIN_VALUE;

        for (int ele : arr) {
            if (max < ele) {
                secMax = max;
                max = ele;
            } else if (secMax < ele && ele != max) {
                secMax = ele;
            }
        }
        System.out.println("Second Largest element (method-1) : " + secMax);

        int arr2[] = { 2, 5, 7, 6, 3, 5, 1, 8 };
        Arrays.sort(arr2);
        System.out.println("Second Largest element (method-2) : " + arr2[arr2.length-2]);
    }
}
