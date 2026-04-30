public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1243;
        System.out.println(num % 10);
        int temp = num % 10;
        System.out.println(num / 10 + temp);
    }
}