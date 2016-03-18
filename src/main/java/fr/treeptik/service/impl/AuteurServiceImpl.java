package fr.treeptik.service.impl;

import java.util.List;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.AuteurDAO;
import fr.treeptik.exception.ServiceExeption;
import fr.treeptik.pojo.Auteur;
import fr.treeptik.service.AuteurService;

@Service
public class AuteurServiceImpl implements AuteurService {
	// initialize DAO Object
	@Autowired
	private AuteurDAO auteurDAO;
	
	

	@Override
	public Auteur findById(Integer id) throws ServiceExeption {
		return auteurDAO.findById(id);
	}

	@Override
	@Transactional
	public Auteur create(Auteur auteur) throws ServiceExeption {

		return auteurDAO.save(auteur);
	}

	@Override
	@Transactional
	public void removeById(Integer id) throws ServiceExeption {
		auteurDAO.removeById(id);

	}

	@Override
	public List<Auteur> findAll() throws ServiceExeption {
		return auteurDAO.findAll();

	}

	@Override
	public Auteur findByEmail(String email) {
		return auteurDAO.findByEmail(email);
	}

	@Override
	public Auteur findAuteurPlusComment() throws ServiceException {
		
		return auteurDAO.findAuteurPlusComment();
	}

}
