
class Calculator {

    // Method with two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method with three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double values
    double add(double a, double b) {
        return a + b;
    }

    // Method with different parameter order
    double add(int a, double b) {
        return a + b;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Add (2, 3): " + c.add(2, 3));
        System.out.println("Add (5, 6, 7): " + c.add(5, 6, 7));
        System.out.println("Add (2.5, 4.6): " + c.add(2.5, 4.6));
        System.out.println("Add (10, 5.5): " + c.add(10, 5.5));
    }
}
