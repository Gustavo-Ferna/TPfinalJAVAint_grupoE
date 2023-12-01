package javaint.proyap.entities.repository;


import java.util.List;
import javaint.proyap.entities.Tecnico;
import javaint.proyap.entities.repository.dao.DAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


/**
 *
 * @author Nicolas y yikef
 */
public class JpaTecnicoRepositorio implements TecnicoRepositorio{
    
    private DAO dao;
    
    public JpaTecnicoRepositorio(DAO dao){
        this.dao =dao;
    }

    @Override
    public void agregarTecnico(Tecnico tecnico) {
        
        System.out.println("salvando el tecnico desde la base");

        EntityManager entityManager = dao.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(tecnico);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    
    
    }

    @Override
    public void actualizarTecnico(Tecnico tecnico) {
        System.out.println("actualizando el tecnico desde la base");

        EntityManager entityManager = dao.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.merge(tecnico);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

    }

    @Override
    public Tecnico traerPorID(Long cuitTecnico) {

        System.out.println("trayendo el Tecnico desde la base");
        EntityManager entityManager = dao.getEntityManager();
        try {
            return entityManager.find(Tecnico.class, cuitTecnico);
        } finally {
            entityManager.close();
        }
    }

    @Override
    public void eliminarTecnico(Tecnico tecnico) {
        System.out.println("eliminando al tecnico desde la base");

        EntityManager entityManager = dao.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.remove(tecnico);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }


    }

    @Override
    public List<Tecnico> traerTodosTecnicos() {

        System.out.println("trayendo TODOS el Tecnico desde la base");
        EntityManager entityManager = dao.getEntityManager();
        try {
            return entityManager.createQuery("SELECT e FROM Tecnico e"). getResultList();
        } finally {
            entityManager.close();
        }
    }
    
    
    
}
