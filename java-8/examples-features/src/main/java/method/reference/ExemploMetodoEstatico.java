package method.reference;

import lambda.expressions.Produto;

import java.util.ArrayList;
import java.util.List;

class Impressora {

    public static void imprime(Produto p) {
        System.out.println(p.getNome() + " = " + p.getPreco());
    }
}


/**
 *
 * Exemplo de method reference a partir de um metodo estático
 *
 * */
public class ExemploMetodoEstatico {

    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<Produto>();

        lista.add(new Produto("Teste 1 ", 4000.0));
        lista.add(new Produto("Teste 2 ", 3000.0));
        lista.add(new Produto("Teste 3 ", 2000.0));
        lista.add(new Produto("Teste 4 ", 1000.0));

        //Lambda Expression
        lista.forEach((p) -> System.out.println(p.getNome() + p.getPreco()));

        // Method reference (metodo static)
        lista.forEach(Impressora::imprime);
    }


}
