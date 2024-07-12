package stream_api;

import java.util.Arrays;
import java.util.List;

public class DesafioStreamAPI12 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Imprima todos os elementos da lista: ");
        System.out.println(numeros);
        //numeros.forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        System.out.println("Imprima o produto de todos os números da lista: ");
        int produtoDosNumeros = numeros.stream()
                .reduce(1,(a, b) -> a * b);
        System.out.println("O produto de todos os números da lista é: " + produtoDosNumeros);

    }
}
