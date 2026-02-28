public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(revese(str));
    }

    static String revese(String str){
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
}
