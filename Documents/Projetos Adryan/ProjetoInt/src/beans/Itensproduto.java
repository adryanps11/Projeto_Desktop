package beans;

public class Itensproduto {

    //Atribuições
    private String idproduto;
    private String produto;
    private int quantidade;

    //Métodos contrutotores
    public Itensproduto() {
    }

    public Itensproduto(String idproduto, String produto, int quantidade) {
        this.idproduto = idproduto;
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    //Métodos Get e Set

    public String getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(String idproduto) {
        this.idproduto = idproduto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
