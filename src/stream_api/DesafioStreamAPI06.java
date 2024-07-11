package stream_api;

import java.util.Arrays;
import java.util.List;

public class DesafioStreamAPI06 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Imprima todos os elementos da lista: ");
        System.out.println(numeros);
        //numeros.forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        System.out.println("Verifique se a lista possui número maior que 10: ");
        boolean existeNumeroMaiorQue10 = numeros.stream().anyMatch(n -> n > 10);

        if(existeNumeroMaiorQue10) {
            System.out.println(" Existe pelo menos um número maior que 10 na lista.");
        } else {
            System.out.println("Não existe nenhum número maior que 10 na lista");
        }
    }
}
