package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioFinal {

    public static void main(String[] args) {
        //adicione 5 nomes em uma lista
        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //navegue na lista exibindo cada nome no console
        for (String nome: nomes) {
            System.out.println(nome);
        }

        //Substitua o nome Carlos para Roberto
        nomes.set(2, "Roberto");
        System.out.println(nomes);

        //Retorne o nome da posição 1
        System.out.println(nomes.get(1));

        //Remova o nome da posição 4
        nomes.remove(4);
        System.out.println(nomes);

        //Remova o nome João
        nomes.remove("João");
        System.out.println(nomes);

        //Retorne a quantidade de item da lista
        int quantidade = nomes.size();
        System.out.println(quantidade);

        //Verifique se o nome Juliano exixte na lista
        boolean temJuliano = nomes.contains("Juliano");
        System.out.println(temJuliano);

        //Crie uma nova lista e adiciono os itens na primeira lista
        List<String> novaLisa = new ArrayList<>();

        novaLisa.add("Ismael");
        novaLisa.add("Rodrigo");

        nomes.addAll(novaLisa);
        System.out.println(nomes);

        //ordene os itens da lista por ordem alfabética
        Collections.sort(nomes);
        System.out.println(nomes);

        //Verifique se a lista esta vazia
        boolean verificar = nomes.isEmpty();
        System.out.println(verificar);

    }
}
