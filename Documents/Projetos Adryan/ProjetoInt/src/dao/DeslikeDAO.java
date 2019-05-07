package dao;

import beans.Deslike;
import connection.Myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DeslikeDAO {

    private Connection con = null;

    public DeslikeDAO() {
        con = Myconnection.getConnection();

    }

    public List<Deslike> obterDeliske(int id) {
        String sql = "SELECT m.idmercado,p.idpropostas,a.qtdestrelas,a.data FROM mercado m,propostas p,avaliacao a WHERE a.qtdestrelas=? and p.idpropostas = a.idproposta";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Deslike> de = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Deslike d = new Deslike();
                d.setIdmercado(rs.getInt("idmercado"));
                d.setIdproposta(rs.getInt("idpropostas"));
                d.setQtdestrelas(rs.getInt("quantidade"));
                d.setData(rs.getDate("data"));

                de.add(d);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar avaliacao!" + e);
        } finally {
            Myconnection.closeConnection(con, stmt, rs);
        }
        return de;
    }
}
