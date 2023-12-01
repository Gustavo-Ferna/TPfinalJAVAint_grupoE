
package javaint.proyap.RRHH;

import static java.lang.Boolean.TRUE;
import javaint.proyap.entities.Tecnico;
import java.util.Scanner;


/**
 *
 * @author yikef
 */
public class ABMTecnicos {
    
    
    //ALTA TECNICO
    
    
    
    public static Tecnico crearTecnico(){

        Scanner sc = new Scanner (System.in); 
        Tecnico tecnico = new Tecnico();
        
        System.out.println("Ingrese el CUIL del técnico:");
        long cuit = sc.nextLong();
        tecnico.setCuitTecnico(cuit);
                        
        System.out.println("ingrese RAZON SOCIAL del tecnico");
        String razonSocial = sc.next(); 
        tecnico.setRazonSocial(razonSocial);
        
        System.out.println("ingrese CONTACTO WSP del tecnico");
        int telefonoWSP = sc.nextInt (); 
        tecnico.setTelefonoWSP(telefonoWSP);
        
        System.out.println("ingrese CONTACTO EMAIL del tecnico");
        String email = sc.next();         
        tecnico.setEmail(email);
                
        tecnico.setDisponible(TRUE);
        
    return tecnico;
    }

   // public ABMTecnicos() {
   // }
    
    
}
