package one.digitalinnovation.optionals;

import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String[] args) {

        System.out.println();

        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println,() -> System.out.println("Não está presene"));

        System.out.println();

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não esta presente"));

        System.out.println();

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor opcional que não está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));

        System.out.println();

        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("valor opcional que labça erro nullPonterException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));

    }
}
