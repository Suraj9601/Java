import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        String str = "banana";
        duplicates(str);
    }

    static void duplicates(String str) {
        Set<Character> set = new HashSet<>();
        Set<Character> result = new HashSet<>();
        for(char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                result.add(ch);
            } else {
                set.add(ch);
            }
        }
        System.out.println(result);
    }
}
