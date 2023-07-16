package method.reference;

interface Figura2D {
    void desenha(Double largura, Double altura);
}

class Retangulo {
    public void desenhaRetangulo(Double largura, Double altura) {
        System.out.println("Desenhar retangulo de largura: " + largura + " e Altura: " + altura);
    }
}

/**
 * Exemplo de method reference a partir de uma instancia de uma classe
 * */
public class ExemploInstancia {

    public static void main(String[] args) {
        Retangulo ret = new Retangulo(); // Method reference apartir de uma instancia
        Figura2D fig = ret::desenhaRetangulo; // Method reference
        fig.desenha(8.0, 15.0);
    }
}
