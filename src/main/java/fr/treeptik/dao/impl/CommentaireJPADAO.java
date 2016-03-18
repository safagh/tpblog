package fr.treeptik.dao.impl;

import java.util.List;
import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Repository;
import fr.treeptik.dao.CommentaireDAO;
import fr.treeptik.pojo.Commentaire;

@Repository
public class CommentaireJPADAO extends GenericJPADAO<Commentaire, Integer> implements CommentaireDAO{

	@Override
	public List<Commentaire> findCommentsArticle(int id) throws ServiceException {
		
		return em.createQuery("select c from Commentaire c ", Commentaire.class).getResultList();
	}
 
}
