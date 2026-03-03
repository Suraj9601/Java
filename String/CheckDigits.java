public class CheckDigits {
    public static void main(String[] args) {
        String str = "Sur4j";
        check(str);
    }   

    static void check(String str) {
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                System.out.println("String contain digit.");
                break;
            } else {
                System.out.println("Digit not found");
                break;
            }
        }
    }
}
