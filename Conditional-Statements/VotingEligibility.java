// Check eligibility for voting

import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        sc.close();

        String voting = (age>=18) ?
        "Eligible For voting" : 
        "Not eligible for voting";

        System.out.println(voting);
    }
}
