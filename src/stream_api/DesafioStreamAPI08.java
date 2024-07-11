package stream_api;

import java.util.Arrays;
import java.util.List;

public class DesafioStreamAPI08 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Imprima todos os elementos da lista: ");
        System.out.println(numeros);
        //numeros.forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        System.out.println("Imprima a soma dos digitos de todos os números da lista: ");
        int somaDosDigitos = numeros.stream()
                .map(String::valueOf)
                .flatMapToInt(num -> num.chars().map(Character::getNumericValue))
                .sum();

        System.out.println("A soma dos dígitos de todos os números da lista é: " + somaDosDigitos);
    }
}
