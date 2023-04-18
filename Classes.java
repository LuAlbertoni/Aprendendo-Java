class Classes {
    int y = 3;

    // Public: Qualquer classe pode acessar esse método | Default: Apenas classes do mesmo pacote podem acessar esse método
    public static void main(String[] args) {
        Classes objeto01 = new Classes(); // Gerando um objeto da classe presente nesse arquivo
        Classes02 objeto02 = new Classes02(); // Gerando um objeto da classe presente no arquivo "Classes02.java"

        System.out.println(objeto01.y * 9);
        System.out.println(objeto02.x * 3);

        objeto02.x = 2; // Altera o valor de "x" do objeto02 para 2
    }
}