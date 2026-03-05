import java.util.Scanner;

public class NFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Factorial of " + n + " : " + findFactorial(n));
    }

    static int findFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }
}
