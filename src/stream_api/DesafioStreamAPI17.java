package stream_api;

import java.util.Arrays;
import java.util.List;

public class DesafioStreamAPI17 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Imprima todos os elementos da lista: ");
        System.out.println(numeros);
        //numeros.forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        System.out.println("Imprima os números primos da lista: ");
        System.out.println("Os números primos da lista são: ");
        numeros.stream()
                .filter(DesafioStreamAPI17 :: numerosPrimos)
                .forEach(System.out :: println);

    }

    private static boolean numerosPrimos(int numero) {
        if(numero <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(numero); i++) {
            if(numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
