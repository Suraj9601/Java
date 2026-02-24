public class ReverseInteger {
    public static void main(String[] args) {
        int x = 273;
        System.out.println(reverseInt(x));
    }

    static int reverseInt(int x) {

        int reverse_x = 0;
        while (x > 0 || x < 0) {
            int temp = x % 10;
            x = x / 10;
            reverse_x = reverse_x * 10 + temp;
        }
        return reverse_x;
    }
}
