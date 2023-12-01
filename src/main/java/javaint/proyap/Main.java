package javaint.proyap;

import java.util.Scanner;
import javaint.proyap.RRHH.ABMTecnicos;
import static javaint.proyap.RRHH.ABMTecnicos.crearTecnico;
import javaint.proyap.entities.Tecnico;
import javaint.proyap.entities.repository.ClienteRepositorio;
import javaint.proyap.entities.repository.EspecialidadRepositorio;
import javaint.proyap.entities.repository.IncidenteRepositorio;
import javaint.proyap.entities.repository.JpaClienteRepositorio;
import javaint.proyap.entities.repository.JpaEspecialidadRepositorio;
import javaint.proyap.entities.repository.JpaIncidenteRepositorio;
import javaint.proyap.entities.repository.JpaProblemaRepositorio;
import javaint.proyap.entities.repository.JpaServicioRepositorio;
import javaint.proyap.entities.repository.JpaTecnicoRepositorio;
import javaint.proyap.entities.repository.ProblemaRepositorio;
import javaint.proyap.entities.repository.ServicioRepositorio;
import javaint.proyap.entities.repository.TecnicoRepositorio;
import javaint.proyap.entities.repository.dao.DAO;
import javaint.proyap.entities.repository.dao.JpaDAO;
import javaint.proyap.services.ClienteService;
import javaint.proyap.services.EspecialidadService;
import javaint.proyap.services.IncidenteService;
import javaint.proyap.services.ProblemaService;
import javaint.proyap.services.ServicioService;
import javaint.proyap.services.TecnicoService;

/**
 *
 * @author Nicolas
 */

public class Main{
    
    static TecnicoService tecnicoService;
    static ServicioService servicioService;
    static ProblemaService problemaService;
    static IncidenteService incidenteService;
    static EspecialidadService especialidadService;
    static ClienteService clienteService;
    
    public static void main (String[] args){

        iniciar();
        System.out.println("Empezando...");
    }
    
        private static void iniciar(){
            DAO dao = new JpaDAO();
            
            TecnicoRepositorio tecnicoRepositorio = new JpaTecnicoRepositorio(dao);
            tecnicoService = new TecnicoService(tecnicoRepositorio);
            
            ServicioRepositorio servicioRepositorio = new JpaServicioRepositorio(dao);
            servicioService = new ServicioService(servicioRepositorio);
            
            ProblemaRepositorio problemaRepositorio = new JpaProblemaRepositorio(dao);
            problemaService = new ProblemaService(problemaRepositorio);
            
            IncidenteRepositorio incidenteRepositorio = new JpaIncidenteRepositorio(dao);
            incidenteService = new IncidenteService(incidenteRepositorio);
            
            EspecialidadRepositorio especialidadRepositorio = new JpaEspecialidadRepositorio(dao);
            especialidadService = new EspecialidadService(especialidadRepositorio);
            
            ClienteRepositorio clienteRepositorio = new JpaClienteRepositorio(dao);
            clienteService = new ClienteService(clienteRepositorio);
                    
            //otros servicios
            
    
        
            // MENU PRINCIPAL
            Scanner scanner = new Scanner(System.in);
            int opcion;
            do {
                System.out.println("----------|  Menú  |---------- ");
                System.out.println("1. ALTA DE TECNICO");
                System.out.println("2. BAJA DE TECNICO");
                System.out.println("3. MDIFICACION DE TECNICO");
                System.out.println("4. REPORTE DIARIO INCIDENTES");
                System.out.println("5. REPORTE DE TECNICOS CON MAS INCIDENTES");
                System.out.println("6. REPORTE DE TECNICOS CON MAS INCIDENTES POR ESPECIALIDAD");
                System.out.println("7. TECNICO CON MAS INCIDENTES RESUELTOS");
                System.out.println("0. SALIR");
                System.out.print("-> Ingrese opción: ");

                opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("1. ALTA DE TECNICO");

                            ABMTecnicos.crearTecnico();
                            Tecnico tecnico = crearTecnico();
                            tecnicoService.agregarTecnico(tecnico);
                            

                            break;
                        case 2:
                            System.out.println("2. BAJA DE TECNICO");
                            break;
                        case 3:
                            System.out.println("3. MDIFICACION DE TECNICO");
                            break;
                        case 4:
                            System.out.println("4. REPORTE DIARIO INCIDENTES");
                            
                            
                            break;
                        case 5:
                            System.out.println("5. REPORTE DE TECNICOS CON MAS INCIDENTES");
                            break;
                        case 6:
                            System.out.println( "6. REPORTE DE TECNICOS CON MAS INCIDENTES POR ESPECIALIDAD");
                            break;
                        case 7:
                            System.out.println("TECNICO CON MAS INCIDENTES RESUELTOS: "); //+ tecnico.getNombre() + " " + tecnico.getApellido());
                        break;
                        case 0:
                            System.out.println("SALIR");
                            break;
                        default:
                            System.out.println(">>  OPCION INCORRECTA!  <<");
                    }
            } while(opcion != 0);


        
        }
}
