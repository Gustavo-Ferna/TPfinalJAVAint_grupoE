
package javaint.proyap.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author yikef
 */
@Data
@Entity
@Table(name= "tb_clientes")
public class Cliente {
    @Id
    private long cuitCliente;
    @Basic
    private String razonSocial;
    private int telefono;
    private String email;
    private String direccion;
    
    
    
}
