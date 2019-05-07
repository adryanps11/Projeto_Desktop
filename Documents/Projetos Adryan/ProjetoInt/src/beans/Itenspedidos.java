package beans;

public class Itenspedidos {

    //Atribuiçoes
    private int iditens;
    private int idproduto;
    private int idpedidos;
    private int quantidade;
    private String produto;

    public Itenspedidos() {
    }

    public Itenspedidos(int iditens, int idproduto, int idpedidos, int quantidade, String produto) {
        this.iditens = iditens;
        this.idproduto = idproduto;
        this.idpedidos = idpedidos;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getIditens() {
        return iditens;
    }

    public void setIditens(int iditens) {
        this.iditens = iditens;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public int getIdpedidos() {
        return idpedidos;
    }

    public void setIdpedidos(int idpedidos) {
        this.idpedidos = idpedidos;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    
    

}
    
        
   