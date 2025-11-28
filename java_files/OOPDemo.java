
interface AnimalSound {
    void sound();
}

class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal implements AnimalSound {
    public void sound() {
        System.out.println("Dog Barks!");
    }
}

public class OOPDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();

        AnimalSound obj = new Dog();
        obj.sound();
    }
}
