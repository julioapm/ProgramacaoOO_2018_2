public class Teste {
    public static void main(String[] args) {
        FiguraBidimensional[] figuras = new FiguraBidimensional[3];
        figuras[0] = new Circulo(1,1,1);
        figuras[1] = new Retangulo(5,7,4,8);
        figuras[2] = new Quadrado(10,10,3);
        for(FiguraBidimensional f : figuras) {
            System.out.println(f.area());
        }
    }
}
