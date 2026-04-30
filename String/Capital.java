public class Capital {
    public static void main(String[] args) {
        String str = "HELLO";
        System.out.println(check(str));
    }

    static boolean check(String str) {
        if (str.equals(str.toLowerCase()) || str.equals(str.toUpperCase())) {
            return true;
        }

        char ch = str.charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            return true;
        }

        return false;

    }
}
