package dao;

import beans.Itenspedidos;
import beans.Pedidos;
import connection.Myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ItenspedidosDAO {

    private Connection con = null;

    public ItenspedidosDAO() {
        con = Myconnection.getConnection();
    }

    public List<Itenspedidos> ListarItens(int id) throws SQLException {
        String sql = "SELECT i.idpedidos,i.idproduto,p.descricao,i.quantidade FROM Itenspedidos i,produtos p WHERE idpedidos = ? and i.idproduto = p.idprodutos";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Itenspedidos> ped = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Itenspedidos i = new Itenspedidos();
                i.setIdproduto(rs.getInt("idproduto"));
                i.setProduto(rs.getString("descricao"));
                i.setQuantidade(rs.getInt("quantidade"));
                i.setIdpedidos(rs.getInt("idpedidos"));
                ped.add(i);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar Itenspedidos!" + ex);
        } finally {
            Myconnection.closeConnection(con, stmt, rs);
        }

        return ped;
    }

}
