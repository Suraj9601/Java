import java.util.Scanner;
class PrimeNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        if(num<=1) {
            System.out.println("Not Prime");
        }
        boolean isPrime = true;

        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i==0) {
                isPrime = false;
            }
        }

        if(isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

    }
}