import java.util.Map;
import java.util.TreeMap;

public class Mapas3 {
    public static void main(String[] args){
        int[] numeros = {1,10,4,2,1,3,5,3,6,78,34,43,45,34};
        Map<Integer,Integer> mapa = new TreeMap<>();
        for (int num : numeros){
            if (!mapa.containsKey(num)){
                mapa.put(num,1);
            } else {
                mapa.put(num,mapa.get(num)+1);
            }
        }
        System.out.println("Número - Frequência:");
        for(Map.Entry entrada : mapa.entrySet()){
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }

        for(int numero : mapa.keySet()){
            System.out.println(numero + " - " + mapa.get(numero));
        }
    }
}
