public class Metodos {
    // Void significa que não haverá um retorno | "static" significa que o método pode ser chamado sem a necessidade de criar um objeto, contrário ao método "public"
    static void MetodoSemRetorno(String Texto, int Numero) {
        System.out.println(Texto + Numero);
    }

    static int MetodoComRetorno(int Numero) {
        return Numero * 2;
    }

    public static void main(String[] args) {
        String texto = "Teste";
        String texto2 = "Teste2";

        System.out.println(texto.length()); // Exibe a quantidade de caracteres na variável "text"

        System.out.println(texto.toUpperCase()); // Exibe a variável "text" em letras maiúsculas

        System.out.println(texto.toLowerCase()); // Exibe a variável "text" em letras minúsculas

        System.out.println(texto.indexOf("s")); // Localiza a posição do caractere "e" na variável "text" (pode ser
                                                // usado para localizar palavras)

        System.out.println(texto.concat(texto2)); // Concatena as variáveis "text" e "text2"

        MetodoSemRetorno(texto, 3);

        System.out.println(MetodoComRetorno(5));
    }
}
