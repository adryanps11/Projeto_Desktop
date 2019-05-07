package beans;

import java.util.Date;

public class Pedidos {

    public static void add(Pedidos p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Atribuições
    private int idpedidos;
    private int idclientes;
    private Date dataentrega;
    private Date datapedidos;

    //Métodos contrutores
    public Pedidos(int idpedidos, int idclientes, Date dataentrega, Date datapedidos) {
        this.idpedidos = idpedidos;
        this.idclientes = idclientes;
        this.dataentrega = dataentrega;
        this.datapedidos = datapedidos;
    }

    public Pedidos() {
    }

    //Métodos Get e Set
    public int getIdpedidos() {
        return idpedidos;
    }

    public void setIdpedidos(int idpedidos) {
        this.idpedidos = idpedidos;
    }

    public int getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(int idclientes) {
        this.idclientes = idclientes;
    }

    public Date getDataentrega() {
        return dataentrega;
    }

    public void setDataentrega(Date dataentrega) {
        this.dataentrega = dataentrega;
    }

    public Date getDatapedidos() {
        return datapedidos;
    }

    public void setDatapedidos(Date datapedidos) {
        this.datapedidos = datapedidos;
    }

}
