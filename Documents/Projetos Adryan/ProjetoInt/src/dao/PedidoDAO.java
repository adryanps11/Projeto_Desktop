package dao;

import beans.Pedidos;
import connection.Myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PedidoDAO {

    private Connection con = null;

    public PedidoDAO() {
        con = Myconnection.getConnection();
    }

    public List<Pedidos> obterPedidos() {
        String sql = "SELECT * FROM Pedidos";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Pedidos> ped = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Pedidos p = new Pedidos();
                p.setIdpedidos(rs.getInt("idpedidos"));
                p.setIdclientes(rs.getInt("idclientes"));
                p.setDataentrega(rs.getDate("Dataentrega"));
                p.setDatapedidos(rs.getDate("Datapedidos"));
                ped.add(p);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar pedidos!" + e);
        } finally {
            Myconnection.closeConnection(con, stmt, rs);
        }
        return ped;

    }
}
