// Check whether a year is a leap year

import java.util.Scanner;

public class LeafYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        sc.close();

        if (year % 4 == 0) {
            System.out.println("Entered year is leaf year.");
        } else {
            System.out.println("Entered year is not leaf year.");
        }
    }
}
