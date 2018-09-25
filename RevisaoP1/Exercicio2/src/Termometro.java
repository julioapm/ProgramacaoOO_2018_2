public class Termometro {
    private double temperatura;

    public Termometro(double t){ temperatura = t; }

    public double getTemperatura(){ return temperatura;}

    public void setTemperatura(double t) {temperatura = t;}

    @Override
    public String toString(){
        return "Temperatura = " + getTemperatura();
    }
}
