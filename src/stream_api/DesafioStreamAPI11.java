package stream_api;

import java.util.Arrays;
import java.util.List;

public class DesafioStreamAPI11 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Imprima todos os elementos da lista: ");
        System.out.println(numeros);
        //numeros.forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        System.out.println("Imprima a soma dos quadrados de todos os números da lista: ");
        int somaDosQuadradosDosNumeros = numeros.stream()
                .mapToInt(n -> n * n)
                .sum();

        System.out.println("A soma dos quadrados dos números da lista é: " + somaDosQuadradosDosNumeros);

    }
}
