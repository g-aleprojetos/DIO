package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //adiciona os numeros no set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        System.out.println("-----------------");
        //Remove o número do set
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        System.out.println("-----------------");
        //Retorna a quantidade de itens do set
        System.out.println(sequenciaNumerica.size());

        System.out.println("-----------------");
        //navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----------------");
        for (Integer numero: sequenciaNumerica) {
            System.out.println(numero);
        }

        System.out.println("-----------------");
        //Retorna se o set esta vazio ou não
        System.out.println(sequenciaNumerica.isEmpty());

    }
}
