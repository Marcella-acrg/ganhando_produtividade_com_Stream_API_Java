package stream_api;

import java.util.*;

public class DesafioStreamAPI15 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Imprima todos os elementos da lista: ");
        System.out.println(numeros);
        //numeros.forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        System.out.println("Verifique se a lista contém pelo menos um número negativo: ");
        boolean numeroNegativo = numeros.stream()
                .anyMatch( n -> n < 0);

        if (numeroNegativo) {
            System.out.println("A lista contém pelo menos um número negativo.");
        } else {
            System.out.println("A lista não contém números negativos");
        }

    }
}
