package control;

import beans.Itenspedidos;
import dao.ItenspedidosDAO;
import dao.PedidoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ctrlPedidos {

    public List<Itenspedidos> ListarItensPedidos(int id) throws SQLException {
        List<Itenspedidos> itens = new ArrayList<>();
        if (id > 0) {
            ItenspedidosDAO i = new ItenspedidosDAO();
            itens = i.ListarItens(id);
        }
        return itens;
    }

}
