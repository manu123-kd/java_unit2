
class Demo {
    public int pub = 10;
    private int pri = 20;
    protected int pro = 30;
    int def = 40;

    void showPrivate() {
        System.out.println("Private Variable: " + pri);
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println("Public: " + obj.pub);
        System.out.println("Protected: " + obj.pro);
        System.out.println("Default: " + obj.def);
        obj.showPrivate();
    }
}
