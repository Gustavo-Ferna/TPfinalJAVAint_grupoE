
package javaint.proyap.entities.repository;

import java.util.List;
import javaint.proyap.entities.Cliente;
import javaint.proyap.entities.repository.dao.DAO;

/**
 *
 * @author yikef
 */
public class JpaClienteRepositorio implements ClienteRepositorio{
    
    private DAO dao;
    
    public JpaClienteRepositorio(DAO dao){
        this.dao =dao;
    }
        @Override
        public void agregarCliente(Cliente cliente) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void actualizarCliente(Cliente cliente) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Cliente traerPorID(Long cuitCliente) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void eliminarCliente(Long cuitCliente) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public List<Cliente> traerTodosCliente() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    
}