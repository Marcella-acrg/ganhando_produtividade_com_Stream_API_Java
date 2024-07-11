package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DesafioStreamAPI01 {

    public static void main (String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Imprima todos os elementos da lista: ");
        System.out.println(numeros);
        //numeros.forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        System.out.println("Imprima essa lista na ordem númerica natural: ");
        List<Integer> numerosOrdemCrescente = numeros.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(numerosOrdemCrescente);

    }
}
