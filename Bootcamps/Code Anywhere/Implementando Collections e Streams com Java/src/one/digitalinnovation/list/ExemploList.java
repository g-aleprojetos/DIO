package one.digitalinnovation.list;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        //imprime os nomes na ordem que foi criado
        System.out.println("Todos os nomes da lista = " + nomes);

        //substitui o nome da posição 2 por Larissa
        nomes.set(2, "Larissa");

        //imprime os nomes na ordem que foi criado mostrando o nome já substituido
        System.out.println("Todos os nomes da lista ( trocando o nome da posição 2 por Larissa= " + nomes);

        //ordena os nome em ordem alfabética
        Collections.sort(nomes);

        //substitui o nome da posição 2 por Wesley
        nomes.set(2, "Wesley");

        //imprime os nomes
        System.out.println("Todos os nomes da lista ( colocado em ordem alfabética e subitituido  nome = " + nomes);

        //remove o item da posição 4
        nomes.remove(4);

        //imprime os nomes
        System.out.println("Todos os nomes da lista (removido nome posiçãi 4) = " + nomes);

        //remove o objeto Wesley da lista
        nomes.remove("Wesley");

        //imprime os nomes
        System.out.println("Todos os nomes da lista (removido o Wesley)= " + nomes);

        //adiciona na variavel nome o objeto da posição 1
        String nome = nomes.get(1);

        //imprime o nome
        System.out.println("Imprime o nome da posição 1 = " + nome);

        //verifica em qual posição esta o objeto na lista
        int posicao = nomes.indexOf("Carlos");

        //imprime o resultado da busca
        System.out.println("Posição = " + posicao);

        //adiciona na variavel tamanho quentos elementos a lista tem
        int tamanho = nomes.size();

        //imprime a quantidade de elementos na lista
        System.out.println("quantidade de objetos na lista é " + tamanho);

        //verifica se tem o nome Anderson na lista
        boolean temAnderson = nomes.contains("Anderson");

        //imprime o resultado da busta do nome Anderson
        System.out.println("tem o nome Anderson? " + temAnderson);

        //verifica se tem o nome Fernando na lista
        boolean temFernando = nomes.contains("Fernando");

        //imprime o resultado da busta do nome Anderson
        System.out.println("Tem o nome Fernando na lista? " + temFernando);

        //verifica se a lista esta vazia
        Boolean listaEstaVazia = nomes.isEmpty();

        //imprime o resultado da verificação da lista
        System.out.println("A lista esta vazia? " + listaEstaVazia);

        //laço foreach mostra todos os itens da lista
        for (String nomeDoItem: nomes) {
            //imprime o resultado da verificação da lista
            System.out.println("---> " + nomeDoItem);
        }

        //Iterator mostra o conteudo da lista não repetindo os nomes se ouver
        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()){
            System.out.println(">>> " + iterator.next());
        }

        //limpa a lista
        nomes.clear();

        //verifica se a lista esta vazia
        listaEstaVazia = nomes.isEmpty();

        //imprime o resultado da verificação da lista
        System.out.println("A lista esta vazia? " + listaEstaVazia);



    }
}
