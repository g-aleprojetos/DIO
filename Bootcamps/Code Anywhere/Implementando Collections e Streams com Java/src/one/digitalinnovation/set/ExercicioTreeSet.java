package one.digitalinnovation.set;

import java.util.TreeSet;

public class ExercicioTreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> numeroTreeSet = new TreeSet<>();

        //adicione 5 números
        numeroTreeSet.add(3);
        numeroTreeSet.add(88);
        numeroTreeSet.add(20);
        numeroTreeSet.add(44);
        numeroTreeSet.add(3);

        System.out.println();
        System.out.println(numeroTreeSet);

        System.out.println("-----------------");
        //navegue no set exibindo cada número no console
        for (Integer numTree: numeroTreeSet) {
            System.out.println(numTree);
        }

        System.out.println("-----------------");
        //Remova o primeiro item do set
        numeroTreeSet.remove(3);
        System.out.println(numeroTreeSet);

        System.out.println("-----------------");
        //adiciona um novo número no set:23
        numeroTreeSet.add(23);
        System.out.println(numeroTreeSet);

        System.out.println("-----------------");
        System.out.println(numeroTreeSet.size());

        System.out.println("-----------------");
        System.out.println(numeroTreeSet.isEmpty());

    }
}
