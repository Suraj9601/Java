import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {2,0,5,0,1,0};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZero(int[] arr) {
        int insertPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[insertPos] = arr[i];
                insertPos++;
            }
        }

        while (insertPos < arr.length) {
            arr[insertPos] = 0;
            insertPos++;
        }
    }
}