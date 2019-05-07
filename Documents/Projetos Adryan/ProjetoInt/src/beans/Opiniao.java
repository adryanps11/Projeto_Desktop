package beans;

public class Opiniao {

    //Atribuições
    private int idopiniao;
    private int idmercado;
    private int qtdestrelas;
    private String opiniao;

    //Métodos construtores
    public Opiniao(int idopiniao, int idmercado, int qtdestrelas, String opiniao) {
        this.idopiniao = idopiniao;
        this.idmercado = idmercado;
        this.qtdestrelas = qtdestrelas;
        this.opiniao = opiniao;
    }

    public Opiniao() {
    }

    //Métodos Get e Set
    public int getIdopiniao() {
        return idopiniao;
    }

    public void setIdopiniao(int idopiniao) {
        this.idopiniao = idopiniao;
    }

    public int getIdmercado() {
        return idmercado;
    }

    public void setIdmercado(int idmercado) {
        this.idmercado = idmercado;
    }

    public int getQtdestrelas() {
        return qtdestrelas;
    }

    public void setQtdestrelas(int qtdestrelas) {
        this.qtdestrelas = qtdestrelas;
    }

    public String getOpiniao() {
        return opiniao;
    }

    public void setOpiniao(String opiniao) {
        this.opiniao = opiniao;
    }

}
