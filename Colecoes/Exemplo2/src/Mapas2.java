import java.util.HashMap;
import java.util.Map;

public class Mapas2 {
    public static void main(String[] args){
        // Cria dicionário que mapeia código DDI (int) para nome do país (String)
        Map<Integer, String> dic = new HashMap<>();

        // Adiciona algumas entradas...
        dic.put(55, "Brasil");
        dic.put(1, "EUA");
        dic.put(44, "UK");

        System.out.println("Tamanho:" + dic.size());

        // Se o dicionário contém a chave 55...
        if(dic.containsKey(55)) {
            // Exibe o valor (Brasil)
            System.out.println("Chave 55 é: "+dic.get(55));
        }

        // Retorna null, pois a chave 33 não existe
        System.out.println("Chave 33? "+dic.get(33));

        dic.remove(1); // tenta remover o elemento cuja chave é 1

        // Exibe todas as chaves na tela (keySet retorna um Set<Integer>)
        for(int k: dic.keySet()) {
            System.out.println("Chave: " + k);
        }
    }
}
