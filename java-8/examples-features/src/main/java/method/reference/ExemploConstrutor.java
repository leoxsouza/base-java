package method.reference;

interface PessoaApresentacao {
    Pessoa apresenta(String nome, int idade);
}

class Pessoa {

    public Pessoa(String nome, int idade) {
        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos.");
    }

}


/**
 *
 * Exemplo de method reference por construtor
 * Comum no padrão de projeto Factory Methods
 *
 * */
public class ExemploConstrutor {

    public static void main(String[] args) {

        PessoaApresentacao pessoaApresentacao = Pessoa::new;

        pessoaApresentacao.apresenta("Leo", 25);

    }
}
