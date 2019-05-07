package beans;

public class Reclamacao {

    //Atribuições
    private int idreclamacao;
    private int idavaliacao;
    private int idproposta;
    private int idproduto;
    private String categoria;
    private String reclamacao;
    private String descricao;

    //Métodos Contrutores
    public Reclamacao() {
    }

    public Reclamacao(int idreclamacao, int idavaliacao, int idproposta, int idproduto, String categoria, String reclamacao, String descricao) {
        this.idreclamacao = idreclamacao;
        this.idavaliacao = idavaliacao;
        this.idproposta = idproposta;
        this.idproduto = idproduto;
        this.categoria = categoria;
        this.reclamacao = reclamacao;
        this.descricao = descricao;
    }

    //Métodos Get e Set
    public int getIdreclamacao() {
        return idreclamacao;
    }

    public void setIdreclamacao(int idreclamacao) {
        this.idreclamacao = idreclamacao;
    }

    public int getIdavaliacao() {
        return idavaliacao;
    }

    public void setIdavaliacao(int idavaliacao) {
        this.idavaliacao = idavaliacao;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getReclamacao() {
        return reclamacao;
    }

    public void setReclamacao(String reclamacao) {
        this.reclamacao = reclamacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
