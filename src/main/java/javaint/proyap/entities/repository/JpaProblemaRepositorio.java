
package javaint.proyap.entities.repository;

import java.util.List;
import javaint.proyap.entities.Problema;
import javaint.proyap.entities.repository.dao.DAO;

/**
 *
 * @author yikef
 */
public class JpaProblemaRepositorio implements ProblemaRepositorio{
    
    private DAO dao;
    
    public JpaProblemaRepositorio(DAO dao){
        this.dao =dao;
    }

    @Override
    public void agregarServicio(Problema problema) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizarServicio(Problema problema) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Problema traerPorID(Long codigoProblema) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarProblema(Long codigoProblema) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Problema> traerTodosProblema() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
