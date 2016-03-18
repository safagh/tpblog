package fr.treeptik.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Article implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String titre;
	private String chapeau;
	private String contenu;
	
	@Temporal(TemporalType.DATE)
	private Date creationDate;
	private boolean enLigne;
	
	@ManyToOne
	private Categorie categorie;
	
	@OneToMany(mappedBy = "article")
	private List<Commentaire> commentaires;

	@ManyToOne
	private Auteur auteur;
	
	public Article() {
	}

	public Article(String titre, String contenu, boolean enLigne) {
		this.titre = titre;
		this.contenu = contenu;
		this.enLigne = enLigne;
	}



	public Article(String titre, String chapeau, String contenu,
			Date creationDate, boolean enLigne, Categorie categorie,
			Auteur auteur) {
		this.titre = titre;
		this.chapeau = chapeau;
		this.contenu = contenu;
		this.creationDate = creationDate;
		this.enLigne = enLigne;
		this.categorie = categorie;
		this.auteur = auteur;
	}



	@Override
	public String toString() {
		return "Article [id=" + id + ", titre=" + titre + ", chapeau="
				+ chapeau + ", contenu=" + contenu + ", creationDate="
				+ creationDate + ", enLigne=" + enLigne + ", categorie="
				+ categorie + ", auteur=" + auteur + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getChapeau() {
		return chapeau;
	}

	public void setChapeau(String chapeau) {
		this.chapeau = chapeau;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public boolean isEnLigne() {
		return enLigne;
	}

	public void setEnLigne(boolean enLigne) {
		this.enLigne = enLigne;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public List<Commentaire> getCommentaires() {
		return commentaires;
	}



	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((titre == null) ? 0 : titre.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}
	
	
	

}
