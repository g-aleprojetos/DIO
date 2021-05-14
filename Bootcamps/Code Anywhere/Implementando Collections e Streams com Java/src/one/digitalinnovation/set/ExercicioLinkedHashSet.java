package one.digitalinnovation.set;

import java.util.LinkedHashSet;

public class ExercicioLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> numeroLinkedHashSet = new LinkedHashSet<>();

        //adicione 5 números
        numeroLinkedHashSet.add(3);
        numeroLinkedHashSet.add(88);
        numeroLinkedHashSet.add(20);
        numeroLinkedHashSet.add(44);
        numeroLinkedHashSet.add(3);

        System.out.println();
        System.out.println(numeroLinkedHashSet);

        System.out.println("-----------------");
        //navegue no set exibindo cada número no console
        for (Integer numLinked: numeroLinkedHashSet) {
            System.out.println(numLinked);
        }

        System.out.println("-----------------");
        //Remova o primeiro item do set
        numeroLinkedHashSet.remove(3);
        System.out.println(numeroLinkedHashSet);

        System.out.println("-----------------");
        //adiciona um novo número no set:23
        numeroLinkedHashSet.add(23);
        System.out.println(numeroLinkedHashSet);

        System.out.println("-----------------");
        System.out.println(numeroLinkedHashSet.size());

        System.out.println("-----------------");
        System.out.println(numeroLinkedHashSet.isEmpty());

    }

}
