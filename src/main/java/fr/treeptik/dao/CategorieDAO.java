package fr.treeptik.dao;
import java.util.List;


import fr.treeptik.pojo.Categorie;

public interface CategorieDAO extends GenericDAO<Categorie, Integer>{
	List<Categorie> findCategorieNoArticle();
	int nombreArticleCategorie(int id);
}
