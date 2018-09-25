public class Teste {
    public static void main(String[] args) {
        EstatisticaDeDados estatistica = new EstatisticaDeDados();
        ContaCorrente c1 = new ContaCorrente();
        c1.depositar(100);
        ContaCorrente c2 = new ContaCorrente();
        c2.depositar(50);
        ContaCorrente c3 = new ContaCorrente();
        c3.depositar(30);
        estatistica.adicionar(c1);
        estatistica.adicionar(c2);
        estatistica.adicionar(c3);
        System.out.println(estatistica.getMedia());
        System.out.println(estatistica.getMenor());
    }
}
