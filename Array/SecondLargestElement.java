public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = { 8, 4, 6, 2, 3, 9, 5, 10 };
        int max = arr[0];
        int secMax = arr[arr.length-1];

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
