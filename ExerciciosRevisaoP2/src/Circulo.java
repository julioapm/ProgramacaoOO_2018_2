public class Circulo {
    private int centrox;
    private int centroy;
    private int raio;

    public Circulo(Ponto p, int r){
        if (p == null) {
            throw new NullPointerException();
        }
        if (p.getX() < 0) {
            throw new IllegalArgumentException("x deve ser não-negativo");
        }
        if (p.getY() < 0) {
            throw new IllegalArgumentException("y deve ser não-negativo");
        }
        if (r <= 0) {
            throw new IllegalArgumentException("r deve ser positivo");
        }
        centrox = p.getX();
        centroy = p.getY();
        raio = r;
    }

    public int getCentrox() {
        return centrox;
    }

    public int getCentroy() {
        return centroy;
    }

    public int getRaio() {
        return raio;
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
