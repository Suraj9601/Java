public class SortWords {
    public static void main(String[] args) {
        String str = "Hi my name is Suraj";
        System.out.println(sorWordInString(str));
    }

    static String[] sorWordInString(String str) {
        String[] words = str.toLowerCase().split(" ");
        
        
        return words;
    }
}
