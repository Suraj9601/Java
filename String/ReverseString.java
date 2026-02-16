public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reveseUsingCharArr());
        System.out.println(reverseInBuiltMethod());
        System.out.println(reverseUsingLoop());
    }

    static String reveseUsingCharArr(){
        String str = "hello";
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        String reversed = new String(chars);
        return reversed;
    }

    static StringBuffer reverseInBuiltMethod() {
        StringBuffer sb = new StringBuffer("suraj");
        sb.reverse();
        return sb;
    }

    static StringBuffer reverseUsingLoop() {
        StringBuffer sb = new StringBuffer("Hi");
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