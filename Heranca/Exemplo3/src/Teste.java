public class Teste {
    public static void main(String[] args) {
        Controlavel[] controlador = new Controlavel[2];
        controlador[0] = new Lustre(3);
        controlador[1] = new Tv(true);
        for(int i=0; i<controlador.length; i++) {
            controlador[i].ligar();
        }
    }
}
