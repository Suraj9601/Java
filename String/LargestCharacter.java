public class LargestCharacter {
    public static void main(String[] args) {
        String str = "AB";
        int idx = findLargest(str);
        System.out.println("Largest character : "+ str.charAt(idx));
    }

    static int findLargest(String str) {
        str = str.toLowerCase();
        int maxChar = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(maxChar) < str.charAt(i)) {
                maxChar = i;
            }
        }
        return maxChar;
    }
}
