package javaint.proyap.entities.repository;

import java.util.List;
import javaint.proyap.entities.Cliente;

/**
 *
 * @author yikef
 */

public interface ClienteRepositorio {
   
    void agregarCliente(Cliente cliente);
    void actualizarCliente(Cliente cliente);
    Cliente traerPorID(Long cuitCliente);
    void eliminarCliente(Long cuitCliente);
    List<Cliente> traerTodosCliente();
    
}
