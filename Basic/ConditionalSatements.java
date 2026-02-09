class ConditionalSatements {
    public static void main(String[] args) {
        int num = 10;

        // if statement
        if (num > 5) {
            System.out.println("if statement.");
        }

        // if else statement
        if (num < 5) {
            System.out.println("if statement.");
        } else {
            System.out.println("else statement");
        }

        // else if statement
        if (num % 2 == 0) {
            System.out.println(num + " is Even Number");
        } else if (num % 2 != 0) {
            System.out.println(num + " is Odd Number.");
        } else if (num == 0) {
            System.out.println(num + " is Zero");
        } else {
            System.out.println("Invalid number.");
        }

        // Ternory Operator
        int a = 10;
        int b = 15;
        int maxNo = (a > b) ? a : b;
        System.out.println(maxNo);

        // switch statement
        System.out.println("1. Adition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int option = 1;

        switch (option) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            default:
                System.out.println("Please enter valid option (1 to 4).");
                break;
        }

    }
}