package factory.method;

import java.util.List;

public class FactoryMethodExemplo {

    public static void main(String[] args) {

        /**
         * O método List.of é um exemplo de factory method das colections
         * **/
        List<String> frutas = List.of("Banana", "Macã", "Pera");

        for (String s: frutas) {
            System.out.println(s);
        }
    }
}
