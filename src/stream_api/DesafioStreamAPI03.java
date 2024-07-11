package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DesafioStreamAPI03 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Imprima todos os elementos da lista: ");
        System.out.println(numeros);
        //numeros.forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        System.out.println("Verifique se todos os números da lista são positivos: ");
        boolean todosNumerosPositivos = numeros.stream().allMatch(n -> n > 0);

        if(todosNumerosPositivos) {
            System.out.println("Todos os números da lista são positivos.");
        } else {
            System.out.println("Nem todos os números da lista são positivos.");
        }

    }
}
