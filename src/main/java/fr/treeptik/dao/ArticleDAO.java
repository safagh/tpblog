package fr.treeptik.dao;

import java.text.ParseException;
import java.util.List;

import fr.treeptik.pojo.Article;


public interface ArticleDAO extends GenericDAO<Article, Integer>{
	
	//public List<Article> findByAuteur(String auteur);

	Article findByTitre(String titre);
	public List<Article> findArticleComment();
	public List<Article> findArticleDate() throws ParseException;
	
}
