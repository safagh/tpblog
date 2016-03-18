package fr.treeptik.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;

import fr.treeptik.dao.CategorieDAO;
import fr.treeptik.pojo.Categorie;

@Repository
public class CategorieJPADAO extends GenericJPADAO<Categorie, Integer> implements CategorieDAO{

	@Override
	public List<Categorie> findCategorieNoArticle() {
		return em
				.createQuery("select c from  Categorie c where c.articles is empty ",
						Categorie.class).getResultList();
	}

	@Override
	public int nombreArticleCategorie(int id)
			 {
				return id;
				
		
//		return em.createQuery("select count(a) from Article a inner join fetch a.categorie c where c.id=:id ",
//						Integer.class).setParameter("categorie_id", id).getSingleResult();
	}

}
