import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args){
        Map<String,String> dicionario;
        dicionario = new HashMap<>();
        dicionario.put("alheio", "Distante; que se conserva afastado: alheio às críticas.");
        dicionario.put("cerne","[Botânica] Parte interior do tronco das árvores, entre a medula e a casca, construída a partir de células mortas; durame, durâmen.");
        System.out.println(dicionario.get("alheio"));
        for(String chave : dicionario.keySet()){
            System.out.println(chave);
        }
        for(String valor : dicionario.values()){
            System.out.println(valor);
        }
    }
}
