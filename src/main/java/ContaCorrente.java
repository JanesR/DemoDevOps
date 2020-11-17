public class ContaCorrente {
    private double saldo;

    public ContaCorrente(){
        zeraSaldo();
    }

    private void zeraSaldo(){
        saldo = 0;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
        }
        return getTotal();
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTotal(){
        return saldo;
    }
}
