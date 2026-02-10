// Grade calculator based on marks

import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();
        sc.close();

        if (marks >= 0 && marks <= 100) {
            if (marks > 90) {
                System.out.println("Your marks grade is Outstanding (O).");
            } else if (marks > 80) {
                System.out.println("Your marks grade is Excellent (A+).");
            } else if (marks > 70) {
                System.out.println("Your marks grade is A.");
            } else if (marks > 60) {
                System.out.println("Your marks grade is B+.");
            } else if (marks > 50) {
                System.out.println("Your marks grade is B.");
            } else if (marks > 40) {
                System.out.println("Your marks grade is Pass (P).");
            } else {
                System.out.println("Your marks grade is Fail (F).");
            }
        } else {
            System.out.println("Please enter valid marks.");
        }
    }
}
