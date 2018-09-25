public class Circulo {
    private int centrox;
    private int centroy;
    private int raio;

    public Circulo(Ponto p, int r){
        this(p.getX(),p.getY(),r);
    }

    public Circulo(int centrox, int centroy, int raio) {
        this.centrox = centrox;
        this.centroy = centroy;
        this.raio = raio;
    }

    public Circulo() {
    }

    public double area() {
        return 0;
    }

    public double circunferencia() {
        return 0;
    }

    public int diametro() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
