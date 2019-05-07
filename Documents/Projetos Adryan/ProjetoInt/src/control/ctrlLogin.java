package control;

import beans.Login;
import dao.LoginDAO;
import javax.swing.JOptionPane;
import view.viewlogin;

public class ctrlLogin {

    private boolean validarLogin(String usuario, String senha) {
        if (!usuario.isEmpty() && !senha.isEmpty()) {
            return true;

        } else {
            return false;
        }

    }

    public boolean EntrarLogin(String login, String senha) {
        if (validarLogin(login, senha)) {
            Login log = new Login();
            log.setUsuario(login);
            log.setSenha(senha);
            LoginDAO logar = new LoginDAO();
            int id = logar.validarUsuario(log);
            if (id > 0) {
                viewlogin.mercado = id;
                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Senha ou Usuário incorreto!");
                return false;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Favor Preencher os campos do formulário");
            return false;
        }

    }

}
