import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos3 {
    public static void main(String[] args) {
        Produto p1 = new Produto("123A","Produto 1", 1.99);
        Produto p2 = new Produto("123A","Produto 2", 1.99);
        Produto p3 = new Produto("123B","Produto 3", 232.50);
        Produto p4 = new Produto("224F","Produto 4", 35.79);

        Set<Produto> conj1 = new HashSet<>();
        conj1.add(p1);
        conj1.add(p2);
        conj1.add(p3);
        conj1.add(p4);
        System.out.println(conj1.size());
        System.out.println(conj1);

        Set<Produto> conj2 = new TreeSet<>();
        conj2.add(p1);
        conj2.add(p2);
        conj2.add(p3);
        conj2.add(p4);
        System.out.println(conj2.size());
        System.out.println(conj2);
    }
}
