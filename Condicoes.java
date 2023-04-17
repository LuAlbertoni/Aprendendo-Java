public class Condicoes {
    public static void main(String[] args) {
        int var = 10;

        if (var == 10) { // Se
            System.out.println("É igual a 10");
        } else if (var > 10) { // Senão se
            System.out.println("É maior que 10");
        } else { // Senão
            System.out.println("É diferente de 10");
        }

        switch (var) {
            case 10:
                System.out.println("É igual a 10");
                break; // Opcional
            case 20:
                System.out.println("É igual a 20");
                break;
            default:
                System.out.println("É diferente de 10 e 20"); // Opcional, só roda caso não bata com nenhum case
        }

        System.out.println((var < 10) ? "Menor que 10." : "Maior ou igual a que 10.");
    }
}
