import java.util.Scanner;

class PrimeNoCheck {

    static void primeCheck(int num){
        if(num<=1){
            System.out.println("Not Prime");
            return;
        }
        boolean isPrime = true;

        for (int i = 2; i<= Math.sqrt(num); i++) {
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        primeCheck(num);
        sc.close();
    }

}