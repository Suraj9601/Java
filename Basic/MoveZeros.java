import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 0, 5, 0 };
        int d=2;
        d= d%arr.length;
        // int idx = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] != 0 ) {
        // arr[idx++] = arr[i];
        // }
        // }
        // for (int i = idx; i < arr.length; i++) {
        // arr[idx] = 0;
        // }

        // System.out.println(Arrays.toString(arr));
        // sortArr(arr);
        // System.out.println(Arrays.toString(arr));

        // secMax(arr);
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr,int left,int right) {
        
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
             left++;      
            right--;
        }

    }
    static void sortArr(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
    }

    static void minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

    static void secMax(int[] arr) {
        int max = arr[0];
        int secMax = arr[0];

        for (int i : arr) {
            if (max < i) {
                 secMax = max;
                 max = i;
               
            }
            if (max >i && secMax < i) {
                secMax = i;
            }
        }
        System.out.println(secMax);
    }
}
