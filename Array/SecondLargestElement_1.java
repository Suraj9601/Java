public class SecondLargestElement_1 {
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
        System.out.println("Second Largest element : " + secMax);
    }
}
