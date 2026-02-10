// Check whether a number is even or odd

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the the number : ");
        int num = sc.nextInt();
        sc.close();

        if(num%2==0) {
            System.out.println("Number is Even.");
        } else {
            System.out.println("Number is Odd.");
        }
    }
}
