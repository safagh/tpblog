package fr.treeptik.service;

import java.util.List;


import org.hibernate.service.spi.ServiceException;

import fr.treeptik.exception.ServiceExeption;
import fr.treeptik.pojo.Auteur;

public interface AuteurService {

	Auteur findById(Integer id) throws ServiceExeption;
	Auteur create(Auteur auteur) throws ServiceExeption;
	void removeById(Integer id) throws ServiceExeption;
	public List<Auteur> findAll() throws ServiceExeption;
	Auteur findByEmail(String email);
	Auteur findAuteurPlusComment() throws ServiceException;
	

}
