package one.digitalinnovation.map;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {

        Map<String,Integer> campeoesMundialFifa = new HashMap<>();

        //adiciona os compeões mundiais fifa no mapa
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println();
        System.out.println(campeoesMundialFifa);

        System.out.println("-----------------");
        //Atualiza o valor para a chave Brasil
        campeoesMundialFifa.put("Brasil", 6);
        System.out.println(campeoesMundialFifa);

        System.out.println("-----------------");
        //Retorna a Argentina
        System.out.println(campeoesMundialFifa.get("Argentina"));

        System.out.println("-----------------");
        //Retorna se existi ou não uma campeã França
        System.out.println(campeoesMundialFifa.containsKey("França"));

         //Remove a campeã França
        campeoesMundialFifa.remove("França");

        System.out.println("-----------------");
        //Retorna se existi ou não uma campeã França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        System.out.println("-----------------");
        //Retorna se existi algum hexacampeão
        System.out.println(campeoesMundialFifa.containsValue(6));

        System.out.println("-----------------");
        //Retorna o tamanho do mapa
        System.out.println(campeoesMundialFifa.size());

        System.out.println("-----------------");
        System.out.println(campeoesMundialFifa);

        System.out.println("-----------------");
        //navegar nos registros do mapa
        for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()) {
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }
        System.out.println("-----------------");
        //Navega nos registros do mapa
        for (String key : campeoesMundialFifa.keySet()) {
            System.out.println(key + " >>> " + campeoesMundialFifa.get(key));
        }

        System.out.println("-----------------");
        System.out.println(campeoesMundialFifa);

        System.out.println("-----------------");
        //Verificar se o mapa tem a chave Estados Unidos
        System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));

        System.out.println("-----------------");
        //Verifica se o mapa contem o valor 5
        System.out.println(campeoesMundialFifa.containsValue(5));

        System.out.println("-----------------");
        //verifica o tamanho antes e depois de limpar o mapa
        System.out.println(campeoesMundialFifa.size());
        campeoesMundialFifa.clear();
        System.out.println(campeoesMundialFifa.size());

    }
}
