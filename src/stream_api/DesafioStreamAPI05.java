package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class DesafioStreamAPI05 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Imprima todos os elementos da lista: ");
        System.out.println(numeros);
        //numeros.forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        System.out.println("Imprima a média dos números maiores que 5 contidos na lista: ");
        OptionalDouble mediaNumerosMaioresQue5 = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .average();

        if(mediaNumerosMaioresQue5.isPresent()) {
            System.out.println("A média dos números maiores que 5 é: " + mediaNumerosMaioresQue5.getAsDouble());
        } else {
            System.out.println("Não há números maiores que 5 na lista");
        }
    }
}
