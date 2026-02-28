public class InPlaceReverseString {
    public static void main(String[] args) {
        String str = "Suraj";
        System.out.println(reverse(str));
    }

    static StringBuilder reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        int left = 0;
        int right = sb.length() - 1;

        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);

            left++;
            right--;
        }
        return sb;
    }
}
