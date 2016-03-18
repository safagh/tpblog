package fr.treeptik.service.impl;

import java.util.List;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import fr.treeptik.dao.CategorieDAO;
import fr.treeptik.exception.ServiceExeption;
import fr.treeptik.pojo.Categorie;
import fr.treeptik.service.CategorieService;

@Service
public class CategorieServiceImpl implements CategorieService{
	
	@Autowired
	private CategorieDAO categorieDAO;

	

	@Override
	@Transactional
	public Categorie create(Categorie categorie) throws ServiceExeption {
		// TODO Auto-generated method stub
		return categorieDAO.save(categorie);
	}

	@Override
	@Transactional
	public void removeById(Integer id) throws ServiceExeption {
		categorieDAO.removeById(id);
		
	}

	@Override
	public List<Categorie> findAll() throws ServiceExeption {
		return categorieDAO.findAll();
	}

	@Override
	public List<Categorie> findCategorieNoArticle() throws ServiceException {
		return categorieDAO.findCategorieNoArticle();
	}

	@Override
	public int nombreArticleCategorie(int id)
			throws ServiceException {
		// TODO Auto-generated method stub
		return categorieDAO.nombreArticleCategorie(id);
	}

}
