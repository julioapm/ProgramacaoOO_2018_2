public class Tv implements Controlavel {
    private boolean ligada;
    private boolean uhd;

    public Tv(boolean uhd) {
        ligada = false;
        this.uhd = uhd;
    }

    public boolean isUhd() {
        return uhd;
    }

    @Override
    public boolean isLigada() {
        return ligada;
    }

    @Override
    public void ligar() {
        ligada = true;
    }

    @Override
    public void desligar() {
        ligada = false;
    }
}
