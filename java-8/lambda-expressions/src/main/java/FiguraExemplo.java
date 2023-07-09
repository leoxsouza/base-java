interface Figura {
    void desenha();
}


public class FiguraExemplo {

    public static void main(String[] args) {

        // Exemplo sem usar lambda
        Figura figura1 = new Figura() {
            @Override
            public void desenha() {
                System.out.println("Desenha figura 1");
            }
        };
        figura1.desenha();

        Figura figura2 = () -> System.out.println("Desenha figura 2");
        figura2.desenha();

    }
}
