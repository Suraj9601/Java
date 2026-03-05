import java.util.Scanner;

public class MultiplicationTableRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        printTable(num, 1);
    }

        static void printTable(int num, int i) {
        if (i > 10) {
            return;
        }
        System.out.println(num + " x " + i + " = " + (num * i));
        printTable(num, i + 1);
    }
}