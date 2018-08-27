public class Lampada {
    private boolean ligada;

    public Lampada() {
        ligada = false;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}
