package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {
    public static void main(String[] args) {

        //Adiciona 5 nomes
        Queue<String> nomes = new LinkedList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("larissa");
        nomes.add("João");

        //Navegue na fila exibindo cada nome no console
        Iterator<String> iteratorNomes = nomes.iterator();

        while (iteratorNomes.hasNext()){
            System.out.println(iteratorNomes.next());
        }
        System.out.println("-----------------");
        //Retorne o primeiro item da fila, em removê-lo
        String semRemover = nomes.peek();
        System.out.println(semRemover);
        System.out.println(nomes);

        System.out.println("-----------------");
        //Retorne o primeiro item da fila, removendo o mesmo
        String Remover = nomes.poll();
        System.out.println(Remover);
        System.out.println(nomes);

        System.out.println("-----------------");
        //adicione um novo nome e verifique a posição que o mesmo assumiu na fila
        nomes.add("Daniel");
        for (String listaNome: nomes) {
            System.out.println(listaNome);
        }

        System.out.println("-----------------");
        //Retorne o tamanho da fila
        int tanhanho = nomes.size();
        System.out.println(tanhanho);

        System.out.println("-----------------");
        //verifique se alista esta vazia
        System.out.println(nomes.isEmpty());

        System.out.println("-----------------");
        //verifique se o nome Carlos esta na lista
        boolean temCarlos = nomes.contains("Carlos");
        System.out.println(temCarlos);

    }
}
