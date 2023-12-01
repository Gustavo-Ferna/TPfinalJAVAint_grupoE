
package javaint.proyap.services;

import java.util.ArrayList;
import java.util.List;
import javaint.proyap.entities.Incidente;
import javaint.proyap.entities.repository.IncidenteRepositorio;

/**
 *
 * @author yikef
 */
public class IncidenteService {
    
    private IncidenteRepositorio incidenteRepositorio;
        //constructor
    public IncidenteService(IncidenteRepositorio incidenteRepositorio){
        this.incidenteRepositorio = incidenteRepositorio;
    }
    
    void agregarIncidente(Incidente incidente){};
    void actualizarIncidente(Incidente incidente){};
    Incidente traerPorID(Long codigoIncidente){
        return new Incidente( );
    };
    void eliminarIncidente(Long codigoIncidente){};
    List<Incidente> traerTodosIncidente(){
        return new ArrayList<>();
    };
    
    
}
