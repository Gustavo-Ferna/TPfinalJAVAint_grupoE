
package javaint.proyap.services;

import java.util.ArrayList;
import java.util.List;
import javaint.proyap.entities.Cliente;
import javaint.proyap.entities.repository.ClienteRepositorio;

/**
 *
 * @author yikef
 */
public class ClienteService {
    
    private ClienteRepositorio clienteRepositorio;
    //constructor
    public ClienteService(ClienteRepositorio clienteRepositorio){
        this.clienteRepositorio = clienteRepositorio;
    }
    
    void agregarCliente(Cliente cliente){};
    void actualizarCliente(Cliente cliente){};
    Cliente traerPorID(Long cuitCliente){
        return new Cliente( );
    };
    void eliminarCliente(Long cuitCliente){};
    List<Cliente> traerTodosCliente(){
        return new ArrayList<>();
    };
    
    
}
