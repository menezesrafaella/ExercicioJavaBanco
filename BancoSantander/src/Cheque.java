public class Cheque{
    private double valor;
    private String bancoEmissor;
    private String data;
    private Cliente cliente;

    public Cheque(Cliente cliente, double valor, String bancoEmissor, String data) {
        this.valor = valor;
        this.bancoEmissor = bancoEmissor;
        this.data = data;
        this.cliente = cliente;

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getBancoEmissor() {
        return bancoEmissor;
    }

    public void setBancoEmissor(String bancoEmissor) {
        this.bancoEmissor = bancoEmissor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


}



