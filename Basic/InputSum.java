import java.util.Scanner;

public class InputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter number : ");
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum+=num;
        }
        System.out.print(sum);
        sc.close();
    }
}