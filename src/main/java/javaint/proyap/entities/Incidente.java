package javaint.proyap.entities;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author yikef
 */
@Data
@Entity
@Table(name= "tb_Incidente" )
public class Incidente {
    
    @Id
    private long codigoIncidente;
    @Basic
    private String descripcionIncidente;
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    private Date diasAgregados;
    
    
}
