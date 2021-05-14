package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkdList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");
        //mostra os item da fila
        System.out.println(filaBanco);

        //retira o primeiro elemento da fila e coloca na variavel clienteASerAtendido
        String clienteASerAtendido = filaBanco.poll();
        //mostra conteudo da variavel
        System.out.println(clienteASerAtendido);
        //imprime a fila sem o primeiro elemento retirado pelo poll
        System.out.println(filaBanco);

        //copia na variavel primeiroCliente sem retirar da fila, se caso estiver vazil retorna un null
        String primeiroCliente = filaBanco.peek();
        //mostra do conteudo da variavel
        System.out.println(primeiroCliente);
        //imprime o conteudo da fila
        System.out.println(filaBanco);

        //coloca na variavel o primeiro elemento da fila se caso estiver vazio dá um erro (não retira o elemento)
        String primeiroClienteOuErro = filaBanco.element();
        //imprime o conteudo da variavel
        System.out.println(primeiroClienteOuErro);
        //imprime o conteudo da fila
        System.out.println(filaBanco);

        //apaga o conteudo da fila
        //filaBanco.clear();

        //coloca na variavel o primeiro elemento da fila se caso estiver vazio dá um erro (não retira o elemento)
        primeiroClienteOuErro = filaBanco.element();
        //imprime o conteudo da variavel
        System.out.println(primeiroClienteOuErro);
        //imprime o conteudo da fila
        System.out.println(filaBanco);

        //imprime o conteudo da fila
        for (String client: filaBanco) {
            System.out.println("--->" + client);
        }

        //imprime o conteudo da fila
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while(iteratorFilaBanco.hasNext()){
            System.out.println(">>>" + iteratorFilaBanco.next());
        }

        //quantidade elementos na fila
        System.out.println(filaBanco.size());

        //verifica se a fila esta vazia
        System.out.println(filaBanco.isEmpty());

        //adicionar mais um elemento
        filaBanco.add("Wesley");

        //imprime a lista
        System.out.println(filaBanco);
    }
}
