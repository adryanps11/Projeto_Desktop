package dao;

import beans.Reclamacao;
import connection.Myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ReclamacaoDAO {

    private Connection con = null;

    public ReclamacaoDAO() {
        con = Myconnection.getConnection();

    }

    public List<Reclamacao> obterReclamacao(int id) {
        String sql = "SELECT r.reclamacao,p.descricao,p.categoria,m.idpropostas,a.idavaliacao FROM reclamacao r,produtos p,propostas m,avaliacao a WHERE m.idmercado=? and m.idpropostas = a.idproposta";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Reclamacao> rec = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Reclamacao r = new Reclamacao();
                r.setIdproposta(rs.getInt("idpropostas"));
                r.setReclamacao(rs.getString("reclamacao"));
                r.setDescricao(rs.getString("descricao"));
                r.setCategoria(rs.getString("categoria"));

                rec.add(r);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar reclamacao!" + e);
        } finally {
            Myconnection.closeConnection(con, stmt, rs);
        }
        return rec;

    }

    
}
