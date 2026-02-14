import java.util.Scanner;
class VoteEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Eligible for Voting.");
        } else {
            System.out.println("Not eligible for Voting!");
            System.out.println("Your are eligible after 18 for voting.");
        }
        sc.close();
    }
}