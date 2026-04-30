import java.util.ArrayList;

public class MedianOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, 5 };
        int[] arr2 = { 3 , 6};

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0, j = 0;

        // Merge
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                list.add(arr1[i]);
                i++;
            } else {
                list.add(arr2[j]);
                j++;
            }
        }

        while (i < arr1.length) {
            list.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            list.add(arr2[j]);
            j++;
        }

        System.out.println("Merged: " + list);

        int n = list.size();

        if (n % 2 == 0) {
            double median = (list.get(n / 2) + list.get((n / 2) - 1)) / 2.0;
            System.out.println("Median: " + median);
        } else {
            int mid = n / 2;
            System.out.println("Median: " + list.get(mid));
        }
    }
}