import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Produto p1 = new Produto("produto1", 1.99);
        Produto p2 = new Produto("produto1", 1.99);
        ProdutoPerecivel p3 = new ProdutoPerecivel("produto2", 2.5, LocalDate.of(2018,9,20));
        ProdutoPerecivel p4 = new ProdutoPerecivel("produto2", 2.5, LocalDate.of(2018,9,21));

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        System.out.println(p3.equals(p4));
    }
}
