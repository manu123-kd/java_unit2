
public class Strings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("World");

        System.out.println("Concat: " + s1 + " " + s2);

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println("StringBuilder Result: " + sb);
    }
}
