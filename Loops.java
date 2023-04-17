public class Loops {
    public static void main(String[] args) {
        int i = 0;
        String[] frutas = { "maçã", "pêra", "limão" };

        // While
        while (i < 3) {
            System.out.println("I é igual a " + i);

            i++;
        }

        // Do... While
        do {
            System.out.println("I é igual a " + i);

            i++;

        } while (i < 6);

        // For
        for (i = 0; i < 3; i++) {
            System.out.println("I é igual a " + i);
        }

        // For Each
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // Break é utilizado para forçar a saída de loops
        for (i = 0; i < 9;) {
            break;
        }

        // Continue é utilizado para pular o loop atual e passar para o próximo
        for (i = 0; i < 3; i++) {
            if (i == 1)
                continue;
            System.out.println(i);
        }
    }
}
