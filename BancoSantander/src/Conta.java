public class Conta extends Cheque{
    private static final String bancoEmissor = "";
    private static final String data = "";
    private static final double valor = 0;
    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente, double saldo) {
        super(cliente, valor, bancoEmissor, data);
        this.cliente = cliente;
        this.saldo = saldo;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(float entrada){
        this.saldo+=entrada;
        System.out.println("O saldo depois de depositar é :" + getSaldo());
    }

    public void sacar(float saque) {
        if (saque > this.saldo) {
            System.out.println("Não será possivel realizar essa ação");
        } else {
            this.saldo -= saque;
            System.out.println("O saldo após sacar " + this.saldo);
        }
    }
}
