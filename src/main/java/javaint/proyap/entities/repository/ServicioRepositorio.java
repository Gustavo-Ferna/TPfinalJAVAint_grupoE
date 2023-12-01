package javaint.proyap.entities.repository;

import java.util.List;
import javaint.proyap.entities.Servicio;

/**
 *
 * @author yikef
 */
public interface ServicioRepositorio {
    void agregarServicio(Servicio servicio);
    void actualizarServicio(Servicio servicio);
    Servicio traerPorID(Long id);
    void eliminarServicio(Long id);
    List<Servicio> traerTodosServicio();
    
}
