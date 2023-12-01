package javaint.proyap.entities.repository;

import java.util.List;
import javaint.proyap.entities.Incidente;

/**
 *
 * @author yikef
 */
public interface IncidenteRepositorio {
    void agregarCliente(Incidente incidente);
    void actualizarCliente(Incidente incidente);
    Incidente traerPorID(Long codigoIncidente);
    void eliminarCliente(Long codigoIncidente);
    List<Incidente> traerTodosIncidente();
    
}
