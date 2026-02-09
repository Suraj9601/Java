import java.util.Scanner;
class GreatestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value  : ");
        int a = sc.nextInt();
        System.out.print("Enter second value : ");
        int b = sc.nextInt();
        System.out.print("Enter third value : ");
        int c = sc.nextInt();
        sc.close();

        if(a>b && a>c) {
            System.out.println(a + " is greater.");
        } else if (b>a && b > c) {
            System.out.println(b + " is greater.");
        } else {
            System.out.println(c + " is greater.");
        }
    }
}