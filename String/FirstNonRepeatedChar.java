public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "aanana";
        findChar(str);
    }

    static void findChar(String str) {
        char[] charArr = str.toCharArray();
        int i =0;
        int j = 0;
        
        while (i<j) {
            if (charArr[i] == charArr[j]) {
                System.out.println(charArr[i]);
                break;
            }
        }
    }
}
