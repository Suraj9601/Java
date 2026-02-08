class Operators {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        int c= 15;
        int d = 5;

        // Arithmetic Operators
        System.out.println("======= Arithmetic Operators =========");
        System.out.println("Sum: "+(a+b));
        System.out.println("Sub: "+(a-b));
        System.out.println("Multi: "+(a*b));
        System.out.println("Division"+(a/b));
        System.out.println("Reminder: "+(a%b));

        //Relational Operator
        System.out.println("======= Relational Operators =========");
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a=b);

        //Logical Operator
        System.out.println("======= Logical Operators =========");
        boolean result1 = a > b && c < d;
        System.out.println(result1);

        boolean result2 = a < b || c < d;
        System.out.println(result2);

        boolean result3 = a > b;
        System.out.println(!result3);
    }
}