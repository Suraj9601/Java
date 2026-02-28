import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "1@1.";
        String str2 = "1@1.";
        System.out.println(anagramsCheck(str1, str2));
    }

    static boolean anagramsCheck(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        return Arrays.equals(charArr1, charArr2);
    }
}
