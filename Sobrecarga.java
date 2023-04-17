// Consiste em utilizar nomes idênticos em vários métodos, contanto que haja diferença nos argumentos
public class Sobrecarga {
    static int Metodo(int Numero) {
        return Numero * 2;
    }

    static float Metodo(float Numero) {
        return Numero * 2;
    }

    public static void main(String[] args) {
        System.out.println(Metodo(5));
        System.out.println(Metodo(1.5f));
    }
}
