public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 40, 45, 50, 68, 70, 85 };
        System.out.println(binarySearch(arr, 50, 0, arr.length - 1));
    }

    static int binarySearch(int[] arr, int target, int left, int right) {
        int mid = left + (right - left) / 2;
        if (target == arr[mid]) {
            return mid;
        } else if (target > arr[mid]) {
            return binarySearch(arr, target, mid + 1, right);
        } else {
            return binarySearch(arr, target, left, mid - 1);
        }
    }
}