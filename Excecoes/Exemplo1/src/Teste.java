public class Teste {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(10,10,10);
        System.out.println(c1.area());
        Circulo c2 = new Circulo(1,-1,1);
        System.out.println(c2.area());
    }
}
