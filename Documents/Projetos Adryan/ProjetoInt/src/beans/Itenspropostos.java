package beans;

public class Itenspropostos {

    //Atribuições 
    private int iditenspropostos;
    private int idproposta;
    private int idproduto;
    private Double preco;
    private int quantidade;

    //Métodos Construtores
    public Itenspropostos() {
    }

    public Itenspropostos(int iditenspropostos, int idproposta, int idproduto, Double preco, int quantidade) {
        this.iditenspropostos = iditenspropostos;
        this.idproposta = idproposta;
        this.idproduto = idproduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Métodos Get e Set
    public int getIditenspropostos() {
        return iditenspropostos;
    }

    public void setIditenspropostos(int iditenspropostos) {
        this.iditenspropostos = iditenspropostos;
    }

    public int getIdproposta() {
        return idproposta;
    }

    public void setIdproposta(int idproposta) {
        this.idproposta = idproposta;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
