package javaint.proyap.services;

import java.util.ArrayList;
import java.util.List;
import javaint.proyap.entities.Especialidad;
import javaint.proyap.entities.repository.EspecialidadRepositorio;

/**
 *
 * @author yikef
 */
public class EspecialidadService {
    
    private EspecialidadRepositorio especialidadRepositorio;
    
    public EspecialidadService(EspecialidadRepositorio especialidadRepositorio){
        this.especialidadRepositorio = especialidadRepositorio;
    }
    
    void agregarEspecialidad(Especialidad especialidad){};
    void actualizarEspecialidad(Especialidad especialidad){};
    Especialidad traerPorID(Long id){
        return new Especialidad( );
    };
    void eliminarEspecialid(Long id){};
    List<Especialidad> traerTodosEspecialidad(){
        return new ArrayList<>();
    };
    
}
