public class Vetores {
    public static void main(String[] args) {
        int[] numeros = { 1, 9, 3, 4 };

        numeros[1] = 2; // Altera o item "9" do array "numeros" para "2"

        System.out.println(numeros.length); // Exibe a quantidade de itens presentes no array "numeros"

        int[][] matriz = { 
            { 1, 2, 3, 4 }, 
            { 5, 6, 7, 8 } 
        };

        System.out.println(matriz[1][3]);
    }
}
