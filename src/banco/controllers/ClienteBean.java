package banco.controllers;

import banco.domains.Cliente;
import banco.models.ClienteDAO;
import banco.views.JFCliente;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lopes
 */
public class ClienteBean {

    public void iniciar() {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        JFCliente jfcliente = new JFCliente();
        jfcliente.setVisible(true);
    }

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList();
        ClienteDAO clienteDAO = new ClienteDAO();

        clientes = clienteDAO.listarClientes();

        return clientes;
    }

    public void inserirCliente(Cliente cliente) throws SQLIntegrityConstraintViolationException, SQLException{
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.inserirCliente(cliente);
    }
public void alterarCliente(Cliente cliente) {
        try {
            banco.models.ClienteDAO clienteDAO = new banco.models.ClienteDAO();
            clienteDAO.alterarCliente(cliente);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void excluirCliente(Cliente cliente) {
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.excluirCliente(cliente);
    }
}
