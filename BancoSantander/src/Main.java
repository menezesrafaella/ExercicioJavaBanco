public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1345,"Silva","12123344t", "2133234444");
        Conta conta = new Conta(cliente, 1000);
        conta.depositar(130);
        conta.sacar(100);

        ContaPoupança contaPoupança = new ContaPoupança(cliente, 3000);
        contaPoupança.depositar(23);
        contaPoupança.taxaDoJuros(2);
        contaPoupança.getSaldo();

        Cheque cheque = new Cheque(cliente, 1000, "Bradesco", "12/1/2010");
        ContaCorrente conta1 = new ContaCorrente(cliente, 4000);
        conta1.depositarCheques(cheque);
        conta1.getSaldo();
        conta1.getValor();
        conta1.sacarCheque(5000);

    }
}
