package one.digitalinnovation.set;

import java.util.HashSet;

public class ExercicioHashSet {
    public static void main(String[] args) {

        HashSet<Integer> numeroHash = new HashSet<>();

        //adicione 5 números
        numeroHash.add(3);
        numeroHash.add(88);
        numeroHash.add(20);
        numeroHash.add(44);
        numeroHash.add(3);

        System.out.println();
        System.out.println(numeroHash);

        System.out.println("-----------------");
        //navegue no set exibindo cada número no console
        for (Integer numHash: numeroHash) {
            System.out.println(numHash);
        }

        System.out.println("-----------------");
        //Remova o primeiro item do set
        numeroHash.remove(3);
        System.out.println(numeroHash);

        System.out.println("-----------------");
        //adiciona um novo número no set:23
        numeroHash.add(23);
        System.out.println(numeroHash);

        System.out.println("-----------------");
        System.out.println(numeroHash.size());

        System.out.println("-----------------");
        System.out.println(numeroHash.isEmpty());

    }
}
