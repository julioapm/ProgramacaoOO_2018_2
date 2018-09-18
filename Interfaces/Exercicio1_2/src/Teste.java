public class Teste {
    public static void main(String[] args){
        Cofrinho c = new Cofrinho();
        c.adicionar(new Moeda(0.5,"50 centavos"));
        c.adicionar(new Moeda(0.5,"50 centavos"));
        c.adicionar(new Moeda(0.5,"50 centavos"));
        c.adicionar(new Moeda(0.25,"25 centavos"));
        System.out.println(c.contarMoedasValor(0.5));
        System.out.println(c.menorValorMoeda());
        System.out.println(c.menorMoeda().getNome());
        System.out.println(c.menorMoedaV2().getNome());
    }
}
