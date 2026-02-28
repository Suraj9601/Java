public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "banana";
        System.out.println(findChar(str));
    }

    static char findChar(String str) {
        char[] charArr = str.toCharArray();
        int i =0;
        
        for(int j=1; j<charArr.length; j++){
            if (charArr[i] != charArr[j]) {
                return charArr[i];
            }
        }
        return charArr[i]  ;
    }
}
