package beans;

public class Endereco {

    //Atribuições
    private int idendereco;
    private int idcliene;
    private String bairro;
    private String cep;
    private String lograouro;
    private String cidade;
    private String estado;

    //Métodos construtores
    public Endereco(int idendereco, int idcliene, String bairro, String cep, String lograouro, String cidade, String estado) {
        this.idendereco = idendereco;
        this.idcliene = idcliene;
        this.bairro = bairro;
        this.cep = cep;
        this.lograouro = lograouro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Endereco() {
    }

    //Métodos Get e Set
    public int getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(int idendereco) {
        this.idendereco = idendereco;
    }

    public int getIdcliene() {
        return idcliene;
    }

    public void setIdcliene(int idcliene) {
        this.idcliene = idcliene;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLograouro() {
        return lograouro;
    }

    public void setLograouro(String lograouro) {
        this.lograouro = lograouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
