
class Person {
    String name;
    int age;

    Person() {
        name = "Unknown";
        age = 18;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Hemanth", 20);

        System.out.println("Default Constructor: " + p1.name + ", " + p1.age);
        System.out.println("Parameterized Constructor: " + p2.name + ", " + p2.age);
    }
}
