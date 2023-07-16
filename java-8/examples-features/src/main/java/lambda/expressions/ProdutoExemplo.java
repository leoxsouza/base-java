package lambda.expressions;

import java.util.ArrayList;
import java.util.List;

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
