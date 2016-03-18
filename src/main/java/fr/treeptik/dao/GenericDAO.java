package fr.treeptik.dao;

import java.util.List;

// c une classe qui manipule les CRUD on lui passe un generic
public interface GenericDAO<T, Pk> {

	// insert update
	T save(T entite);

	// remove supprime un objet attaché
	void removeById(Pk id);

	T findById(Pk id);

	List<T> findAll();
}