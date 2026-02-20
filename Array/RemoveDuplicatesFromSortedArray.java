import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,5,5,7,8};
        int[] realArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(realArr[i]<arr[i]) {
                realArr[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(realArr));
    }
}
