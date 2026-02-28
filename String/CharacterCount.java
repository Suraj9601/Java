public class CharacterCount {
    public static void main(String[] args) {
        String str = "banana";
        char target = 'b';
        System.out.println(count(str, target));
    }

    static int count(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)== target) {
                count++;
            }
        }
        return count;
    }
}
