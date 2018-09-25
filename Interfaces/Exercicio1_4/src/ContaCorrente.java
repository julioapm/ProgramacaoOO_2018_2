public class ContaCorrente implements Mensuravel{
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public double getValor() {
        return getSaldo();
    }
}
