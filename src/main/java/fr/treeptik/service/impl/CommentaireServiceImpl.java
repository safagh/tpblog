package fr.treeptik.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import fr.treeptik.dao.CommentaireDAO;
import fr.treeptik.exception.ServiceExeption;
import fr.treeptik.pojo.Commentaire;
import fr.treeptik.service.CommentaireService;

@Service
public class CommentaireServiceImpl implements CommentaireService{
	@Autowired
	private CommentaireDAO commentaireDAO;

	@Override
	@Transactional
	public Commentaire create(Commentaire commentaire) throws ServiceExeption {
		// TODO Auto-generated method stub
		return commentaireDAO.save(commentaire);
	}

	@Override
	@Transactional
	public void removeById(Integer id) throws ServiceExeption {
		commentaireDAO.removeById(id);
		
	}

	@Override
	public List<Commentaire> findAll() throws ServiceExeption {
		// TODO Auto-generated method stub
		return commentaireDAO.findAll();
	}

	@Override
	public List<Commentaire> findCommentsArticle(int id)
			throws ServiceExeption {
		return commentaireDAO.findCommentsArticle(id);
		
	}

}
