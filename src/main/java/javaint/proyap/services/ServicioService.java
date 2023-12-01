
package javaint.proyap.services;

import java.util.ArrayList;
import java.util.List;
import javaint.proyap.entities.Servicio;
import javaint.proyap.entities.repository.ServicioRepositorio;

/**
 *
 * @author yikef
 */
public class ServicioService {
    
    private ServicioRepositorio servicioRepositorio;

        //constructor
    public ServicioService(ServicioRepositorio servicioRepositorio){
        this.servicioRepositorio = servicioRepositorio;
    }
    
    void agregarServicio(Servicio servicio){};
    void actualizarServicio(Servicio servicio){};
    Servicio traerPorID(Long id){
        return new Servicio( );
    };
    void eliminarServicio(Long id){};
    List<Servicio> traerTodosServicio(){
        return new ArrayList<>();
    };
    
    
}
