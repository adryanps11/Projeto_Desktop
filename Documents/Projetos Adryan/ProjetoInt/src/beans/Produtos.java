package beans;

public class Produtos {

    //Atribuições
    private int idprodutos;
    private String descricao;
    private String categoria;

    //Métodos contrutores
    public Produtos(int idprodutos, String descricao, String categoria) {
        this.idprodutos = idprodutos;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public Produtos() {
    }

    //Métodos Get e Set
    public int getIdprodutos() {
        return idprodutos;
    }

    public void setIdprodutos(int idprodutos) {
        this.idprodutos = idprodutos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
