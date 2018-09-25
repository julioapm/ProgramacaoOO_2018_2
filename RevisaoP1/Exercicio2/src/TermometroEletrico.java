public class TermometroEletrico extends Termometro {
    private boolean ligado;

    public TermometroEletrico() {
        super(0);
        ligado = false;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    @Override
    public void setTemperatura(double t) {
        if (ligado) {
            super.setTemperatura(t);
        }
    }

    @Override
    public double getTemperatura() {
        if (ligado) {
            return super.getTemperatura();
        }
        return Double.NaN;
    }

    @Override
    public String toString() {
        return super.toString() + " Ligado = " + ligado;
    }
}
