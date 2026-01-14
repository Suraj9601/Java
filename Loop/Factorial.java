import java.util.Scanner;

class Factorial {

    static void factorialFind() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int fact = 1;

        for(int i=1; i<=num; i++) {
            fact*=i;
        }
        System.out.println(fact);

    }
    public static void main(String[] args) {

        factorialFind();

    }
}