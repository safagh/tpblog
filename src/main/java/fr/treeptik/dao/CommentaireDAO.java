package fr.treeptik.dao;

import java.util.List;

import org.hibernate.service.spi.ServiceException;
import fr.treeptik.pojo.Commentaire;

public interface CommentaireDAO extends GenericDAO<Commentaire, Integer> {
	List<Commentaire> findCommentsArticle(int id) throws ServiceException;

}
