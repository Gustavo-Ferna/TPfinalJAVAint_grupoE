
package javaint.proyap.entities.repository;

import java.util.List;
import javaint.proyap.entities.Problema;

/**
 *
 * @author yikef
 */
public interface ProblemaRepositorio {
    
    void agregarServicio(Problema problema);
    void actualizarServicio(Problema problema);
    Problema traerPorID(Long codigoProblema);
    void eliminarProblema(Long codigoProblema);
    List<Problema> traerTodosProblema();
    
    
}
