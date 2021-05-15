package one.digitalinnovation.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {

        TreeMap<String, String> treecapitais = new TreeMap<>();

        //Monta a árvore com as capitais
        treecapitais.put("RS", "Porto Alegre");
        treecapitais.put("SC", "Florianópolis");
        treecapitais.put("PR", "Curitiba");
        treecapitais.put("SP", "São Paulo");
        treecapitais.put("RJ", "Rio de Janeiro");
        treecapitais.put("MG", "Belo Horizonte");

        System.out.println();
        System.out.println(treecapitais);

        System.out.println("-----------------");
        //Retorna a primeira capital no topo da Arvore
        System.out.println(treecapitais.firstKey());

        System.out.println("-----------------");
        //Retorna a última capital no final da árvore
        System.out.println(treecapitais.lastKey());

        System.out.println("-----------------");
        //Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treecapitais.lowerKey("SC"));

        System.out.println("-----------------");
        //Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treecapitais.higherKey("SC"));

        System.out.println("-----------------");
        //Exibe todas as capitais no console
        System.out.println(treecapitais);

        System.out.println("-----------------");
        //Retorna a primeira capital no topo da árvore
        System.out.println(treecapitais.firstEntry().getKey() + " - > " + treecapitais.firstEntry().getValue());

        System.out.println("-----------------");
        //Retorna a última capital no topo da árvore
        System.out.println(treecapitais.lastEntry().getKey() + " - > " + treecapitais.lastEntry().getValue());

        System.out.println("-----------------");
        //Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treecapitais.lowerKey("SC") + " - > " + treecapitais.lowerEntry("SC").getValue());

        System.out.println("-----------------");
        //Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treecapitais.higherEntry("SC").getKey() + " - > " + treecapitais.higherEntry("SC").getValue());

        System.out.println("-----------------");
        //Exibe todas as capitais no console
        System.out.println(treecapitais);

        System.out.println("-----------------");
        //Retorna a primeira capital no topo da árvore, removendo do map
        System.out.println(treecapitais.pollFirstEntry().getKey() + " >> " + treecapitais.pollFirstEntry().getValue());

        System.out.println("-----------------");
        //Retorna a primeira capital no final da árvore, removendo do map
        System.out.println(treecapitais.pollLastEntry().getKey() + " -- " + treecapitais.pollLastEntry().getValue());

        System.out.println("-----------------");
        //Exie todas as capitais no console
        System.out.println(treecapitais);

        System.out.println("-----------------");
        //Navega em todas as chaves do iterator
        Iterator<String> iterator = treecapitais.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " - " + treecapitais.get(key));
        }

        System.out.println("-----------------");
        for (String capital : treecapitais.keySet()) {
            System.out.println(capital + " >> " + treecapitais.get(capital));
        }

        System.out.println("-----------------");
        for (Map.Entry<String, String> capital : treecapitais.entrySet()) {
            System.out.println(capital.getKey() + " <-> " + capital.getValue());
        }

    }
}
