public class Variaveis {
    public static void main(String[] args) {
        // Definindo variáveis
        int intVar = 5;
        float floatVar = 5.1f; // Inserir o 'f' no final
        String stringVar = "Teste";
        char charVar = 'A';
        boolean booleanVar = true;

        String var1 = "Parte 1";
        String var2 = " e ";
        String var3 = "Parte 2";
        System.out.println(var1 + var2 + var3); // Concatenação de variáveis

        int x = 1, y = 2, z = 3; // Quando do mesmo tipo, podem ser definidas na mesma linha
        System.out.println(x + y + z);

        int a, s, d;
        a = s = d = 50; // Definir o mesmo valor para múltiplas variáveis
        System.out.println(a + s + d);

        double d1 = 12E4d; // O 'E' indica potência de 10 || Inserir o 'd' no final
        System.out.println(d1);

        char AsciiVar = 65; // Aceita códigos ASCII para imprimir valores
        System.out.println(AsciiVar);
    }
}