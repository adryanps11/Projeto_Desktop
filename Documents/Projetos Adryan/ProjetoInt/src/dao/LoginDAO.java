package dao;

import beans.Login;
import beans.Pedidos;
import beans.Usuario;
import connection.Myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import view.viewlogin;

public class LoginDAO {

    private Connection con = null;

    public int validarUsuario(Login usuario) {
        con = Myconnection.getConnection();

        String sql = "SELECT * from usuario WHERE usuario=? and senha=?";
        PreparedStatement stmt = null;
        int resposta = 0;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getSenha());
            stmt.executeQuery();
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                resposta = rs.getInt("idmercado");
            }

        } catch (SQLException e) {
            System.err.println("Erro a localizar usuário!" + e);

        }
        return resposta;
    }

}
