import java.util.Scanner;

public class VowelsAndConsonantsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        sc.close();
        countVowelsAndConsonants(str);
    }

    static void countVowelsAndConsonants(String str) {
        // vowels -> a e i o u
        str = str.toLowerCase();
        int vowels = 0, consonants = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch)!= -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels count : "+vowels);
        System.out.println("Consonants count : "+consonants);
    }
}
