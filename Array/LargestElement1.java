public class LargestElement1 {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 25, 10, 8, 23, 7 };
        int result = 0;

        for (int ele : arr) {
            if (result < ele) {
                result = ele;
            }
        }
        System.out.println("Largest element : " + result);
    }
}
