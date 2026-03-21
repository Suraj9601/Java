public class Median {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(median(arr));
    }

    static int median(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int left = 0;
        int right = arr.length - 1;
        int mid = left + right / 2;
        return arr[mid];
    }
}
