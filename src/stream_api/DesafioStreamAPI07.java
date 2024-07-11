package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DesafioStreamAPI07 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Imprima todos os elementos da lista: ");
        System.out.println(numeros);
        //numeros.forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        System.out.println("Imprima o segundo maior número da lista: ");
        Optional<Integer> segundoMaiorNumero= numeros.stream()
                .distinct()
                .sorted((a,b) -> b - a)
                .skip(1)
                .findFirst();
        if(segundoMaiorNumero.isPresent()) {
            System.out.println("O segundo maior número da lista é: " + segundoMaiorNumero.get());
        } else {
            System.out.println("A lista não possui um segundo maior número");
        }


    }
}
