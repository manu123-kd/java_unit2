
import java.util.Vector;

public class VectorWrapperDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);

        System.out.println("Vector Elements: " + v);

        int num = Integer.parseInt("100"); // Wrapper
        System.out.println("Parsed Integer: " + num);
    }
}
