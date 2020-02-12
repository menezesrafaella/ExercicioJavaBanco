public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public ContaCorrente(Cliente cliente, double saldo) {
        super(cliente, saldo);
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void depositar(float entrada) {
        super.depositar(entrada);
    }



    public void depositarCheques(Cheque cheque){
        double saldoCheque = this.getSaldo() + cheque.getValor();
        System.out.println("O saldo total depois de depositar o Cheque é :" + saldoCheque);

    }
    public void sacarCheque(float saque) {
            if (saque <= getSaldo()) {
                    double saldot = getSaldo() - saque;
                System.out.println("Saldo será :" + saldot);
        } else {
                setChequeEspecial(1000);
                System.out.println(" Não tem saldo suficiente. Mas será permitido utilizar o cheque especial" + getChequeEspecial());
            }
    }

}
