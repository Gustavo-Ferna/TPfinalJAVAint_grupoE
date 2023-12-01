
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
@Table(name= "tb_Servicio")
public class Servicio {
    @Id
    private long id;
    @Basic
    private String descripcion;
    
}
