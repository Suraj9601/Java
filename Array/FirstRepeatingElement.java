import java.util.HashSet;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 3, 2, 6 };
        repeatingElement(arr);
    }

    static void repeatingElement(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("First repeated element : " + num);
                return;
            }
            set.add(num);
        }
        System.out.println("No repeating element in array.");
    }
}