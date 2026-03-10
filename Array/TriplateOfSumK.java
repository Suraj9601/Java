import java.util.Arrays;

public class TriplateOfSumK {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 7, 2, 3,0, 6, 9, 5};
        int target = 1;

        findTriplate(arr, target);
    }

    static void findTriplate(int[] arr, int target) {
        Arrays.sort(arr);
        boolean found = false;

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);
                    found = true;
                    left++;
                    right--;
                }
                else if (sum > target) {
                    right--;
                }
                else {
                    left++;
                }
            }
        }
        if (!found) {
            System.out.println("Triplate Not found");
        }
    }
}