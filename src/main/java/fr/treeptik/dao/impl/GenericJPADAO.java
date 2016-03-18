package fr.treeptik.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.treeptik.dao.GenericDAO;

public class GenericJPADAO<T, Pk> implements GenericDAO<T, Pk> {

	// pour que employeJPADAO l'utilise protected

	@PersistenceContext
	protected EntityManager em;
	protected Class<T> type;

	@SuppressWarnings("unchecked")
	public GenericJPADAO() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass()
				.getGenericSuperclass();
		this.type = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
	}

	public GenericJPADAO(EntityManager em, Class<T> type) {
		super();
		this.em = em;
		this.type = type;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public Class<T> getType() {
		return type;
	}

	public void setType(Class<T> type) {
		this.type = type;
	}

	public GenericJPADAO(Class<T> type) {
		this.type = type;
	}

	public T save(T entite) {
		// code qui va marcher pour tout type d'entité qu'il faudra préciser en
		// dessous
		return em.merge(entite);
	}

	public void removeById(Pk id) {
		// on considere que ttte les classes ont une colonne id
		em.createQuery("delete from " + type.getSimpleName() + " where id=:id")
				.setParameter("id", id).executeUpdate();

	}

	public List<T> findAll() {
		System.out.println(type.getSimpleName());
		return em.createQuery("Select e from " + type.getSimpleName() + " e",
				type).getResultList();
	}

	@Override
	public T findById(Pk id) {
		return em.find(type, id);
	}

}
