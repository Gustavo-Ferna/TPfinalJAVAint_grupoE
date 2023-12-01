
package javaint.proyap.entities.repository;

import java.util.List;
import javaint.proyap.entities.Especialidad;
import javaint.proyap.entities.repository.dao.DAO;

/**
 *
 * @author yikef
 */
public class JpaEspecialidadRepositorio implements EspecialidadRepositorio{
    
    private DAO dao;
    
    public JpaEspecialidadRepositorio(DAO dao){
        this.dao =dao;
    }

    @Override
    public void agregarTecnico(Especialidad especialidad) {
 
    }

    @Override
    public void actualizarTecnico(Especialidad especialidad) {

    }

    @Override
    public Especialidad traerPorID(Long id) {

        return null;

    }

    @Override
    public void eliminarEspecialidad(Long id) {

    }

    @Override
    public List<Especialidad> traerTodosEspecialidad() {

        return null;

    }
    
}
