public class LongestWord {
    public static void main(String[] args) {
        String str = "My name is Suraj Aglave";
        System.out.println(findLongestWord(str));
    }

    static String findLongestWord(String str) {
        String[] words = str.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}