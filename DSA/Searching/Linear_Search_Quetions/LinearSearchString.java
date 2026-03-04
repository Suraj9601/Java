// Return character index in string.
public class LinearSearchString {
    public static void main(String[] args) {
        String str = "Suraj";
        char target = 'a';
        System.out.println("Index of target : "+linearSearch(str, target));
    }
    static int linearSearch(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
    
}
