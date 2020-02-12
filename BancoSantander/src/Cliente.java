public class Cliente {
    private int nroDoCliente;
    private String sobrenome;
    private String RG;
    private String CPF;

    public Cliente(int nroDoCliente, String sobrenome, String RG, String CPF) {
        this.nroDoCliente = nroDoCliente;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.CPF = CPF;
    }

    public int getNroDoCliente() {
        return nroDoCliente;
    }

    public void setNroDoCliente(int nroDoCliente) {
        this.nroDoCliente = nroDoCliente;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
