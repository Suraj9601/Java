import java.util.Scanner;

class PrintNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting range : ");
        int st = sc.nextInt();
        System.out.print("Enter the ending range : ");
        int end = sc.nextInt();

        for(int i=st; i<=end; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}