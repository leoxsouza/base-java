import java.util.ArrayList;
import java.util.List;

class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

public class ProdutoExemplo {

    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<Produto>();

        lista.add(new Produto("Teste 1 ", 4000.0));
        lista.add(new Produto("Teste 2 ", 3000.0));
        lista.add(new Produto("Teste 3 ", 2000.0));
        lista.add(new Produto("Teste 4 ", 1000.0));

        lista.sort((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));

        //Lambda Expression com Parametro
        lista.forEach((p) -> System.out.println(p.getNome() + p.getPreco()));
    }
}
