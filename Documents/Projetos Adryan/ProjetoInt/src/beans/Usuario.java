package beans;

public class Usuario {

    //Atribuições
    private int idusuario;
    private int idmercado;
    private String usuario;
    private String senha;

    //Contrutores
    public Usuario() {
    }

    public Usuario(int idusuario, int idmercado, String usuario, String senha) {
        this.idusuario = idusuario;
        this.idmercado = idmercado;
        this.usuario = usuario;
        this.senha = senha;
    }
    //Get e Set

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdmercado() {
        return idmercado;
    }

    public void setIdmercado(int idmercado) {
        this.idmercado = idmercado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
