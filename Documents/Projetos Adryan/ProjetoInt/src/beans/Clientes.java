package beans;

public class Clientes {

    //Atribuições
    private int idclientes;
    private String cliente;
    private String email;
    private String telefone;
    private String cpf;

    //Métodos Construtores
    public Clientes(int idclientes, String cliente, String email, String telefone, String cpf) {
        this.idclientes = idclientes;
        this.cliente = cliente;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public Clientes() {
    }

    //Métodos Get e Set
    public int getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(int idclientes) {
        this.idclientes = idclientes;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
