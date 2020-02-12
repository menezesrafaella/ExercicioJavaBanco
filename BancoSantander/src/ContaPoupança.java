public class ContaPoupança extends Conta{
    private float taxaJuros;


    public ContaPoupança(Cliente cliente, double saldo) {
        super(cliente, saldo);
    }

    public float getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(float taxaJuros) {
        this.taxaJuros = taxaJuros;
    }


    @Override
    public void depositar(float entrada) {
        super.depositar(entrada);
    }

    @Override
    public void sacar(float saque) {
        super.sacar(saque);
    }

    public void taxaDoJuros(float taxaJuros){
        //this.setSaldo(getSaldo());
        double taxa = getSaldo()*taxaJuros;
        System.out.println("Com a taxa será :"  + taxa );

    }

}
