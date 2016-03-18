package fr.treeptik.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import javax.persistence.TemporalType;
import org.springframework.stereotype.Repository;
import fr.treeptik.dao.ArticleDAO;
import fr.treeptik.pojo.Article;


@Repository
public class ArticleJPADAO extends GenericJPADAO<Article, Integer> implements
		ArticleDAO {

	
	


	@Override
	public Article findByTitre(String titre) {
		return em
				.createQuery("select a from  Article a where titre=:titre",
						Article.class).setParameter("titre", titre)
				.getSingleResult();

	}

	@Override
	public List<Article> findArticleComment() {
		
		return em.createQuery("SELECT a FROM Article a WHERE a.commentaires IS NOT EMPTY",Article.class)
		.getResultList();
		
		
	}

	@Override
	public List<Article> findArticleDate() throws ParseException {
		return em.createQuery("SELECT a FROM Article a WHERE a.creationDate BETWEEN :beginDate AND CURRENT_DATE"
				+ " ORDER BY a.creationDate ASC",Article.class)
		.setParameter("beginDate", SimpleDateFormat.getDateInstance(SimpleDateFormat.SHORT, Locale.FRANCE).parse("01/01/16"),TemporalType.DATE)
		.getResultList();
		
	}
}
