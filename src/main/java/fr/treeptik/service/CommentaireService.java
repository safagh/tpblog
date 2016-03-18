package fr.treeptik.service;

import java.util.List;
import fr.treeptik.exception.ServiceExeption;
import fr.treeptik.pojo.Commentaire;


public interface CommentaireService {
	
	Commentaire create(Commentaire commentaire) throws ServiceExeption;
	void removeById(Integer id) throws ServiceExeption;
	public List<Commentaire> findAll() throws ServiceExeption;
	List<Commentaire> findCommentsArticle(int id)  throws ServiceExeption;
}
