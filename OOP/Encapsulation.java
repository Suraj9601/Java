class Person {
    private String name = "Suraj";
    private int age = 19;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("Name : "+p1.getName());
        System.out.println("Age: " +p1.getAge());
        
    }
}