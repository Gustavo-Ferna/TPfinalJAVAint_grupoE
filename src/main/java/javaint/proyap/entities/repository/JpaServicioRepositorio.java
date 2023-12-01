
package javaint.proyap.entities.repository;

import java.util.List;
import javaint.proyap.entities.Servicio;
import javaint.proyap.entities.repository.dao.DAO;

/**
 *
 * @author yikef
 */
public class JpaServicioRepositorio implements ServicioRepositorio{
    
    private DAO dao;
    
    public JpaServicioRepositorio(DAO dao){
        this.dao =dao;
    }

    @Override
    public void agregarServicio(Servicio servicio) {
    }

    @Override
    public void actualizarServicio(Servicio servicio) {
    }

    @Override
    public Servicio traerPorID(Long id) {
        return null;
    }

    @Override
    public void eliminarServicio(Long id) {
    }

    @Override
    public List<Servicio> traerTodosServicio() {
        return null;
    }
    
    
}
