package fr.treeptik.dao.impl;
import org.springframework.stereotype.Repository;

import fr.treeptik.dao.AuteurDAO;
import fr.treeptik.pojo.Auteur;

//comme un dao
@Repository
public class AuteurJPADAO extends GenericJPADAO<Auteur, Integer> implements
		AuteurDAO {

	@Override
	public Auteur findByEmail(String email) {
		return em
				.createQuery("select a from  Auteur a  where email=:email",
						Auteur.class).setParameter("email", email)
				.getSingleResult();
	}

	//trouvé l'auteur avec l'article le plus commenté 
	@Override
	public Auteur findAuteurPlusComment() {
		
		return	em
				.createQuery("SELECT aut FROM Article a inner join a.auteur aut "
						+ "where a.commentaires IS NOT EMPTY order by nom desc",Auteur.class)
				.setMaxResults(1)
				.getSingleResult();
	}

}
