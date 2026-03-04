
public class SearchLastOccurrenceIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 8, 2, 4, 9, 1 };
        int target = 1;
        System.out.println("Last Index : " + linearSearch(arr, target));
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = arr.length-1; i >= 0; i--) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
