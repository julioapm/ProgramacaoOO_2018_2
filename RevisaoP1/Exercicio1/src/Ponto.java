public class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void deslocar(int dx, int dy) {

    }

    public void deslocar(Ponto p) {
        deslocar(p.getX(),p.getY());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
