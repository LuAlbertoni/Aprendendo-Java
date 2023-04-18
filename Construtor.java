// Construtor é um método especial que é chamado quando um objeto é criado
public class Construtor {
    int x;
    int z;
    final int fixo = 5; // "final" significa que o valor não pode ser alterado

    // Cria um construtor para a classe Construtor | Para atributos, métodos e construtores: "public" significa que qualquer classe pode acessar | "private" significa que apenas a classe que o contém pode acessar | "protected" significa que apenas a classe que o contém e as classes que herdam dela podem acessar | "default" significa que apenas classes do mesmo pacote podem acessar
    public Construtor(int y) {
        x = 5; // Define o valor inicial para a variável x
        z = y;
    }

    public static void main(String[] args) {
        Construtor objeto = new Construtor(1); // Cria um objeto da classe Construtor (Isso chama o construtor)

        System.out.println(objeto.x);
        System.out.println(objeto.z);
    }
}