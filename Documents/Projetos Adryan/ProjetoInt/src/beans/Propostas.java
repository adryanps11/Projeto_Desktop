package beans;

import java.util.Date;

public class Propostas {

    //Atribuições
    private int idpropostas;
    private int idmercado;
    private int idpedidos;
    private String status;
    private Date fim;

    //Métodos Construtores
    public Propostas() {
    }

    public Propostas(int idpropostas, int idmercado, int idpedidos, String status, Date fim) {
        this.idpropostas = idpropostas;
        this.idmercado = idmercado;
        this.idpedidos = idpedidos;
        this.status = status;
        this.fim = fim;
    }

    //Métodos Get e Set
    public int getIdpropostas() {
        return idpropostas;
    }

    public void setIdpropostas(int idpropostas) {
        this.idpropostas = idpropostas;
    }

    public int getIdmercado() {
        return idmercado;
    }

    public void setIdmercado(int idmercado) {
        this.idmercado = idmercado;
    }

    public int getIdpedidos() {
        return idpedidos;
    }

    public void setIdpedidos(int idpedidos) {
        this.idpedidos = idpedidos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

}
