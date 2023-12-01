
package javaint.proyap.entities.repository;

import java.util.List;
import javaint.proyap.entities.Especialidad;

/**
 *
 * @author yikef
 */
public interface EspecialidadRepositorio {
    
    void agregarTecnico(Especialidad especialidad);
    void actualizarTecnico(Especialidad especialidad);
    Especialidad traerPorID(Long id);
    void eliminarEspecialidad(Long id);
    List<Especialidad> traerTodosEspecialidad();
    
}
