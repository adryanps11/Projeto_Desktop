package beans;

import java.util.Date;

public class Avaliacao {

    //Atribuições
    private int idavaliacao;
    private int idproposta;
    private int qtdestrelas;
    private String tipo;
    private Date data;

    //Construtores
    public Avaliacao() {
    }

    public Avaliacao(int idavaliacao, int idproposta, int qtdestrelas, String tipo, Date data) {
        this.idavaliacao = idavaliacao;
        this.idproposta = idproposta;
        this.qtdestrelas = qtdestrelas;
        this.tipo = tipo;
        this.data = data;
    }

    //Get e Set
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

    public int getQtdestrelas() {
        return qtdestrelas;
    }

    public void setQtdestrelas(int qtdestrelas) {
        this.qtdestrelas = qtdestrelas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
