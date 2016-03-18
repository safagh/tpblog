package fr.treeptik.service;

import java.text.ParseException;
import java.util.List;

import fr.treeptik.exception.ServiceExeption;
import fr.treeptik.pojo.Article;

public interface ArticleService {

	//Article findById(Integer id) throws ServiceExeption;
	Article create(Article article) throws ServiceExeption;
	void removeById(Integer id) throws ServiceExeption;
	public List<Article> findAll() throws ServiceExeption;
	Article findByTitre(String titre) throws ServiceExeption;
	public List<Article> findArticleDate() throws ServiceExeption, ParseException;
	public List<Article> findArticleComment() throws ServiceExeption;
	
}
