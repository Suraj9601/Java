import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VowelsCount {
    public static void main(String[] args) {
        String str = "suraj";
        System.out.println(countVowels(str));
    }

    static Map<Character, Integer> countVowels(String str) {
        // vowels -> a e i o u
        str = str.toLowerCase();
        Set<Character> vowels = Set.of('a','e','i','o','u');
        Map<Character, Integer> count = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (vowels.contains(ch)) {
                count.put(ch, count.getOrDefault(ch, 0)+1);
            }
        }
        return count;
    }
}
