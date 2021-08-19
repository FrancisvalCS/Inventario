package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Computador;

public class ComputadorDao {

	private static ComputadorDao instance;
	protected EntityManager entityManager;
	
	public static ComputadorDao getInstance() {
		if(instance == null) {
			instance = new ComputadorDao();
		}
		return instance;
	}
	
	public ComputadorDao() {
		entityManager = getEntityManager();
	}
	
	//Obtem pelo id
	public Computador getById(final int id) {
		return entityManager.find(Computador.class, id);
	}
	
	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("inventario");
		if(entityManager == null) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
	
	//Persistir no banco
	public void persist(Computador pc) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(pc);
			entityManager.getTransaction().commit();
		}catch(Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
	
	//remove do banco
	public void remove(Computador pc) {
		try {
			entityManager.getTransaction().begin();
			entityManager.remove(pc);
			entityManager.getTransaction().commit();
		}catch(Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
	
	//remover pelo id
	public void removeById(final int id) {
		try {
			Computador pc = getById(id);
			remove(pc);
		}catch(Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
}
