public class StringRotation {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "bcda";
        System.out.println(rotation(str1, str2));
    }

    static boolean rotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String temp = str1 + str1;
        return temp.contains(str2);
    }
}
