
package beans;

import java.util.Date;


public class Deslike {
    
    //Atribuições
    private int idmercado;
    private int idproposta;
    private int qtdestrelas;
    private Date data;
    
    //Método construtor
    public Deslike(int idmercado, int idproposta, int qtdestrelas, Date data) {
        this.idmercado = idmercado;
        this.idproposta = idproposta;
        this.qtdestrelas = qtdestrelas;
        this.data = data;
    }

    public Deslike() {
    }
    
    //Métodos Get e Set

    public int getIdmercado() {
        return idmercado;
    }

    public void setIdmercado(int idmercado) {
        this.idmercado = idmercado;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
