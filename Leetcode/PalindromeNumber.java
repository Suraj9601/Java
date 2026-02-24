import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        sc.close();
        System.out.println(palindromeChecker(x));
        
    }

    static boolean palindromeChecker(int x){
        int n = x;
        int reverse_x = 0;
        if(x<0){
            return false;
        }
        while (x>0) {
            int last_d = x%10;
            x = x/ 10;
            reverse_x = reverse_x * 10 + last_d;
        }
        return reverse_x == n;
    }
}
