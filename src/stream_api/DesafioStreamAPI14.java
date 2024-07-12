package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class DesafioStreamAPI14 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Imprima todos os elementos da lista: ");
        System.out.println(numeros);
        //numeros.forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        System.out.println("Imprima o maior número primo da lista: ");
        OptionalInt maiorNumeroPrimo = numeros.stream()
                .filter(DesafioStreamAPI14::numeroPrimo)
                .mapToInt(Integer::intValue)
                .max();

        if (maiorNumeroPrimo.isPresent()) {
            System.out.println("O maior número primo da lista é: " + maiorNumeroPrimo.getAsInt());
        } else {
            System.out.println("Não há números primos na lista.");
        }
    }

    private static boolean numeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
