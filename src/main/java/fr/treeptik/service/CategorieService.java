package fr.treeptik.service;

import java.util.List;
import fr.treeptik.exception.ServiceExeption;
import fr.treeptik.pojo.Categorie;


public interface CategorieService {
	
	Categorie create(Categorie categorie) throws ServiceExeption;
	void removeById(Integer id) throws ServiceExeption;
	public List<Categorie> findAll() throws ServiceExeption;
	List<Categorie> findCategorieNoArticle()  throws ServiceExeption;
	int nombreArticleCategorie(int id);
	

}
