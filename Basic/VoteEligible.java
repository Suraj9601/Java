import java.util.Scanner;

class VoteEligible {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(age>= 18){
            System.out.println("Eligible for Vote.");
        } else {
            System.out.println("Not Eligible for Vote.");
        }

        sc.close();
    }
}