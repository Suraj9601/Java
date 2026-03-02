import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 2, 2, 3, 2, 6 };
        nonRepeatingElement(arr);
    }

    static void nonRepeatingElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int num : arr) {
            if (map.get(num) == 1) {
                System.out.println("First non repeating element : "+num);
                return;
            }
        }
    }
}