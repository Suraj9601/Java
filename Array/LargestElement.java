import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        
        // Method - 1 (Logic-1)
        int arr[] = { 2, 5, 1, 25, 10, 8, 23, 7 };
        System.out.println("Array = " + Arrays.toString(arr));
        int max = arr[0];
        for(int ele:arr){
            if(max<ele) {
                max = ele;
            }
        }

        System.out.println("Largest element (Method-1) : " + max);

        // Method - 2 (Logic-2)
        Arrays.sort(arr);
        System.out.println("Largest element (Method-2) : " + arr[arr.length-1]);
    }
}
