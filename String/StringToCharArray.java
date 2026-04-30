import java.util.Arrays;
public class StringToCharArray {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(Arrays.toString(convert(str)));
    }

    static char[] convert(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }
}