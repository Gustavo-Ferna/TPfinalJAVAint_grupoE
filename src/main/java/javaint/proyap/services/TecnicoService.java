package javaint.proyap.services;


import java.util.ArrayList;
import java.util.List;
import javaint.proyap.entities.Tecnico;
import javaint.proyap.entities.repository.TecnicoRepositorio;


/**
 *
 * @author Nicolas yikef
 */
public class TecnicoService {
    
    private TecnicoRepositorio tecnicoRepositorio;
    
    public TecnicoService(TecnicoRepositorio tecnicoRepositorio){
        this.tecnicoRepositorio = tecnicoRepositorio;
}
    
    public void agregarTecnico(Tecnico tecnico){
        tecnicoRepositorio.agregarTecnico(tecnico);
    };
    
    public void actualizarTecnico(Tecnico tecnico){
    
        tecnicoRepositorio.actualizarTecnico(tecnico);
    };
    Tecnico traerPorID(Long cuitTecnico){
        
        return tecnicoRepositorio.traerPorID(cuitTecnico);
    };
    public void eliminarTecnico(Tecnico tecnico){
        tecnicoRepositorio.eliminarTecnico(tecnico);
    };
    public List<Tecnico> traerTodosTecnicos(){
        
        return tecnicoRepositorio.traerTodosTecnicos();
    };
    
}
