package beans;

public class Login {

    //Atribuições
    private int idlogin;
    private int idcliente;
    private String usuario;
    private String senha;

    //Métodos construtores
    public Login(int idlogin, int idcliente, String usuario, String senha) {
        this.idlogin = idlogin;
        this.idcliente = idcliente;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Login() {
    }

    //Métodos Get e Set
    public int getIdlogin() {
        return idlogin;
    }

    public void setIdlogin(int idlogin) {
        this.idlogin = idlogin;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
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
