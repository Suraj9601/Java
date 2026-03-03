import java.util.HashMap;
import java.util.Map;

public class OccurrencesOfCharacters {
    public static void main(String[] args) {
        String str = "Hello";
        occurrence(str);
    }

    static void occurrence(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char s : str.toCharArray()) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        System.out.println(map);
    }
}
