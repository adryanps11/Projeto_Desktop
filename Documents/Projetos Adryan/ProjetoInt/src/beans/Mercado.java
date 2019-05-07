package beans;

public class Mercado {

    //Atribuições
    private int idmercado;
    private String mercado;
    private String telefone;
    private String cnpj;
    private String endereco;
    private String email;

    //Métodos Contrutores
    public Mercado() {
    }

    public Mercado(int idmercado, String mercado, String telefone, String cnpj, String endereco, String email) {
        this.idmercado = idmercado;
        this.mercado = mercado;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.email = email;
    }
    //Métodos Get e Set

    public int getIdmercado() {
        return idmercado;
    }

    public void setIdmercado(int idmercado) {
        this.idmercado = idmercado;
    }

    public String getMercado() {
        return mercado;
    }

    public void setMercado(String mercado) {
        this.mercado = mercado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
