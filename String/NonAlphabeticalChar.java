public class NonAlphabeticalChar {
    public static void main(String[] args) {
        String str = "Hell0";
        System.out.println(check(str));
    }

    static StringBuilder check(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!Character.isAlphabetic(ch)) {
                sb.append(ch);
            }
        }
        return sb;
    }
}
