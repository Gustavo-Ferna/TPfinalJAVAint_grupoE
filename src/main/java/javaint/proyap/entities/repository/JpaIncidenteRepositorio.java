
package javaint.proyap.entities.repository;

import java.util.List;
import javaint.proyap.entities.Incidente;
import javaint.proyap.entities.repository.dao.DAO;

/**
 *
 * @author yikef
 */
public class JpaIncidenteRepositorio implements IncidenteRepositorio{
    private DAO dao;
    
    public JpaIncidenteRepositorio(DAO dao){
        this.dao =dao;
    }

    @Override
    public void agregarCliente(Incidente incidente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizarCliente(Incidente incidente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Incidente traerPorID(Long codigoIncidente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarCliente(Long codigoIncidente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Incidente> traerTodosIncidente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
