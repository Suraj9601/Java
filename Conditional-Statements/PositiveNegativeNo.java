// Check whether a number is positive, negative, or zero

import java.util.Scanner;
public class PositiveNegativeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        sc.close();

        if (num == 0) {
            System.out.println("Entered number is Zero.");
        } else if (num > 0) {
            System.out.println("Entered number id positve.");
        } else if (num < 0) {
            System.out.println("Entered number is negative.");
        } else {
            System.out.println("Please enter valid number.");
        }
    }
}