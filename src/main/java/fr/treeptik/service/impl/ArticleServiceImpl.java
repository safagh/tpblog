package fr.treeptik.service.impl;

import java.text.ParseException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.ArticleDAO;
import fr.treeptik.exception.ServiceExeption;
import fr.treeptik.pojo.Article;
import fr.treeptik.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	private ArticleDAO articleDAO;

	@Override
	@Transactional
	public Article create(Article article) throws ServiceExeption {
		return articleDAO.save(article);
	}

	@Override
	@Transactional
	public void removeById(Integer id) throws ServiceExeption {
		articleDAO.removeById(id);
		
	}

	@Override
	public List<Article> findAll() throws ServiceExeption {
		return articleDAO.findAll();
	}

	@Override
	@Transactional
	public Article findByTitre(String titre) {
		return articleDAO.findByTitre(titre);
	}

	@Override
	public List<Article> findArticleComment() throws ServiceExeption {
	
		return articleDAO.findArticleComment();
	}

	@Override
	public List<Article> findArticleDate() throws ServiceExeption, ParseException {
		return articleDAO.findArticleDate();
	}

}
