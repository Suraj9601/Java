import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        
        // Method - 1 (Logic-1)
        int arr[] = { 2, 5, 1, 25, 10, 8, 23, 7 };
        int max = arr[0];
        for(int ele:arr){
            if(max<ele) {
                max = ele;
            }
        }
        System.out.println("Largest element : " + max);

        // Method - 2 (Logic-2)
        int[] arr1 = {4,2,7,5,9,12,4,10};
        Arrays.sort(arr1);
        System.out.println("Largest element : " + arr1[arr1.length-1]);
    }
}
