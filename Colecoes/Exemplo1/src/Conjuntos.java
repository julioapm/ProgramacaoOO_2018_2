import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {
    public static void main(String[] args){
        Set<String> conjunto;
        conjunto = new HashSet<>();
        conjunto.add("A");
        conjunto.add("B");
        conjunto.add("C");
        System.out.println(conjunto);
        System.out.println(conjunto.size());
        conjunto.add("A");
        System.out.println(conjunto.size());
        conjunto.remove("B");
        System.out.println(conjunto);
        System.out.println(conjunto.contains("X"));
        conjunto.add("D");
        conjunto.add("X");
        conjunto.add("G");
        System.out.println(conjunto);
        for(String s : conjunto){
            System.out.println(s);
        }

        Set<String> conjunto2;
        conjunto2 = new TreeSet<>();
        conjunto2.add("D");
        conjunto2.add("C");
        conjunto2.add("E");
        conjunto2.add("A");
        System.out.println(conjunto2);
        for(String s: conjunto2) {
            System.out.println(s);
        }
    }
}
