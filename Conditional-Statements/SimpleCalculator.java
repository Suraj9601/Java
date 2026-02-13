// Simple calculator using switch case

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println( "1. Addition \n2. Substraction \n3. Multiplication \n4. Division \n5. Find reminder\n ");
        System.out.println();
        System.out.print("Enter the option : ");
        int option = sc.nextInt();

        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        sc.close();

        switch (option) {
            case 1 -> System.out.println(a + "+" + b );
            
            case 2 -> System.out.println(a+"-"+b);
                
        }
    }
}
