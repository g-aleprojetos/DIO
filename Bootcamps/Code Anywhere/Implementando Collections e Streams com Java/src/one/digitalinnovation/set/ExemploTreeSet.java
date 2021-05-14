package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        //Montar a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println("");
        System.out.println(treeCapitais);

        System.out.println("-----------------");
        //Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        System.out.println("-----------------");
        //Retorna a última capital no final da árvore
        System.out.println(treeCapitais.last());

        System.out.println("-----------------");
        //Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        System.out.println("-----------------");
        //Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        System.out.println("-----------------");
        //Exie todas as capitais no console
        System.out.println(treeCapitais);

        System.out.println("-----------------");
        //Retorna a primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        System.out.println("-----------------");
        //Retorna a primeira capital do final da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        System.out.println("-----------------");
        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        System.out.println("-----------------");
        //Navega em todas os itens do iterator
        Iterator<String> iterator = treeCapitais.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----------------");
        for (String capital: treeCapitais) {
            System.out.println(capital);
        }

    }
}
