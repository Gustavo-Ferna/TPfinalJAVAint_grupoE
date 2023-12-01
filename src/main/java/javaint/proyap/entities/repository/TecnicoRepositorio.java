
package javaint.proyap.entities.repository;


import javaint.proyap.entities.Tecnico;
import java.util.List;

/**
 *
 * @author Nicolas
 */
public interface TecnicoRepositorio {
    public void agregarTecnico(Tecnico tecnico);
    public void actualizarTecnico(Tecnico tecnico);
    Tecnico traerPorID(Long cuitTecnico);
    public void eliminarTecnico(Tecnico tecnico);
    public List<Tecnico> traerTodosTecnicos();
}
