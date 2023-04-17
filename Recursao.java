// Consiste em uma função chamar a si própria
public class Recursao {
    public static void main(String[] args) {
        System.out.println(calc(3));
    }

    public static int calc(int i) {
        if (i > 0) {
            return i + calc(i - 1);
        } else {
            return 0;
        }
    }
}
