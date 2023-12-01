
package javaint.proyap.entities;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
/**
 *
 * @author Nicolas
 */
@Data
@Entity
@Table(name= "tb_tecnico" )
public class Tecnico {
    
@Id
private long cuitTecnico;
@Basic
private String razonSocial;
private String email;
private int telefonoWSP;
private Boolean disponible;


    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Especialidad> especialidades;

    
}
