package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DesafioStreamAPI10 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Imprima todos os elementos da lista: ");
        System.out.println(numeros);
        //numeros.forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        System.out.println("Agrupar os números da lista que são ímpares e múltiplos de 3 ou 5 : ");
        List<Integer> numerosImparesMultiplosDe3ou5 = numeros.stream()
                .filter(n -> n % 2 != 0)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .collect(Collectors.toList());

        System.out.println("Números ímpares e múltiplos de 3 ou 5: " + numerosImparesMultiplosDe3ou5);

    }
}
