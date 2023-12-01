
package javaint.proyap.services;

import java.util.ArrayList;
import java.util.List;
import javaint.proyap.entities.Problema;
import javaint.proyap.entities.repository.ProblemaRepositorio;

/**
 *
 * @author yikef
 */
public class ProblemaService {
    private ProblemaRepositorio problemaRepositorio;

        //constructor
    public ProblemaService(ProblemaRepositorio problemaRepositorio){
        this.problemaRepositorio = problemaRepositorio;
    }
    
    void agregarProblema(Problema problema){};
    void actualizarServicio(Problema problema){};
    Problema traerPorID(Long codigoProblema){
        return new Problema( );
    };
    void eliminarServicio(Long codigoProblema){};
    List<Problema> traerTodosProblema(){
        return new ArrayList<>();
    };
    
}
