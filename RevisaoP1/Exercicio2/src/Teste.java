public class Teste {
    public static void main(String[] args){
        TermometroEletrico te = new TermometroEletrico();
        System.out.println(te.getTemperatura());
        System.out.println(te);
        te.ligar();
        System.out.println(te);
    }
}
