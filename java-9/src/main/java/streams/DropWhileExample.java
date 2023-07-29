package streams;

import java.util.List;
import java.util.stream.Collectors;

public class DropWhileExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 5, 7, 9, 11, 13, 15);

        // Vamos remover os números iniciais menores que 10
        List<Integer> result = numbers.stream()
                .dropWhile(n -> n < 10)
                .collect(Collectors.toList());

        System.out.println(result); // Output: [11, 13, 15]
    }
}

