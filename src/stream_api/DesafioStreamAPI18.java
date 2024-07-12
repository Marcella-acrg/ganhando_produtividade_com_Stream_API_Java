package stream_api;

import java.util.Arrays;
import java.util.List;

public class DesafioStreamAPI18 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Imprima todos os elementos da lista: ");
        System.out.println(numeros);
        //numeros.forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        System.out.println("Verifique se todos os números da lista são iguais: ");
        boolean numerosIguais = numeros.stream()
                .distinct()
                .count() == 1;

        if(numerosIguais) {
            System.out.println("Todos os números da lista são iguais.");
        } else {
            System.out.println("Nem todos os números da lista são iguais");
        }
    }
}
