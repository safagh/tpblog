package fr.treeptik.dao;

import fr.treeptik.pojo.Auteur;

public interface AuteurDAO extends GenericDAO<Auteur, Integer> {

	Auteur findByEmail(String email);

	Auteur findAuteurPlusComment();

}
