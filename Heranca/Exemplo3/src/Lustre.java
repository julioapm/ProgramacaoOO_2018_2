public class Lustre implements Controlavel {
    private Lampada[] lampadas;
    private boolean ligado;

    public Lustre(int numLampadas) {
        lampadas = new Lampada[numLampadas];
        for(int i=0; i<lampadas.length; i++) {
            lampadas[i] = new Lampada();
        }
        ligado = false;
    }

    @Override
    public boolean isLigada() {
        return ligado;
    }

    @Override
    public void ligar() {
        for(int i=0; i<lampadas.length; i++) {
            lampadas[i].ligar();
        }
        ligado = true;
    }

    @Override
    public void desligar() {
        for(int i=0; i<lampadas.length; i++) {
            lampadas[i].desligar();
        }
        ligado = false;
    }
}
